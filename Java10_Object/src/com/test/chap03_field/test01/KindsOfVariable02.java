package com.test.chap03_field.test01;

//static 키워드
public class KindsOfVariable02 {
	//전역변수에서 static 키워드 사용 가능
	public static int staticNum;
	
	//'상수 필드'
	//public 접근제한자 + static 키워드 + final 키워드
	//초기화되어야 한다
	public static final int STATIC_NUM = 1;
	public final static int STATIC_NUM2 = 2;
	
	public void methodTest() {
		//지역 변수에는 불가능
		//static int localStaticNum;
	}
	public static void methodTest2() {
		//static 메소드 내에서도 static 변수 선언 불가능
		//static int localStaticNum;
		
		double d = Math.PI;
	}
}
