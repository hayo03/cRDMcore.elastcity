package model;

public class RestartPolicy {
	
	private String condition;
	private int delay;
	private int max_attempts;
	private int window;

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	
	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

	public int getMax_attempts() {
		return max_attempts;
	}

	public void setMax_attempts(int max_attempts) {
		this.max_attempts = max_attempts;
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public RestartPolicy() {
		super();
	}
	
	

}
