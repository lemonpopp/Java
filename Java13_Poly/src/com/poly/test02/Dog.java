package com.poly.test02;

public class Dog extends Base {

	@Override
	public void start() {
		System.out.println("강아지 출발");
	}
	
	@Override
	public void stop() {
		System.out.println("강아지 스톱!");
	}
}
