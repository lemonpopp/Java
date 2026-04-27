package com.poly.test07;

public class Run {

	public static void main(String[] args) {

		Product p1 = new Book();
		//Product p2 = new SmartPhone();
		
		AProduct a1 = new Book();
		AProduct a2 = new SmartPhone();
		
		System.out.println(a1);
		System.out.println(a2.toString());
		
		//부모 클래스에도 선언되었기에 실행 가능
		a1.abstMethod();
		a2.abstMethod();
		
		//부모 클래스에 선언되지 않은 메소드는 실행 불가
		//a1.printBoook();
		//a2.printSmartPhone();
		
		((Book)a1).printBook();
		((SmartPhone)a2).printSmartPhone();
	}

}
