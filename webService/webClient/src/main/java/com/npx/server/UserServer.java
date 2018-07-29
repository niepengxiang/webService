package com.npx.server;

import javax.jws.WebService;

import com.npx.pojo.User;

@WebService(targetNamespace="http://server.ws.npx.com/")
public interface UserServer {

	public User change(User user);
		
}
