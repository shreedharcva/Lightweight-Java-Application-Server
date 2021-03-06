package ljas.commons.application.server;

import ljas.commons.application.LoginParameters;
import ljas.commons.application.server.ServerApplication;
import ljas.commons.application.server.ServerApplicationException;
import ljas.commons.network.SocketConnection;

/**
 * Provides a minimalistic standard-implementation
 * 
 * @author Jonas Hansen
 * 
 */
public class ServerApplicationAdapter extends ServerApplication {

	public ServerApplicationAdapter(String name, String version) {
		super(name, version);
	}

	@Override
	public void registerUser(SocketConnection connection,
			LoginParameters parameter) throws ServerApplicationException {
		// nothing
	}

	@Override
	public void removeUser(SocketConnection connectino)
			throws ServerApplicationException {
		// nothing
	}

	@Override
	public void start() {
		// nothing
	}

}
