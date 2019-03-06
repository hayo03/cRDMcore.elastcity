package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DockerCloudResource {

	@JsonProperty("Docker template version")
	private String DockerTemplateVersion;

	private String description;

	@JsonProperty("Entities")
	private Entity Entities;

	// Getters & Setters

	public String getDockerTemplateVersion() {
		return DockerTemplateVersion;
	}

	public void setDockerTemplateVersion(String dockerTemplateVersion) {
		this.DockerTemplateVersion = dockerTemplateVersion;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Entity getEntities() {
		return Entities;
	}

	public void setEntities(Entity entities) {
		this.Entities = entities;
	}

	public DockerCloudResource() {
		super();
	}

}
