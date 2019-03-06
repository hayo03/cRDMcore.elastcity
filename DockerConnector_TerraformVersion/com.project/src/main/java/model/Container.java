package model;

public class Container {
	
	private int replica;
	private Config update_config;
	private RestartPolicy restart_policy;
	public int getReplica() {
		return replica;
	}
	public void setReplica(int replica) {
		this.replica = replica;
	}
	public Config getUpdate_config() {
		return update_config;
	}
	public void setUpdate_config(Config update_config) {
		this.update_config = update_config;
	}
	public RestartPolicy getRestart_policy() {
		return restart_policy;
	}
	public void setRestart_policy(RestartPolicy restart_policy) {
		this.restart_policy = restart_policy;
	}
	public Container() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
