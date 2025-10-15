#!/bin/bash

DIR=$1

[[ -z $DIR || ! -d $DIR ]] && echo "You need to enter an existant folder name!" && exit 1
NumBackupDirs=$(find $DIR -type d -name "backup*" | wc -l)
if [[ $NumBackupDirs -le 3 ]]; then
    for (( i=0; i<3; i++ )); do
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
    ls -ld backup* | grep '^d' | sort
fi
