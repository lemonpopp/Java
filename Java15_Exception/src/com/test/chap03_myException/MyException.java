package com.test.chap03_myException;

//Exception을 상속 받아 예외 클래스 선언
public class MyException extends Exception{
	public MyException() {
		//기본 생성
		System.out.println("내가 만든 예외 클래스");
	}
	
	//매개변수 생성자
	public MyException(String msg) {
		super(msg);
	}
}
