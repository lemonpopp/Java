package com.poly.test07;

public abstract class AProduct {

	public abstract void abstMethod();
	
	public void printProducet() {
		System.out.println("Product 클래스의 메소드 실행");
	}
	
	@Override
	public String toString() {
		return "Product의 toString() 메소드 실행";
	}
}
