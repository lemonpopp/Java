package com.test01;

public class Operator04 {
	public static void main(String[] args) {
		// 준비 + 실헹
		// new Operator04().test01();
		new Operator04().test02();
	}
	
	public void test01() {
		// 삼항 연산자
		// 항목이 3개 -> (조건식) ? 참일때 : 거짓일때;
		
		int num = 0;
		
		// String res = (num>0)? "양수다" : "양수가 아니다";
		
		// 삼항연산자 중첩
		String res = (num>0)? "양수다." : (num==0)? "0이다.":"음수다.";
		
		System.out.println(res);
		
	}
	
	public void test02() {
		// 복합대입연산자
		int num=12;
		
		// num의 값을 3증가
		num = num +3;
		System.out.println("num: " + num);
		
		num += 3;  // -> num = num + 3;
		System.out.println("num: " + num);
		
		//
		num -= 5;
		System.out.println("num: " + num);
		
		num *= 2;
		System.out.println("num: " + num);
		
		num /= 2;
		System.out.println("num: " + num);
		
		num %= 5	;
		System.out.println("num: " + num);
	}
}
