package com.test01;

public class MethodTest02 {
	public static void main (String[] argd) {
		// 메소드 호출
		// (같은 패키지, 다른 클래스)
		
		// 주비
		MethodTest01 mt01 = new MethodTest01();
		
		//실행
		mt01.publicMethod();
		mt01.protectedMethod();
		mt01.defaultMethod();
		// mt01.privateMethod(); // private은 다른 클래스에서 사용 불가
		
		// static method 실행
		MethodTest01.staticMethod();
	}
}
