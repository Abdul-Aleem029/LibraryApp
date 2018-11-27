#!/bin/bash
git_url=https://github.com/Abdul-Aleem029/LibraryApp.git
clone_path=/tmp/libraryApp
cfgfile_path=/tmp/libraryApp/LibraryApp/config
haproxy_path=/etc/haproxy


yum -y install git

echo "installed git"

sleep 5

cd /etc/haproxy

sudo rm -rf haproxy.cfg


#Ensure to clear the existing files from the Clone Path

sleep 2

echo "Path in which the Master Branch will be Cloned is $clone_path"
rm -rf $clone_path

#Create a directory to which the Branch has to be cloned from GIT

echo "Make Directory for Clone"

mkdir -p $clone_path

sleep 2

#Clone the GIT Repo to your Clone Path

cd $clone_path

sleep 2
git clone $git_url

sleep 5

#Providing full permissions fir the Clone directory
echo "Giving full permissions to Clone Directory"

chmod -R 777 $clone_path

cd $cfgfile_path

sleep 5

cp *.cfg $haproxy_path

echo  "downloaded the haproxy config file inside haproxy folder"

sleep 2

service haproxy start

sleep 2

service haproxy status

echo "Started"

exit
