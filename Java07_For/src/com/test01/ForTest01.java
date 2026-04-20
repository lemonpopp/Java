package com.test01;
import java.util.Random;
import java.util.Scanner;

public class ForTest01 {
	public static void main(String[] args) {
		//ForTest01.testFor01();
		//ForTest01.testFor02();
		//ForTest01.testFor03();
		//ForTest01.testFor04();
		ForTest01.testFor05();
	}
	
	public static void testFor01() {
		//1~10 출력
		for(int i=1;i<=10;i++) {
			System.out.println("i= "+i);
		}
		
		//10~1출력
		for(int i=10; i>=0;i--) {
			System.out.println("i= "+i);
		}
	}
	
	public static void testFor02() {
		for(int i=1; i<10;  i+=2) {
			System.out.println(i+"번째 출력");
		}
		System.out.println("------------");
		
		//초기식과 증감식은 1개 이상 가능
		for(int i=0, j=10; i<10 && j>=1; i++,j--) {
			System.out.println("i: "+i);
			System.out.println("j: "+j);
		}
		
		//
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
		for(double d=1; d<10; d+=0.4) {
			System.out.println(d);
		}
	}
	
	public static void testFor03() {
		//정수 하나를 키보드로 입력
		//그 수가 양수일때만, 그 수의 구구단을 출력
		//양수가 아니면 "반드시 1~9 사이의 양수를 입력해라" 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1~9 사이의 정수 입력 : ");
		int num = sc.nextInt();
		if(num >0 && num <=9) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d X %d = %d\n",num,i,num*i);
			}
		}else {
			System.out.println("1~9사이의 정수를 입력하세요.");
		}
	}
	
	public static void testFor04() {
		//1~100 사이의 임의의 난수 중 하나를 구해서
		//1~난수 까지의 합계를 출력
				
		int random = (int)(Math.random()*100)+1;
				
		int sum=0;
		for(int i =1; i<=random; i++) {
			sum += i;
		}
		System.out.println("1부터 "+random+"까지의 합 : "+sum);
		
		//Random 클래스
		//nextInt(100) -> 0~99
		System.out.println(new java.util.Random().nextInt(100)+1);
		
		//ThreadLocalRandom 클래스
		//nextInt(1,101) -> 1이상 101미만
		System.out.println(java.util.concurrent.ThreadLocalRandom.current().nextInt(1,101));
	}
	
	public static void testFor05() {
		//키보드로 정수 두 개 입력받고
		//작은수~큰수 까지의 합
		Scanner sc = new Scanner(System.in);
		//1. 숫자 두 개 입력
		System.out.print("첫번째 정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		int b = sc.nextInt();
		//2. 큰 수, 작은 수 확인
		//3.합을 구하기
		int sum = 0;
		if(a>b) {
			for(int i =b; i<=a; i++) {
				sum += i;
			}
		}else {
			for(int i =a; i<=b; i++) {
				sum += i;
			}
		}
		System.out.println(sum);
		
	}
}
