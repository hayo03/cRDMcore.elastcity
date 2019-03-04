#output "access_key" {
	
#	value = "${var.access_key}"   
#}

#output "secret_key" {
	
#	value = "${var.secret_key}"   
#}

output "master.public_ip" {
	
	value = "${aws_instance.docker_swarm_manager.public_ip}"   
}

output "master.public_dns_ip" {
	
	value = "${aws_instance.docker_swarm_manager.public_dns}"   
}



