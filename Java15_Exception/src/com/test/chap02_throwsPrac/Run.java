package com.test.chap02_throwsPrac;

import java.io.IOException;

public class Run {
	//throw를 통해 예외를 발생
	//발생되는 예외를 throws로처리
	public static void main(String[] args) /*throws IOException*/{
		//main에서 throws로 처리된 예외는 jvm이 처리
		
		try{
			methodA();			
		}catch(IOException e) {
			System.out.println("main() 에서 처리");
		}
		System.out.println("프로그램 종료	");
	}

	public static void methodA() throws IOException{
		methodB();
	}
	public static void methodB() throws IOException{
		methodC();
	}
	public static void methodC() throws IOException{
		System.out.println("methodC()");

		//예외 발생
		throw new IOException();			
	}
}
