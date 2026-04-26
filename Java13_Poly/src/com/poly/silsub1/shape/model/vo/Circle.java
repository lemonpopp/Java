package com.poly.silsub1.shape.model.vo;

public class Circle extends Shape implements IShape{

	double PI = Math.PI;
	public double radius;
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}



	public double getPI() {
		return PI;
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius*radius*PI;
	}
	@Override
	public double perimeter() {
		return radius*2*PI;
	}
	
	
}
