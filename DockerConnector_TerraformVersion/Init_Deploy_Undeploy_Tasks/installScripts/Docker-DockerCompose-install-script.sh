#!/bin/bash


####################################### " Install docker & install docker-compose " ##################################################

sudo apt-get update -y
#sudo apt-get upgrade -y

### install python-minimal
sudo apt-get install python-minimal -y


# install docker-engine
curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
sudo apt-get update
sudo apt-get install -y docker-ce
echo "Docker installed..."
sudo usermod -aG docker ${whoami}
sudo systemctl enable docker
sudo systemctl start docker


echo "########################################"
echo "########################################"


#test Docker installation
sudo docker run hello-world
sudo docker --version

echo "########################################"
echo "########################################"


# install docker-compose
echo "##################### install docker-compose ########################"
sudo curl -L https://github.com/docker/compose/releases/download/1.16.1/docker-compose-`uname -s`-`uname -m` -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
docker-compose --version
echo "docker-compose installed..."


echo "########################################"
echo "########################################"




