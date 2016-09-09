package com.happtim.maven;

import com.happtim.maven.Hello;

public class HelloFriend {

	public String sayHelloToFriend(String name){
		
		Hello hello = new Hello();
		String str = hello.sayHello(name)+" I am "+this.getMyName();
		System.out.println(str);
		return str;
	}
	
	public String getMyName(){
		return "John";
	}

}
