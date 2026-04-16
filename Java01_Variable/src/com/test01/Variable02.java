package com.test01;

import java.util.Scanner;

public class Variable02 {
	// main 메소드
	public static void main(String[] args) {
		// inputTest1() 실행하기
		
		// 1. 준비
		Variable02 test = new Variable02();
		
		// 2. 실행
		// test.inputTest1();
		
		test.inputTest2();
	}
	// java.io 패키지에서 제공되는 클래스를 활용한 키보드 입력
	
	public void inputTest1() {
		// BufferedReader 클래스를 이용하여 키보드로 값 입력 받기
		
		// 현재 위치한 패키지 외에 다른 패키지에 속한 클래스를 사용할 때
		// 사용하는 클래스의 정확한 위치(패키지등)을 명시해야 한다.
		java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		
		try {
			String value = br.readLine(); // 한줄 읽어오기, String 타입으로 읽어온다.			
			
			System.out.println("입력한 값: " + value);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void inputTest2() {
		// java.util.Scanner 활용하여 입력받기
		System.out.print("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		// 문자열 입력
		//String name = sc.next();	// 띄어쓰기를 입력하기 전까지 읽어온다.
		String name = sc.nextLine();	// 띄어쓰기 등을 포한한 한 줄 전체
		
		// 정수 입력
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		
		// 실수 입력
		System.out.print("등급 입력: ");
		double grade = sc.nextDouble();
		
		
		System.out.println(name+"님, " + age +"세, " + grade + "등급");
	}

}
