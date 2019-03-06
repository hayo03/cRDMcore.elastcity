package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServiceFeature {
	private String image;
	private String ports;
	private String network;

	@JsonProperty("Containers")
	private Container Containers;

	// Getters & Setters

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPorts() {
		return ports;
	}

	public void setPorts(String ports) {
		this.ports = ports;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public Container getContainers() {
		return Containers;
	}

	public void setContainers(Container containers) {
		Containers = containers;
	}

	// Constructor
	public ServiceFeature() {

	}

}
