package com.test01;

public class Operator02 {
	public static void main(String[] args) {
		// ++ : 1증가
		// -- : 1감소
		
		// Operator02.test1();
		Operator02.test2();
		
	}
	
	public static void test1() {
		// 전위 후위
		
		int age = 20;
		
		System.out.println("age: " + age);
		
		//for(; ; i++)
		++age;
		System.out.println("++age: " + age);
		
		age++;
		System.out.println("age++: " + age);
		
		--age;
		System.out.println("--age: " + age);
		
		age--;
		System.out.println("age--: " + age);
	}
	
	public static void test2() {
		int num1 = 20;
		
		// 후위 연산자
		int res = num1++ *3;
		System.out.println("res: " + res);
		System.out.println("num1: " + num1);
		
		// 전위 연산자
		int num2 = 20;
		int res2 = ++num2 * 3;
		System.out.println("res2: " + res2);
		System.out.println("num2: " + num2);
	}
}
