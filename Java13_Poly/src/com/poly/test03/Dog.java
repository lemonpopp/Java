package com.poly.test03;

public class Dog implements Animal {

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String food) {
		System.out.println(food + " 얌얌!");
	}
}
