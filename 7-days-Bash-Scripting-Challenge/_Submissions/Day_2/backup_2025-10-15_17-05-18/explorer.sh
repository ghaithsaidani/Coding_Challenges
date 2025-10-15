#!/bin/bash

echo -e "\e[32mWelcome to the Interactive File and Directory Explorer!\e[0m"

echo Files and Directories in the current Path:

for item in *; do
    echo "- $item ($(du -sh $item | awk '{print $1}'))"
done


while true; do
    read -p "Enter a line of text (Press Enter without text to exit):" text
    if [[ -z $text ]]; then
     condition=true
     echo Exiting the Interactive Explorer. Goodbye!
     exit 0
    fi
    echo Character Count: ${#text}
done


