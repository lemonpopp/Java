package com.test01;

import java.util.Scanner;

public class ifTest02 {
	// if else
	
	// 클래스 전체에서 사용 가능하게 Scanner 생성
	Scanner sc = new Scanner(System.in);
	
	public void testIfElse01() {
		int num = 10;
		
		if(num%2 ==0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		System.out.println("종료");
	}
	
	public void testIfElse02() {
		// 50보다 큰수라면 , 짝수인지 홀수인지
		// 50보다 작은수라면 작은수라고 출력
		System.out.print("정수 입력 : ");
		int no = sc.nextInt();
		
		if(no>=50) {
			if(no%2==0) {
				System.out.println("no는 50보다 큰 짝수");
			}else {
				System.out.println("no는 50보다 큰 홀수");
			}
		}else {	
			System.out.println("no는 50보다 작다.");
		}
		
		// 삼항연산자
		String str = (no>=50)? ((no%2==0)? "50보다 큰 짝수": "50보다 큰 홀수") : "50보다 작다";
		
	}
	
	public void testIfElse03() {
		// 숫자를 하나 입력받아 양수인지 음수인지 출력
		// 단, 0이면 "0 입니다" 출력 (if else 활용)
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수");
		}else {			
			if(num < 0) {
				System.out.println("음수");
			}else if(num==0) {
				System.out.println("0입니다");
			}
		} 
	}
}
