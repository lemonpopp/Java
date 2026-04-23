package com.silsub3.model.vo;

public class Circle {
	
	//상수 필드 , getter,setter 필요 없다
	public static final double PI = 3.14;
	private static int radius;
	
	public Circle() {};
	
	//setter
	public static void setRaduis(int radius) {
		Circle.radius = radius;
	}
	
	//getter
	public static int getRaduis() {
		return radius;
	}
	
	public void incrementRadius() {
		radius += 1;
	}
}
