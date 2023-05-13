#!/bin/bash

# Clear the console
clear

# Get the latest .java file in the current directory
my_file=$(ls -t *.java | head -n1)

# Compile the Java code
javac $my_file

# Extract the filename (without extension) from the compiled .class files
my_e=$(ls -t *.class | head -n1)
my_exec=${my_e%.*}
# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful"

    # Run the Java program
    java $my_exec

	rm ${my_exec}.class
else
    echo "Compilation failed"
fi
