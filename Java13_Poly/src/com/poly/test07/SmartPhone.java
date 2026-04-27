package com.poly.test07;

public class SmartPhone extends AProduct{

	@Override
	public void abstMethod() {
		
	}
	
	public void printSmartPhone() {
		System.out.println("SmartPhone 클래스 printSmartPhone()...");
	}
	
	@Override
	public String toString() {
		return "SmartPhone 클래스의 toString()...";
	}
	
}
