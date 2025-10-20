#!/bin/bash

[[ $# -ne 1 ]] && echo "You need to enter (& only) the path of the Log File!" && exit 1

file_path=$1
[[ ! -f $file_path ]] && echo "Log file not found!" && exit 1

report_filename=summary_report_$(date +%Y-%m-%d_%H-%M-%S)
error_count=$(sudo grep -e "FAILED" -e "ERROR" $file_path | wc -l)
archive_folder="/var/summaries"

critical_events(){
    cat -n $file_path | grep "CRITICAL"
}

# bad method because it will scan the file for each error message (-i here for ignoring case)
top_errors(){
    error_messages=("ERROR" "CRITICAL" "WARNING" "INFO" "DEBUG")
    for msg in "${error_messages[@]}"; do
        echo -e "\t$msg: $(grep -i $msg $file_path | wc -l) occurences"
    done
}

# this is the good one for top errors
top_errors_right(){
    declare -A error_messages

    # Extract all lines with "ERROR" (case-insensitive)
    while IFS= read -r line; do
        # Extract the actual error message (assuming the first 2 fields are timestamp/severity)
        error_msg=$(awk '{for (i=3; i<=NF; i++) printf $i " "; print ""}' <<< "$line")
        ((error_messages["$error_msg"]++))
    done < <(grep -i "ERROR" "$file_path")

    # If no errors found
    if [[ ${#error_messages[@]} -eq 0 ]]; then
        echo -e "\tNo ERROR messages found."
        return
    fi

    # Sort by count (descending) and print top 5
    for msg in "${!error_messages[@]}"; do
        printf "%s\t%d\n" "$msg" "${error_messages[$msg]}"
    done | sort -k2 -nr | head -n 5 | awk '{printf "\t- %s (%d occurrences)\n", $1, $2}'
}

summary_report(){
    echo "Date of analysis: $(date)" >> $report_filename
    echo "Log file name: $(basename "$file_path")" >> $report_filename
    echo "Log file path: $(realpath $file_path)" >> $report_filename
    echo "Total lines processed: $(wc -l $file_path | awk '{print $1}')" >> $report_filename
    echo Total error count: $error_count >> $report_filename
    echo "Top 5 errors:" >> $report_filename
    top_errors_right >> $report_filename
    echo -e "Critical events:\n$(critical_events)" >> $report_filename
}

move_summary_file(){
    if [[ ! -d $archive_folder ]]; then
        sudo mkdir $archive_folder
    fi

    sudo mv $report_filename $archive_folder
}

summary_report
move_summary_file
echo summary report generated and you can find it in $archive_folder with the name of $report_filename
