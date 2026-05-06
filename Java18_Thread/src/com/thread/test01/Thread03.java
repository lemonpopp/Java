package com.thread.test01;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("---메인 스레드 실행---");
		Thread01 th1 = new Thread01("야옹");
		Thread01 th2 = new Thread01("멍멍");
		
		th1.start();
		try {
			//th1 스레드 종료 될때까지 다른 스레드 멈춘다
			th1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th2.start();
		
		System.out.println("---메안 스레드 종료---");
	}
	
}
