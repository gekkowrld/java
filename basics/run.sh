#!/bin/bash

clear

my_file=$(ls -t *.java | head -n1)

javac $my_file

my_e=$(ls -t *.class | head -n1)
my_exec=${my_e%.*}
if [ $? -eq 0 ]; then
    java $my_exec

	rm ${my_exec}.class
else
    echo "Compilation failed"
fi
