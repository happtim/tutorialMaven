package com.happtim.maven;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import com.happtim.maven.Hello;


public class HelloFriendTest {
	@Test
	public void tesHelloFriend(){
		
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("zhangsan");
		assertEquals("Hello zhangsan! I am John",results);		

	}
}
