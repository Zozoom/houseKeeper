#!/bin/bash  
#***********************************
# JDK/JRE install
#***********************************
echo "Get updates..."
apt-get update
echo "Done with updates."
echo "JRE install..."
apt-get install default-jre -y
echo "Done with JRE."
echo "JDK install..."
apt-get install default-jdk -y
echo "Done with JDK."
#***********************************
# JAVA8
#***********************************
echo "Add JAVA8 repository"
add-apt-repository ppa:webupd8team/java
echo "Get updates..."
apt-get update
echo "Done with updates."
echo "Oracle Java8 install..."
apt-get install oracle-java8-installer -y
echo "Done with Oracle Java8."
#***********************************
# End of the Script
#***********************************
echo "Press any key to continue..."
read -n1 -t10 any_key