#!/bin/bash

echo "========================================="
echo "  RIDE DISPATCH CLIENT - STARTING"
echo "========================================="
echo ""

# Create bin directory if it doesn't exist
mkdir -p bin

# Compile client files (only Client.java and Protocol.java needed)
echo "Compiling client files..."
javac -d bin src/main/network/Client.java src/main/network/Protocol.java

if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo ""
    echo "Starting client..."
    echo "You will be prompted for server IP and role."
    echo ""
    echo "========================================="
    echo ""
    
    # Run the client
    java -cp bin network.Client
else
    echo "Compilation failed! Please fix errors and try again."
    exit 1
fi
