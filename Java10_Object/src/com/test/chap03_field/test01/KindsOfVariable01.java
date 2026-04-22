package com.test.chap03_field.test01;

//변수 선언 위치에 따른 구분
public class KindsOfVariable01 {//클래스 영역의 시작
	//클래스 영역에 작성하는 변수를 필드라 한다.
	//필드 == 멤버변수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용할 수 있는 변수)
	private int globalNum;
	
	public void testMethod(int num) {//메서드 영역의 시작
		//메서드 영역에서 작성하는 변수를 지역변수라고 한다.
		//메서드 괄호 안에 선언하는 변수를 매개변수라 하며, 일종의 지역변수
		int localNum;
		int localNo=0;
		
		System.out.println(globalNum);	//전역 변수는 클래스 전역에서 사용 가능
		
		//지역변수 사용하기 위해서는 초기화가 필요
		//System.out.println(localNum);
		System.out.println(localNo);
		
		System.out.println(num);//매개변수는 메서드 호출 시 값이 넘어와서 저장되기 때문데 초기화 필요X
		
	}//메서드 영역의 끝
	
	public void testMethod2() {
		System.out.println(globalNum);
		//System.out.println(localNo); //지역변수는 해당 지역(블록 내)에서만 사용 가능

		if(true) {
			int localNum = 0;
			System.out.println(localNum);
		}
		//System.out.println(localNum); //if문 안에서 선언을 한 localNum 변수 이기에 if문 안에서만 사용 가능
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
		}
		//System.out.println(i);
	}
	
}//클래스 영역의 끝
