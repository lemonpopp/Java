package com.arrayPractice1.sample;

import java.util.Random;
import java.util.Scanner;

public class ArraySample {

	public void test1() {
		//1. 10개의 int 배열 선언하고 할당함
		int[] arr = new int[10];
		
		//2. 각 방에 1~100사이의 임의의 난수를 기록함
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*100+1);
		}
		
		//3. 10개의 정수들의 합계를 구하여 출력함
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
		}
		System.out.println("배열의 합 : " + sum);
		
	}
	
	public void test2() {
		//1. 10개의 int[] 선언, 할당함
		int[] arr = new int[10];
		
		//2. 1~100사이의 임의의 정수를 발생시켜, 배열공간에 기록함
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		
		//3. 기록된 10개의 값중 가장 큰 값과 가장 작은 값을 알아내어
		int big=0;
		int small=101;
		for(int i=0; i<arr.length; i++) {
			if(big<arr[i]) {
				big = arr[i];
			}
			if(small>arr[i]) {
				small = arr[i];
			}
		}
		
		//4. 출력확인
		System.out.println("최댓값: " + big + " 최솟값: " + small);
	}
	
	public void test3() {
		//1. 10개의 byte[] 선언, 할당함
		byte[] arr = new byte[10];
		
		//2. byte 자료형 범위에 속하는 임의의 난수를 발생시켜
		//각 변수방에 기록함 : Random 클래스의 메소드 사용함
		Random random = new Random();
		random.nextBytes(arr);
		
		//3. 기록된 10개의 값 중 짝수들의 합계만 구하여 출력함.
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i] + " ");
			}
		}		
	}
	
	public void test4(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
	}
	
	public void test5(){
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			sum += (int)(str.charAt(i)-'0');
		}
		System.out.println(sum);
		
	}

	

}
