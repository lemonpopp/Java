package com.test02;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

//자바에서 제공하는 함수형 인터페이스
public class Functional01 {
	public static void main(String[] args) {
		unaryTest();
		binaryTest();
	}
	
	public static void unaryTest() {
		//UnaryOperator 라는 함수형인터페이스
		//apply() 호출하여 작업 수행
		UnaryOperator<String> hello = name -> "Hello, " + name; 
		
		System.out.println(hello.apply("Lambda"));
	}
	
	public static void binaryTest() {
		//BinaryOperateor 라는 함수형 인터페이스
		//apply()
		BinaryOperator<Integer> sum = (i,j) -> i+j;
		
		System.out.println(sum.apply(10, 3));
	}
}
