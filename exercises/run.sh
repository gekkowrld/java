#!/bin/bash

clear

my_file=$(ls -t *.java | head -n1)

javac $my_file

if [ $? -eq 0 ]; then
	my_e=$(ls -t *.class | head -n1)
	my_exec=${my_e%.*}
	if [ $? -eq 0 ]; then
	    java $my_exec

		rm *.class
	else
	    echo "Compilation failed"
	fi
fi
