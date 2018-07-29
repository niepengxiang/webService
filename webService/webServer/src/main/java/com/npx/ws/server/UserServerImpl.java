package com.npx.ws.server;

import com.npx.ws.pojo.User;

public class UserServerImpl implements UserServer{

	@Override
	public User change(User user) {
		user.setPassword("1111");
		
		return user;
	}

}
