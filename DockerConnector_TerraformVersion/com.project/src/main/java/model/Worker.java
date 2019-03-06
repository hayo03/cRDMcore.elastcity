package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Worker extends ServiceFeature{
	
	@JsonProperty("networks")
	private WorkerNetwork networks;

	public WorkerNetwork getNetworks() {
		return networks;
	}

	public void setNetworks(WorkerNetwork networks) {
		this.networks = networks;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
