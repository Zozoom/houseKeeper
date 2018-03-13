#!/bin/bash  
#***********************************
# Get Updates
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
sleep 3
#***********************************
# Get Upgrades
#***********************************
echo "\nGet upgrade...\n"
apt-get upgrade -y
echo "\nDone with upgrade.\n"
sleep 3
#***********************************
# JDK/JRE install
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
sleep 3
echo "\nJRE install...\n"
apt-get install default-jre -y
echo "\nDone with JRE.\n"
sleep 3
echo "\nJDK install...\n"
apt-get install default-jdk -y
echo "\nDone with JDK.\n"
sleep 3
#***********************************
# JAVA8
#***********************************
echo "\nAdd JAVA8 repository\n"
add-apt-repository ppa:webupd8team/java
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
echo "\nOracle Java8 install...\n"
apt-get install oracle-java8-installer -y
echo "\nDone with Oracle Java8.\n"
sleep 3
#***********************************
# MAVEN
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
echo "\nMAVEN install...\n"
apt-get maven -y
echo "\nDone with MAVEN.\n"
sleep 3
#***********************************
# GITHUB
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
echo "\nGITHUB install...\n"
apt-get git -y
echo "\nDone with GITHUB.\n"
sleep 3
#***********************************
# MC
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
echo "\nMC install...\n"
apt-get mc -y
echo "\nDone with MC.\n"
sleep 3
#***********************************
# NODEJS
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
echo "\nNODEJS install...\n"
apt-get nodejs -y
echo "\nDone with NODEJS.\n"
sleep 3
#***********************************
# NPM
#***********************************
echo "\nGet updates...\n"
apt-get update
echo "\nDone with updates.\n"
echo "\nNPM install...\n"
apt-get npm -y
echo "\nDone with NPM.\n"
sleep 3
#***********************************
# End of the Script
#***********************************
read -t20 -p "Press any key to continue or CTRL-C to abort..." 
