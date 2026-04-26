package com.silsub2.point.model.vo;

public class Rectangle extends Point {
	public int width;
	public int height;
	
	public Rectangle() {};
	public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		double area = width * height;
		double perimeter = (width + height)*2;
		System.out.printf( "사각형 좌측 상단 좌표 : (%d, %d), 면적 : %.1f, 둘레 : %.1f\n", x, y, area, perimeter);
	}
	
}
