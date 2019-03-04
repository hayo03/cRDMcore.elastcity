#!/bin/bash

####################################### " Undeploy Task " ##################################################
cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks


terraform destroy -lock=false --force
