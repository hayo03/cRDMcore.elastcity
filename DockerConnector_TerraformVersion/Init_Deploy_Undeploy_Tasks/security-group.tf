############################################################
		# Security group #
############################################################


resource "aws_security_group"  "swarm_securityGroup" {

	name = "swarm_securityGroup"
	description = "Allow ssh and web access"
    	
	# SSH access from anywhere
    	ingress {
     	 	from_port = 22
      		to_port = 22
      		protocol = "tcp"
      		cidr_blocks = ["0.0.0.0/0"]
    	}
    	
	# HTTP access from anywhere
	ingress {
	      from_port = 80
	      to_port = 80
	      protocol = "tcp"
	      cidr_blocks = ["0.0.0.0/0"]
	    }
	ingress {
		from_port = "0"
		to_port = "0"
		protocol = "-1"
		cidr_blocks = ["0.0.0.0/0"]
	}
	
	egress {
		from_port = "0"
		to_port = "0"
		protocol = "-1"
		cidr_blocks = ["0.0.0.0/0"]
}
	tags {
		name = "allow_all"
	}
	
}
