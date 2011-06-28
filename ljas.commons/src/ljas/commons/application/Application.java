package ljas.commons.application;

import ljas.commons.network.SendsTasks;

import org.apache.log4j.Logger;

public abstract class Application {
	private final String _version;
	private final String _name;
	private SendsTasks _local;

	public SendsTasks getLocal() {
		return _local;
	}

	public void setLocal(SendsTasks value) {
		_local = value;
	}

	public String getVersion() {
		return _version;
	}

	public String getName() {
		return _name;
	}

	public Logger getLogger() {
		return Logger.getLogger(this.getClass());
	}

	public long getApplicationId() {
		return _name.hashCode();
	}

	public Application(String name, String version) {
		_name = name;
		_version = version;
	}

	/**
	 * Gets executed, when the server is starting
	 */
	public abstract void start();
}
