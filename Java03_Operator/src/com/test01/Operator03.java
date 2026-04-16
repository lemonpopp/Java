package com.test01;

import java.util.Scanner;

public class Operator03 {
	public static void main(String[] args) {
		Operator03 op3 = new Operator03();
		// op3.test01();
		// op3.test02();
		op3.test03();
	}
	
	public void test01() {
		// 산술연산자
		// +, -, *, /, %
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
	}
	
	public void test02() {
		// 비교연산자
		// >, >=, ==, <=, <
		
		int a = 10, b = 20;
		boolean res1, res2, res3;
		
		res1 = (a==b);
		res2 = (a<=b);
		res3 = (a>b);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}
	
	public void test03() {
		// && (그리고, ~면서)
		// || (또는, ~거나)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력: ");
		int num = sc.nextInt();
		
		// 입력받은 정수 값이 1~100 숫자인지 확인
		// 1 <= num <= 100  )))  1<=num && num<=100
		System.out.println("1~100사이의 숫자인지 확인: " + (1<=num && num<=100));
		
		// 영어 대문자인지 확인
		System.out.print("문자 하나 입력: ");
		char ch = sc.next().charAt(0);
		
		// ch >= 'A' && ch <= 'Z'
		System.out.println("대문자 확인: " + (ch>='A' && ch<='Z'));
		
		// ------------------------------
		System.out.print("계속 하시려면 y or Y 입력: ");
		ch = sc.next().charAt(0);
		System.out.println("영문자 y인지 확인: " + (ch=='y'||ch=='Y'));
	}
}
