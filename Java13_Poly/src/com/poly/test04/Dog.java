package com.poly.test04;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍!!");
	}
	@Override
	public void eat(String food) {
		System.out.println(food + " 으르렁!");
	}
	
	public void bite() {
		System.out.println("깨물기");
	}
}
