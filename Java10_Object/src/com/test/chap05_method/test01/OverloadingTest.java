package com.test.chap05_method.test01;

public class OverloadingTest {
	public int test() {
		return 0;
	}
	public int test(int a) {
		return 0;
	}
	public int test(int a,int b) {
		return 0;
	}
	public int test(int a, String s) {
		return 0;
	}
	
	//에러 발생
	//매개변수명은 상관없이 자료형의 갯수와 순서를 다르게 작성해야 한다.
//	public int test(int b, int a) {
//		return 0;
//	}
	
	//예약어 final은 오버로딩과 관련 없다
	public final int test(String s, int a) {
		return 0;
	}
	
	public String test(int a, int b, String s) {
		return null;
	}
	
	//에러발생
	//리턴타입이 다르다고 오버로딩이 적용되는건 아니다
//	public int test(int a, int b, String s) {
//		return 0;
//	}
	
	//에러발생
	//접근제한자 다르다고 오버로딩 적용되는건 아니다
//	private String test(int a, int b, String s) {
//		return "";
//	}
}
