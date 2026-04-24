package com.poly.test04;

public class Eagle extends Animal implements Bird {

	@Override
	public void bark() {
		System.out.println("삐이익");
	}
	
	@Override
	public void fly() {
		System.out.println("파닥파닥");
	}
}
