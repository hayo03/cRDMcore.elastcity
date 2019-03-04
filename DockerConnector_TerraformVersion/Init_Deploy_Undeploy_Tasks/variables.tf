############################################################################
#  Security Credentials  # Access Keys (Access Key ID and Secret Access Key)
############################################################################ 
variable "access_key" {

	description = " The AWS access key"
	########### Default value ##########
	#default = "AKIAIIVEOEWN34PRZ2DQ"

}
variable "secret_key" {
	
	description = " The AWS secret key"
	########### Default value ##########
	#default = "AX0B2pkmBCnsUkqXC9xoUsrLLyiH+baMQA4tguQf"
}
variable "region" {

	description = "AWS region on which we will setup the swarm cluster: Irelande"
	default = "eu-west-1"

}
variable "ami"  {

	description = "Amazon Linux AMI: Ubuntu Server 16.04 LTS"
	default = "ami-f90a4880"

}

variable "instance_type" {

	description = "Instance type"
	default = "t2.micro"

}
variable "nb_Worker" {
	
	description = " number of the workers (from input file)"
	########### Default value ##########
	#default = 6
}


#Path to the private key file
variable "key_path" {
	
	default = "private_key.pem"
	
}
variable "password" {
	
	default = "&123p"
	
}
