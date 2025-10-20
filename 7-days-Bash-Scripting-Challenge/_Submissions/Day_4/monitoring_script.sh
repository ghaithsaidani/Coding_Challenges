#!/bin/bash

# [[ $# -eq 0 ]] && \
#     echo -e "You need to enter a process name when executing script like that:\n$0 <process_name>" && \
#     exit 1

start_service(){
    read -p "Do you want to start $1? (Y/N):" choice
    if [[ $choice == 'y' || $choice == 'Y' ]]; then
        sudo systemctl start $1
        if [[ $(systemctl is-active $1) == "active" ]]; then
            echo "$1 is now running."
        else
            echo "Error: unable to run $1 process"
        fi
    fi
}

monitor_service(){
    echo -e "---- Monitor a Specific Service ----"
    read -p "Enter the name of the service to monitor: " process
    echo "---- $process status ----"
    if [[ $(systemctl is-enabled $process) != "not-found" ]]; then
        if [[ $(systemctl is-active $process) == "active" ]]; then
            while true; do
                echo "$process is running."
                echo Press Enter to continue...
                read -t 3 -r input
                if [[ $? -eq 0 ]]; then
                    break
                fi
            done
        else
            echo "$process is not running."
            start_service $process
        fi
    else
        echo "$process not found"
    fi
}

system_metrics(){
    echo -e "---- System Metrics ----\n"
    while true; do
        cpu_usage=$(top -bn1 | grep "Cpu(s)" | awk '{print 100 - $8"%"}')
        mem_usage=$(top -b -n 1 | grep "MiB Mem" | awk '{print int(($8 / $4) * 100)}')
        disk_usage=$(df --output=pcent / | tail -n 1)
        echo -e "CPU Usage: $cpu_usage\
        Mem Usage: $mem_usage\
        Disk usage: $disk_usage\n"
        echo "Press enter to continue..."
        read -t 3 -r input
        if [[ $? -eq 0 ]];  then
            break
        fi
    done
}

# system_metrics

echo "---- Monitoring Metrics Script ----"
echo -e "1. View System Metrics\n2. Monitor a Specific Service\n3. Exit"
read choice
while [[ $choice -le 3 && $choice -ge 1 ]]; do
    case $choice in
        1)
            system_metrics;;
        2)
            monitor_service;;
        3)
            echo -e "Goodbye 😊"
            exit 0;;
        *)
            echo "Error: Invalid option. Please choose a valid option (1, 2, or 3).";;
    esac
    echo -e "\n---- Monitoring Metrics Script ----"
    echo -e "1. View System Metrics\n2. Monitor a Specific Service\n3. Exit"
    read choice
done

# is_running $1

# Memory usage: top -b -n 1 | grep "MiB Mem" | awk '{print int(($8 / $4) * 100)}'
# cpu usage: top -bn1 | grep "Cpu(s)" | awk '{print 100 - $8"%"}'
# Disk usage: df --output=pcent / | tail -n 1
