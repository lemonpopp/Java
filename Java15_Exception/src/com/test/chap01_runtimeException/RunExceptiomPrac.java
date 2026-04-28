package com.test.chap01_runtimeException;

import java.util.Random;
import java.util.Scanner;

public class RunExceptiomPrac {
	Scanner sc = new Scanner(System.in);
	
	public void aruthEx() {
		//ArithmeticException
		int no1 = 10;
		int no2 = 0;
		
		//System.out.println(no1/no2);//ArithmeticException
		//System.out.println(no1%no2);//ArithmeticException
		//System.out.println(no1/0.0);//Infinity
		
		int ran = 0;
		//if
		/*
		while(true) {
			System.out.print("나눌 수를 입력[음수 입력 시 종료]: ");
			int inputNo = sc.nextInt();
			if(inputNo<0) {
				break;
			}
			
			if(inputNo == 0) {
				System.out.println("0이 아닌 값을 입력하세요.");
			}else {				
				//1~10 랜덤값
				ran = new Random().nextInt(10)+1;
				int res = ran / inputNo;
				System.out.println(ran + "/" + inputNo +"=" + res);
			}
		}
		*/
		
		//try catch
		try {
			//예외가 발생할 수 있는 코드를 포함한 실행 코드 작성하는 블럭
			System.out.print("나눌 수를 입력: ");
			int inputNo = sc.nextInt();
			ran = new Random().nextInt(10)+1;
			int res = ran/inputNo;
			System.out.println(ran+"/"+inputNo+"="+res);
		}catch(ArithmeticException e) {
			//예외 발생 -> jvm에 의해 예외 클래스 객체 생성 -> 해당 catch문으로 예외클래스 객체를 넘긴다
			//e.printStackTrace();
			//System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("Exception 발생!!");
		}
		System.out.println("프로그램 종료");
	}
	
	public void classNArrayEx() throws ClassCastException{
		//해당 예외 발생 시 메소드 호출한 곳으로 넘긴다.
		//예외처리를 떠넘긴다.
		try {
			//[1]classCastException
			//Object obj = new int[10];
			//Object obj = 'a';//기본자료형 => boxing => Character 객체 => 다형성 => Object
			//System.out.println(obj);
			//String str = (String)obj; //ClassCastException
			//System.out.println(str); //실행 안된다
			
			//해결 방법
			//1. (String)obj => (Character)obj
			//2. if(obj instanceof String){(String)obj}
			// 	 else if(obj instanceof Character{(Character)obj}
			
			//[2]ArrayIndexOutOfBoundsException	
			//int[] arr = new int[2];
			//arr[0] = 1;
			//arr[1] = 2;
			
			//arr[2] = 3;//ArrayOutOfBoundsException
		
			//[3]NullPointerException
			String str = null;
			int length = str.length();//NullPointerException
		
			
		//지금은 trycatch 연습을 위해 try catch로 예외 처리 구문 추가
		}catch(ClassCastException e) {
			System.out.println("Exception 발생");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 벗어나면 발생하는 예외");
			System.out.println("문제가 되는 index: " + e.getMessage());
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.out.println("Null 값을 참조 중!");
			return;
		} finally {
			//예외가 발생해서 catch 블럭이 실행되건
			//예외가 발생하지않아서 try 블럭이 끝까지 실행되건
			//늘 마지막세 실행되는 블럭
			System.out.println("마지막에 실행!");
		}
	}
	
}
