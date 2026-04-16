package com.test01;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		// !논리값 : 논리값을 반대로 바꾸는 연산자
		// !true => false, !false => true
		
		System.out.println("true의 부정: " + !true);
		System.out.println("false의 부정: " + !false);
		
		// 키보드로 정수 하나를 입력 받아 짝수인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		System.out.println("입력한 정수가 짝수인가? " + (num%2==0));
		System.out.println("입력한 정수가 짝수가 아닌가? " + !(num%2==0));
		
		if(num % 2 == 1) {
			System.out.println(num+"은 홀수");
		}else {
			System.out.println(num+"은 짝수");
		}
		
	}
}
