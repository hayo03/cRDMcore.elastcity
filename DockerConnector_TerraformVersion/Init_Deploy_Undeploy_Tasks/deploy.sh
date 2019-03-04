#!/bin/bash

####################################### " Deploy Task " ##################################################

cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks

public_dns=$(terraform output | grep "master.public_dns_ip"  | cut -d ' ' -f 3) 

echo $public_dns

cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks/InstanceAccessKeys/
sudo chmod 400 privateKey.pem


scp  -oStrictHostKeyChecking=no -i privateKey.pem /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks/app-compose.yml ubuntu@$public_dns:~

ssh -i  "privateKey.pem"  ubuntu@$public_dns 'sudo docker node ls; sudo docker stack deploy -c app-compose.yml myapp; sudo docker service ls'









