package com.test01;
import java.util.Scanner;

public class ifTest01 {
	public void ifTest() {
		// 단독 if문
		
		// 키보드로 정수 하나 입력 받기
		// -> Scanner 필요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		// 짝수인지 확인
		if(num %2 ==0) {
			System.out.println("짝수");
		}
		// 짝수가 아닌지 확인(홀수)
		if(num%2 != 0) {
			System.out.println("홀수");
		}
		
		System.out.println("종료");
	}
}
