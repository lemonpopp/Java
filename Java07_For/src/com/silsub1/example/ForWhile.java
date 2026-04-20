package com.silsub1.example;
import java.util.Scanner;

public class ForWhile {
	Scanner sc = new Scanner(System.in);
	
	public void printStar1(){
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		if(num >0) {
			for(int i=0;i<num;i++) {
				for(int j=0;j<i+1;j++) {
					if(i==j) {
						System.out.print(i+1);
					}else {
						System.out.print("*");											
					}
				}
				System.out.println();
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void printStar2(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num == 0) {
			System.out.println("출력 기능이 없습니다.");
		}else if(num>0) {
			for(int j=0; j<num;j++) {				
				for(int i =0; i<j+1; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			
		}
	}

}
