package com.test.collection.chap05_generics;

public class TestGenerics2<T> {
//클래스 선언 시에 타입을 미정으로 선언, 객체를 생성할 때 정해지는 타입
	private T[] array;
	
	public TestGenerics2() {}
	public TestGenerics2(T[] array) {
		this.array = array;
	}
	public void prn() {
		for(T tmp: array) {
			System.out.println(tmp);
		}
	}
}
