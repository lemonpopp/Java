package com.poly.test02;

public class Cow extends Base{
	
	@Override
	public void start() {
		System.out.println("소 출발");
	}
	
	@Override
	public void stop() {
		System.out.println("소 스톱!");
	}
}
