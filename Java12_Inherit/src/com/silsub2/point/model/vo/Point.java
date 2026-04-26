package com.silsub2.point.model.vo;

public class Point {

	public int x;
	public int y;
	
	public Point() {};
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	};
	
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.println("x좌표 : "+x+"/ny좌표 : "+ y);
	}
}
