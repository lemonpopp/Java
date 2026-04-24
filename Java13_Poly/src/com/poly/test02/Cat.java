package com.poly.test02;

public class Cat extends Base{
	
	@Override
	public void start() {
		System.out.println("고양이 출발!");
	}
	
	@Override
	public void stop() {
		System.out.println("고양이 스톱!");
	}

}
