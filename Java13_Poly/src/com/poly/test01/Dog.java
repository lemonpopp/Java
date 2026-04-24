package com.poly.test01;

public class Dog extends Animal {
	
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public void eat(String food) {
		super.eat(food);
		System.out.println("멍");
	}

}
