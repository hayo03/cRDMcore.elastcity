#!/bin/bash

####################################### " Init Task " ##################################################

cd /home/hayetto/Desktop/DockerConnector_MonitoringTask/Init_Deploy_Undeploy_Tasks

terraform init 

############ Method 1 :  Defining default values of varibales ###################
#terraform plan

############ Method 1 :  Loading variables from command line flags ###################
#terraform plan -var 'access_key=$access_key' -var 'secret_key=$secret_key' 

############ Method 3 :  Loading variables from a file ###################
sudo terraform plan -var-file="terraform.tfvars"  


#Apply terraform plan without interactive mode: auto-approve 
terraform apply  -auto-approve  






