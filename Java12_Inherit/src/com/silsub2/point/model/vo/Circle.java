package com.silsub2.point.model.vo;

public class Circle extends Point{
	
	public int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	};
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		double PI = Math.PI;
		double area = radius * radius *PI;
		double perimeter = radius * 2 *PI;
		System.out.printf("원의 중심 좌표 : (%d, %d), 원의 넓이 %.1f, 원의 둘레 %.1f \n", x, y, area,perimeter);
	}
	
}
