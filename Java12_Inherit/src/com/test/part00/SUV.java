package com.test.part00;

public class SUV extends Car {
	public SUV() {}
	public SUV(String color) {
		super(color);
		System.out.println(color+"색 SUV 생성");
	}
	
	@Override
	public void accel() {
		System.out.println("속도가 천천히 올라갑니다.");
		setSpeed(super.getSpeed()+5);
	}
	
	@Override
	public void breakPedal() {
		System.out.println("속도가 천천히 줄어듭니다.");
		super.setSpeed(super.getSpeed()-5);
	}
}
