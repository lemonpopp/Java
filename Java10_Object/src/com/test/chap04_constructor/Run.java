package com.test.chap04_constructor;

import java.util.Date;

public class Run {
	public static void main(String[] args) {
		User u1 = new User();
		u1.info();
		
		User u2 = new User("user01","pass01","레몬팡");
		u2.info();
		
		User u3 = new User("user02","pass02","레몬",new Date());
		u3.info();
	}	
}
