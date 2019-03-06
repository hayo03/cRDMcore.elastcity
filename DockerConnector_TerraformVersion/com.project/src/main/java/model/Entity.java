package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Entity {

	@JsonProperty("Application")
	private Application Application;

	@JsonProperty("Services")
	private Map<String, ServiceFeature> services = new HashMap<String, ServiceFeature>();

	@JsonProperty("Images")
	private Map<String, ImageFeature> images = new HashMap<String, ImageFeature>();

	@JsonProperty("Links")
	private List<LinkComponent> Links;
	@JsonProperty("Volumes")
	private Map<String, String> volumes = new HashMap<String, String>();

	@JsonProperty("Networks")
	private Network Networks;

	@JsonProperty("Hostmachines")
	private Map<String, VMhost> hostmachines = new HashMap<String, VMhost>();

	@JsonProperty("Policy")
	private Policy Policy;

	public Application getApplication() {
		return Application;
	}

	public void setApplication(Application application) {
		Application = application;
	}

	public Map<String, ImageFeature> getImages() {
		return images;
	}

	public void setImages(Map<String, ImageFeature> images) {
		this.images = images;
	}

	public Map<String, ServiceFeature> getServices() {
		return services;
	}

	public void setServices(Map<String, ServiceFeature> services) {
		this.services = services;
	}

	public List<LinkComponent> getLinks() {
		return Links;
	}

	public void setLinks(List<LinkComponent> links) {
		Links = links;
	}

	public Policy getPolicy() {
		return Policy;
	}

	public void setPolicy(Policy policy) {
		Policy = policy;
	}

	public Map<String, String> getVolumes() {
		return volumes;
	}

	public void setVolumes(Map<String, String> volumes) {
		this.volumes = volumes;
	}

	public Network getNetworks() {
		return Networks;
	}

	public void setNetworks(Network networks) {
		Networks = networks;
	}

	public Map<String, VMhost> getHostmachines() {
		return hostmachines;
	}

	public void setHostmachines(Map<String, VMhost> hostmachines) {
		this.hostmachines = hostmachines;
	}

	// Default constructor
	public Entity() {
		super();
	}

}
