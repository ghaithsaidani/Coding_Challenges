#!/bin/bash

[[ $# -eq 0 ]] && \
    echo -e "You need to enter a process name when executing script like that:\n$0 <process_name>" && \
    exit 1
is_running(){
    if systemctl status $1 >/dev/null 2>&1; then
        if [[ $(systemctl is-active $1) == "active" ]]; then
            echo "$1 is running."
        else
            echo "$1 is not running."
        fi
    else
        echo "$1 not found"
    fi
}

is_running $1