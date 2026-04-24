package com.poly.test03;

public class Cat implements Animal {
	
	@Override
	public void bark() {
		System.out.println("야옹");
	}
	
	@Override
	public void eat(String food) {
		System.out.println(food + " 얌얌!");
	}
}
