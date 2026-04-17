package com.test02;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	public void test01(int num) {
		if(num % 5 ==0) {
			System.out.println("5의 배수입니다.");
		}
	}
	public void test02(int num) {
		if(num%2==0 && num%3==0) {
			System.out.println("2와 3의 배수입니다.");
		}else {
			System.out.println("2와 3의 배수가 아닙니다.");
		}
	}
	public void test03(char ch) {
		
	}
	
}
