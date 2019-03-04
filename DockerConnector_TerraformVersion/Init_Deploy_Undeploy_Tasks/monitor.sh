#!/bin/bash

####################################### " Monitoring Task " ##################################################

cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks

public_dns=$(terraform output | grep "master.public_dns_ip"  | cut -d ' ' -f 3) 

echo $public_dns

cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks/InstanceAccessKeys/

sudo chmod 400 privateKey.pem


scp -r /home/hayetto/Desktop/DockerConnector_MonitoringTask/MonitoringTask ubuntu@$public_dns:/home/ubuntu


ssh -i  "privateKey.pem"  ubuntu@$public_dns 'sudo  ls -l; cd /home/ubuntu/MonitoringTask; sudo docker stack deploy -c docker-compose.yml myapp; sudo docker service ls'







