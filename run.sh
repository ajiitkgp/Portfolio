#!/bin/bash

# Load environment variables from .env.local
if [ -f .env.local ]; then
    export $(cat .env.local | grep -v '^#' | xargs)
fi

echo "Starting Portfolio Application..."
echo "==============================================="
echo "Environment variables loaded from .env.local"
echo "The application will be available at:"
echo "http://localhost:8080"
echo "==============================================="
echo ""

mvn spring-boot:run
