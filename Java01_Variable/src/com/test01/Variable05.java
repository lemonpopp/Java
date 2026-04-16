package com.test01;

public class Variable05 {
	public static void main(String args[]) {
		
		// 1. 준비
		// 클래스명 변수명 = new 클래스명();
		Variable05 var05 = new Variable05();
		
		// 2. 실행
		// 변수명.메소드명();
		// var05.test01();
		// var05.test02();
		var05.test03();
	}
	// 형변환
	
	// 컴퓨터에서의 값 처리 원칙
	// 1. 같은 자료형 끼리만 대입 가능 -> 다른 자료형의 값을 대입하고자 한다면 형변환이 필요하다.
	// 2. 같은 자료형 끼리만 계산 가능 -> 다른 자료형과의 계산을 위해서는 형변환이 필요하다.
	
	public void test01() {
		
		// char -> int 자동 형변환
		int num = 'A';
		System.out.println("num: " + num);
		
		char ch = 97;
		System.out.println("char: " + ch);
		// ch = -10; 에러 발생 / 유니코드는 양수만

		// 깅제 형변환
		char ch2 = (char)num;
		System.out.println("ch2: " + ch2);
		
		num = -97;
		char ch3 = (char)num;
		System.out.println("ch3: " + ch3);
		
		byte bnum = 10;
		int num2;
		num2 = bnum;
		System.out.println("num2: " + num2);
		
		double dnum = num2;
		// 자료형이 다르더라도 작은 타입은 큰 타입에 저장 가능하다 (자동형변환, 묵시적형변환, upcasting)
		
		// int를 byte에 저장 -> 자동형변환X
		bnum =(byte)num2;
		// 큰 타입은 작은 타입으로 자동 형변환이 이루어지지 않기에 형변환을 명시해줘야 한다 (강제형변화, 명시적형변환,downcasting)
		
	}
	
	public void test02() {
		int inum = 10;
		long lnum = 100L;
		
		// 에러 발생
		// int isum = inum + lnum;
		
		// 1. 연산 후 int로 강저 형변환
		int isum = (int)(inum + lnum);
		System.out.println("isum: " + isum);
		
		// 2. long 값을 int로 강제 형변환
		isum = inum+(int)lnum;
		System.out.println("isum: " + isum);
		
		// 3. long 타입으로 변수 선언하여 사용
		long lsum = inum + lnum;
		System.out.println("lsum: " + lsum);
		
		byte bnum = 1;
		short snum = 2;
		
		short sum = (short)(bnum + snum);
		System.out.println("sum: " + sum);
	}
	
	public void test03() {
		// 정수->실수 자동형변환
		long lnum = 100;
		float fnum = lnum;
		System.out.println("lnum: " + lnum + ", fnum: " + fnum);
		
		// 실수->정수 강제형변환
		double dnum = 10.0;
		int inum = (int)dnum;
		System.out.println("dnum: " + dnum + ", inum: " + inum);
		
		// 데이터 손실
		dnum = 1234.567;
		inum = (int)dnum;
		System.out.println("dnum: " + dnum + ", inum: " + inum);
		System.out.println("(double)inum: " + (double)inum);
	}
}
