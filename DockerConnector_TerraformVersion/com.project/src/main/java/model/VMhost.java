package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VMhost {
	
	private String name;
	
	@JsonProperty("CPU")
	private String CPU;
	private String core;
	private String memory;
	private AccessCredential accesscredentials;
	
	
	//Getters & Setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public String getCore() {
		return core;
	}
	public void setCore(String core) {
		this.core = core;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public AccessCredential getAccesscredentials() {
		return accesscredentials;
	}
	public void setAccesscredentials(AccessCredential accesscredentials) {
		this.accesscredentials = accesscredentials;
	}
	
	//Constructor
	public VMhost() {
		super();
	}
    
	
	
	
	
	
}
