package com.test.chap05_method.test02;

public class StaticMethodTest {
	public static void method01() {
		System.out.println("10과 20의 합은 " + (10+20) + "입니다.");
	}
	
	public static int method02() {
		return 10+100;
	}
	
	public static void method03(String name) {
		System.out.println(name + "님 환영합니다.");
	}
	
	public static String method04(String name) {
		return name + "님!! 환영합니다!!";
	}
}
