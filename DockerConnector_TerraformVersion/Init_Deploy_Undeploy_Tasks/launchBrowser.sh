#!/bin/bash


cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks

public_dns=$(terraform output | grep "master.public_dns_ip"  | cut -d ' ' -f 3) 
public_ip=$(terraform output | grep "master.public_ip"  | cut -d ' ' -f 3) 

echo $public_ip


#Back-end
x-www-browser http://$public_dns:8080






