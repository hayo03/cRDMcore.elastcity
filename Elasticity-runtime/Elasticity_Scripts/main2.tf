
# AWS # Setup the cloud provider "Amazon Web Services" (AWS)
provider "aws" {

	access_key = "${var.access_key}"
	secret_key = "${var.secret_key}"
	region = "${var.region}"
}

# Instances # Setup of docker_manager

//removed for brevity
//generated actually regardless of TOSCA Topology

// Data source {} removed for brevity as it is generated regardless of TOSCA Topology

resource "aws_instance"  "nodeserver" {

	ami = "${var.ami}"
	instance_type= "${var.instance_type}"
		#Define securit_group to allow incoming or outcoming traffic from an EC2 instance
		removed for brevity as it is generated regardless of TOSCA Topology
		
	connection {
	    
	    # Connection type
	    type = "ssh"
	    
	    # The default username 
	    user = "username"

	    # The keyfile path
	    private_key = "${file("InstanceAccessKeys/privateKey.pem")}" 

	    password = "password"
	  }	
		
#Provisioner block is used to execute the required scripts to deal with docker services deployed on this resource
		
 provisioner "remote-exec" {
    script = "install-docker.sh"
  }

  provisioner "remote-exec" {
    inline = [
      "docker swarm join --token ${data.external.swarm_join_token.result.worker} ${aws_instance.docker_swarm_manager.private_ip}:2377"
    ]
	
	}
	}