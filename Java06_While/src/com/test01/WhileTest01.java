package com.test01;
import java.util.Scanner;

public class WhileTest01 {
	
	//Scanner 준비
	static Scanner sc = new Scanner(System.in);
	
	public static void testWhile01() {
		
		int i=1;
		while(i<10) {
			System.out.println(i+" : 반복중...");
			i++;
		}
	}
	
	public static void testWhile02() {
		//문자열을 입력받아 인덱스별로 문자를 char로 출력
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		int index=0;
		while(index<str.length()) {
			char ch = str.charAt(index);
			System.out.println(index + " : " + ch);
			index++;
		}
		
	}
	
	public static void testWhile03() {
		//정수 하나를 입력 받아
		//1부터 입력받은 수까지의 합 구해보기
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i=1;
		while(i <=num) {
			sum += i;
			i++;
		}
		System.out.println("정수의 합 : "+ sum);
		
	}
	
	public static void testWhile04() {
		//키보드로 4를 입력받을 때까지 반복
		//4입력하면 종료
		while(true) {
			System.out.print("정수 입력 : ");
			int no = sc.nextInt();
			if(no ==4) {
				System.out.println("4 입력! 종료!");
				break;
			}
		}
	}
	
}
