package com.test01;

public class Variable03 {
	// main
	public static void main(String[] args) {
		// 상수 테스트
		int age;
		final int AGE;
		
		age = 20;
		AGE = 20;
		
		System.out.println("age: " + age);
		System.out.println("AGE: " + AGE);
		
		// 변수 값 변경
		age = 30;
		// AGE = 30; // 에러 발생, 상수 값 변경 불가능
	}

}
