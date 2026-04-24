package com.test.part03.override;

public class Run {

	public static void main(String[] args) {
		Book b1 = new Book("어린 왕자","앙투안 드 생텍쥐페리", 9800);
		Book b2 = new Book("돈 키호테", "미겔 데 세르반테스", 19000);

		//toSrint() 사용하여 객체 출력
		System.out.println("b1: " + b1.toString());
		System.out.println("b2: " + b2.toString());
		System.out.println();
		
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
		
		
		//
		
		System.out.println(b1 == b2);
		System.out.println("b1과 b2를 비교: " + b1.equals(b2));
		
		//얕은 복사(주소만 복사)
		Book b3 = b1;
		
		System.out.println(b1 == b3);
		System.out.println("b1과 b3를 비교: " + b1.equals(b3));
		System.out.println(b1.hashCode());
		System.out.println(b3.hashCode());
		
		//b1과 동일한 값을 가지는 b4 객체 생성
		Book b4 = new Book("어린 왕자","앙투안 드 생텍쥐페리", 9800);

		//객체안의 값이 같을 때 같다고 판단하겠다.
		System.out.println("b1과 b4를 비교: " + b1.equals(b4));
		//equals 오버라이딩 전에는 b1.equals(b4) => false
		//오버라이딩 후 같은 값을 가지는 b1,b4 => true
		//System.out.println(b1.hashCode());
		//System.out.println(b4.hashCode());
		
		
		//equals 값은 true인데 hashcode 값이 다르다면
		//서로 다른 객체로 취급할 수 있기에 문제가 발생할 수 있다.
		//따라서 hashCode() 함께 오버라이딩한다.
		System.out.println(b1.hashCode());
		System.out.println(b4.hashCode());
		
		System.out.println(b1.equals(b4));
	}

}
