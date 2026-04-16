package com.test01;

public class Variable06 {
	int num = 10;
	// var test = "test"; 전역변수에서 사용 불가
	public static void main(String[] args) {
		/*
		 * var : 지역변수타입추론(Local Variable Type Inference)
		 * 타입이 없는게 아니다.
		 * 컴파일러가 타입을 써준다.
		 * - 컴파일시 값의 type을 추론 -> 이후에는 다른 type으로 변환 불가
		 * - 지역 변수에만 사용 가능
		 * - 반드시 초기화 필요
		 */
		var no = Integer.valueOf(10);
		System.out.println("no: " + no);
		System.out.println("no*10: " + (no*10));
		
		// var no = 10;
		// 컴파일 시 
		// int no =10; 으로 처리
		
		no = 30; //문제X
		// no = "var"; 에러
		
		// var ch; 선언만은 불가능
		var ch = 'A';
		System.out.println("ch: " + ch);
		
		//
		// Map<String,List<Interger>> map = new HashMap<>();
		// var map = ~~~~();
		
		// getTest가 리턴해주는 값이 무엇인지 명확하게 코드로 확인 불가능
		// var test = getTest();
	}
}
