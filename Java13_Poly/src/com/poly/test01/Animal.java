package com.poly.test01;

//추상클래스
public abstract class Animal {

	//추상 메소드 구현부가 없이 선언부만 존재하는 메소드
	public abstract void bark();
	
	public void eat(String food) {
		System.out.println(food + " 얌얌");
	}
}
