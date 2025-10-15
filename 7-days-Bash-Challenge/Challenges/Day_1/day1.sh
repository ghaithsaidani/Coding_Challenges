#!/bin/bash


# Task 1 & 2: This script will show a text on the console saying Hello World!
echo Hello World

# Task 3: Variables
FirstName=Ghaith
LastName=Ghaith
Age=25

# Task 4: Using Variables
Num1=10
Num2=13

echo Them sum of the 2 variables is $((Num1 + Num2))

# Task 5: Using Built-in Variables
echo My Home Directory is - $HOME
echo The executed commands are located in - $PATH
echo My current Location - $PWD

# Task 6: Wildcards
echo Listing all the files with sh extensions: $(ls *sh)
