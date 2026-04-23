package com.test.part00;

public class Car {
	private String color;
	private int speed;
	
	public Car() {}
	public Car(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	public int getSpeed() {
		return speed;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void accel() {
		System.out.println("속도가 올라갑니다.");
		setSpeed(getSpeed()+10);
	}
	
	public void breakPedal() {
		System.out.println("속도가 줄어듭니다.");
		setSpeed(getSpeed()-10);
	}
	
	public String info() {
		return "현재 속도는 " + speed + "입니다.";
	}
	
}
