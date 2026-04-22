package com.test.chap05_method.test02;

public class NonStaticMethodTest {
	//매개변수 유무와 반환값 유무에 따른 구분
	
	//1. 매개변수 없고 반환값 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 없는 메소드");
		return;
	}
	//2. 매개변수 없고 반환값 있는 메소드
	public String method2() {
		return "매개변수 없지만 반환값이 있는 메소드";
	}
	//3. 매개변수 있고 반환값 없는 메소드
	public void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
		return;
	}
	//4. 매개변수 있고 반환값 있는 메소드
	public int method4(int num1, int num2) {
		return num1 + num2;
	}
}
