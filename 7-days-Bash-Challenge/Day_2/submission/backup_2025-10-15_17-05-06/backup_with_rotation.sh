#!/bin/bash

DIR=$1

[[ -z $DIR || ! -d $DIR ]] && echo "You need to enter an existant folder name!" && exit 1
NumBackupDirs=$(find $DIR -type d -name "backup*" | wc -l)
if [[ $NumBackupDirs -lt 3 ]]; then
    for (( i=0; i<$((3 - NumBackupDirs)); i++ )); do
        sec=$(date +%S)
        folderName=backup_$(date +"%Y-%m-%d_%H-%M-")$sec
        while [[ -d "$DIR/$folderName" ]]; do
            sec=$((sec + 1))
            folderName=backup_$(date +"%Y-%m-%d_%H-%M-")$sec
        done
        mkdir $DIR/$folderName
        rsync -a --exclude "backup*/" $DIR $DIR/$folderName
    done
else
    rm -rf $(ls -ld backup* | grep '^d' | head -1 | awk '{print $9}')
    folderName=backup_$(date +"%Y-%m-%d_%H-%M-%S")
    mkdir $DIR/$folderName
    rsync -a --exclude "backup*/" $DIR $DIR/$folderName
fi
