package com.thread.test01;

public class Run {

	public static void main(String[] args) {
		Thread01 th1 = new Thread01("야옹이");
		Thread01 th2 = new Thread01("강아지");
		
		//th1.run();	//main 스레드에서 run()이 실행되는 코드
		
		//th1.start();//새로운 스레드에서 run()이 실행된다
		//th2.start();
		
		//스케줄링 : 우선순위
		//		   우선순위가 높은 스레드가 먼저 진행
		th1.setPriority(10);
		th2.setPriority(1);
		
		th1.start();
		th2.start();
		
		
		System.out.println("main 스레드 끝");
	}

}
