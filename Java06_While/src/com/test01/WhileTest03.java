package com.test01;

public class WhileTest03 {

	public static void main(String[] args) {
		//1. 1~100까지의 숫자를 역순으로 출력
		WhileTest03.prn01();
		System.out.println("-------------");
		
		//2. 1~100까지의 숫사 중, 2의 배수만 출력
		WhileTest03.prn02();
		System.out.println("-------------");
		
		//3. 1~100까지의 숫자 중, 7의 배수의 갯수와 총합을 출력
		WhileTest03.prn03();
	}
	public static void prn01() {
		int num = 100;
		while(num!=0) {
			System.out.println("i: " + num);
			num--;
		}
	}
	public static void prn02() {
		int i = 1;
		while(i<100) {
			if(i%2==0) {
				System.out.println("2의배수 : "+i);
			}
			i++;
		}
	}
	public static void prn03() {
		int num = 1;
		int sum = 0;
		int i = 0;
		while(num<100) {
			if(num%7==0) {
				sum +=num;
				num++;
				i++;
			}else {
				num++;
			}
		}
		System.out.printf("1~100까지 7의 배수 개수 %d, 총힙 %d",i,sum);
	}

}
