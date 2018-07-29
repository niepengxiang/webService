package com.npx.ws.server;

import javax.jws.WebService;

import com.npx.ws.pojo.User;

@WebService
public interface UserServer {
	
	public User change(User user);
	
	
}
