package com.npm;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.npx.pojo.User;
import com.npx.server.UserServer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-cxf.xml")
public class SpringCxfClientTest {

	@Resource
	private UserServer UserServer;
	
	@Test
	public void invoke() throws Exception {
		// class com.sun.proxy.$Proxy45
		System.out.println(UserServer.getClass());
		
		
		// 远程调用方法2：
		User user = new User();
		user.setUserName("npx");
		user.setPassword("1111");
		
		User change = UserServer.change(user);
		System.out.println(change.getUserName() + "=====" + change.getPassword());
	}
}







