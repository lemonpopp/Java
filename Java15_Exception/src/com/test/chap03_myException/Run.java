package com.test.chap03_myException;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력: ");
		int no = sc.nextInt();
		
		try {
			checkNum(no);			
		}catch(MyException e) {
			System.out.println("입력 받은 숫자를 확인 중 문제 발생");
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
	}
	public static void checkNum(int num) throws MyException {
		if(num%2 ==0) {
			System.out.println(num+"은 짝수");
		}else {
			//짝수가 아닌경우 예외 발생
			//MyException me = new MyException();
			//throw me;
			throw new MyException(num + "은 홀수, 입력 오류");
			//예외 클래스 객체 생성 시 매개 변수 넘겨준 String 데이터가
			//message로 등록이 된다
		}
	}

}
