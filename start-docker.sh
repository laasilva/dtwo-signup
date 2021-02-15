#!/bin/sh
# color def

GREEN='\033[0;32m'
RED='\033[0;31m'
BLUE='\033[0;34m'
CYAN='\033[0;36m'
YELLOW='\033[1;33m'
END_COLOR='\033[0m' 

echo "${RED}Stopping previously running instances...${END_COLOR}\n"
sudo docker stop dtwo-signup
echo "\n${BLUE}Starting docker container......${END_COLOR}\n"
sudo docker start dtwo-signup
echo "\n${CYAN}Running mvn commands on container.........${END_COLOR}\n"
sudo docker exec -d dtwo-signup bash ./start.sh
echo "\n${GREEN}dtwo-signup started successfully!${END_COLOR}\n"
sudo docker ps
