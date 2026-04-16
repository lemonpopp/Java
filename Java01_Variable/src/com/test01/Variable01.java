package com.test01;

public class Variable01 {
	/*
	 * main method. 프로그램의 진입점,시작점
	 */
	public static void main(String[] args) {
		// 타입 변수명 = 값;
		// 타입: 생성할 변수에 어떠한 종류의 값을 저장할지 타입을 지정
		// 변수명: 변수의 이름, 우리가 사용힐 변수의 이름을 지정
		// 값: 변수에 들어갈 데이터 
		
		
		Variable01 test = new Variable01();
		// Variable01 이라는 타입의 test라는 이름의 변수 생성!
		// new를 통해 Variable01이라는 클래스의 객체 생성! 그 주소값을 test에 대입

		test.var01();
		
		// 일반적인 메소드 실행 순서
		// 1. 준비
		// 클래스명 변수명 = new 클래스명
		// Variable01 test = new Variable01();
		// 2. 실행
		// 변수명.메소드명();
		// test.var01();
		
		// java 실행
		// 1. 툴바에서 클릭
		// 2. 상단 메뉴 Run에서 실행
		// 3. ctrl + F11
		
		test.var02();
		
	}
	
	public void var01() {
		// 기본 형태의 메소드
		
		// 변수의 선언
		// 타입
		// 숫자형
		// 정수
		byte bnum;
		short snum;
		int inum;
		long lnum;
		// 실수
		float fnum;
		double dnum;	
		
		// 문자형
		// 문자
		char ch;
		
		// 문자열(String)
		String str;
		
		// 논리형
		boolean isTrue;
		
		// ------------------
		// 변수에 값 대입
		bnum = 1;
		snum = 2;
		inum = 4;
		lnum = 8L;
		
		fnum = 4.0f;
		dnum = 8.0;
		
		ch = 'A';
		str = "A";
		
		isTrue = false;
		
		// 변수에 저장된 값 출력하기
		// 콘솔에 출력 (js -> console.log();)
		System.out.println("inum 값: " + inum);
		System.out.println("dnum 값: " + dnum);
		System.out.println("ch 값: " + ch);
		System.out.println("str 값: " + str);
		System.out.println("isTrue 값: " + isTrue);
	
	}
	
	public void var02() {
		// 변수 선언과 동시에 초기화
		int inum = 4;
		double dnum = 8.0;
		boolean isTrue = false;
		char ch = 'A';
		String str = "안녕하세요~!";
		
		System.out.println("inum 값: " + inum);
		System.out.println("dnum 값: " + dnum);
		System.out.println("isTrue 값: " + isTrue);
		System.out.println("ch 값: " + ch);
		System.out.println("str 값: " + str);		
	}
	
	
}
