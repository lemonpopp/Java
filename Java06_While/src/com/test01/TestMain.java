package com.test01;

public class TestMain {
	public static void main(String[] args) {
		//static 메소드 실행
		//클래스.메소드()
		//WhileTest01.testWhile01();
		//WhileTest01.testWhile02();
		//WhileTest01.testWhile03();
		//WhileTest01.testWhile04();
		
		//non static 메서드 실행
		//1. 준비
		//클래스 변수 = new 클래스();
		WhileTest02 wt02 = new WhileTest02();
		//2. 실행
		//변수.메소드();
		//wt02.testDoWhile01();
		wt02.testDoWhile02();
	}

}
