package com.test01;
import java.util.Scanner;

public class ForTest02 {
	public static void main(String[] args) {
		//ForTest02.testFor01();
		//ForTest02.testFor02();
		//ForTest02.testFor03();
		ForTest02.testFor04();
	}
	//중첩 반복문
	public static void testFor01() {
		for(int i=0; i<10; i++) {
			System.out.println("==="+i+"===");
			for(int j=0; j<10; j++) {
				System.out.println("i = "+i+", j = "+j);
			}
		}
	}
	public static void testFor02() {
		//구구단을 2단부터 9단까지 출력
		for(int i=2; i<=9; i++) {
			System.out.println("------ "+i+"단 ------");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
	}
	
	public static void testFor03() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 줄?");
		int no = sc.nextInt();
		
		for(int k=0; k<no; k++) {			
			for(int i=0;i<5;i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void testFor04() {
		//별을 입력된 줄 수와 칸 수만큼 출력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력 : ");
		int line = sc.nextInt();
		System.out.print("칸 수 입력 : ");
		int block = sc.nextInt();
		
		for(int j=0; j<line; j++) {			
			for(int i =0; i<block; i++) {
				if(i==j) {
					System.out.print(i+1);
				}else {					
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
