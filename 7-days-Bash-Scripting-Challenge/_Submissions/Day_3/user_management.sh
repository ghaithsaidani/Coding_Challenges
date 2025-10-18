#!/bin/bash

OPTION=$1

create_user(){
    read -p "Enter the new username: " username
    if id -u $username >/dev/null 2>&1; then
        echo Error: The username $username already exists. Please choose a different username.
        exit 1
    else
        read -p "Enter the password for $username: " password
        sudo useradd -m $username && echo $password | sudo passwd --stdin $username
        echo "User account '$username' created successfully."
    fi
}

delete_user(){
    read -p "Enter the username to delete: " username
    if id -u $username >/dev/null 2>&1; then
        sudo userdel -r $username
        echo "User account '$username' deleted successfully."
    else
        echo "Error: The username '$username' does not exist. Please enter a valid username."
        exit 1
    fi
}

list_users(){
    echo User account on the system:
    awk -F: '{printf "- %s (UID: %d)\n", $1,$3}' /etc/passwd
}

reset_user_password(){
    read -p "Enter the username to reset password: " username
    if id -u $username >/dev/null 2>&1; then
        read -p "Enter the new password for $username: " password
        echo $password | sudo passwd --stdin $username && echo "Password for user '$username' reset successfully."
    else
        echo "Error: The username '$username' does not exist. Please enter a valid username."
        exit 1
    fi
}

case $OPTION in
    "-c" | "--create")
        create_user
        ;;
    "-d" | "--delete")
        delete_user
        ;;
    "-r" | "--reset")
        reset_user_password
        ;;
    "-l" | "--list")
        list_users
        ;;
    *)
        echo -e "Usage: ./user_management.sh [OPTIONS]\nOptions:\n   -c, --create\t\tCreate a new user account.\n   -d, --delete\t\tDelete an existing user account.\n   -r, --reset\t\tReset password for an existing user account.\n   -l, --list\t\tLista all user accounts on the system.\n   -h, --help\t\tDisplay this help and exit."
        ;;
esac
