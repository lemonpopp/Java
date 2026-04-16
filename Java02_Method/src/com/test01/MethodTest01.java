package com.test01;

public class MethodTest01 {
	public static void main(String[] args) {
		// 메소드 실행
		// (메소드가 선언된 클래스 내부)
		
		// 준비
		MethodTest01 mt01 = new MethodTest01();
		
		// 실행
		mt01.publicMethod();
		mt01.protectedMethod();
		mt01.defaultMethod();
		mt01.privateMethod();
		
		// static 메소드 호출 방법
		// class.method();
		MethodTest01.staticMethod();
	}
	
	// '접근제한자'에 따른 메소드 종류
	
	// 어디서나 접근, 참조가능 (+)
	public void publicMethod() {
		System.out.println("public method");
	}
	// 상속일 경우 상속된 곳에서
	// 상속이 아닌 경우 같은 패키지 내에서만 (#)
	protected void protectedMethod() {
		System.out.println("protected method");
	}
	// 같은 패키지 내에서만 (default)
	void defaultMethod() {
		System.out.println("default method");
	}
	// 현재 클래스 내에서만 (-)
	private void privateMethod() {
		System.out.println("private method");
	}
	
	
	// static 메소드
	public static void staticMethod() {
		System.out.println("static method");
	}
}
