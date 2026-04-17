package com.test01;
import java.util.Scanner;

public class ifTest03 {
	// if else if
	// else if
	
	// Scanner 준비
	Scanner sc = new Scanner(System.in);
	
	public void testElseIf01() {
		// 정수 하나를 입력받아 양수인지, 음수인지, 0인지 출력
		
		System.out.print("정수 입력 : ");
		int no = sc.nextInt();
		
		if(no>0) {
			System.out.println("양수");
		}else if(no==0) {
			System.out.println("0이다");
		}else if(no<0) {
			System.out.println("음수다");
		}
	}
	
	public void testElseIf02() {
		// 키보드로 점수 하나를 입력 받아 등급을 나누어 출력
		// 90점 이상은 A등급
		// 90점 미만 80점 이상은 B등급
		// 80점 미만 70점 이상은 C등급
		// 70점 미만은 F등급
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		char grade = ' ';
		
		if(score >=90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
		System.out.printf("점수는 %d이고 등급은 %c입니다.", score, grade);
		
		// printf("%형식", 값(변수));
		// 포맷
		// %d: 정수, %f: 실수, %c: 문자, %s: 문자열, %b: 논리형
		// %5d: 5칸 확보하여 오른쪽 정렬
		// %-5d: 5칸 확보하야 왼쪽 정렬
		// %.3f: 소수점 아래 3자리까지만 표시
	}
	
}
