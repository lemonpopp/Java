package com.silsub3.run;

import com.silsub3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();

		Circle.setRaduis(3);
		
		double width = Circle.getRaduis()*Circle.getRaduis()*Circle.PI;
		double ference = Circle.getRaduis()*2*Circle.PI;
		
		System.out.println("넓이 : "+width+" 둘레 : "+ference);
		
		c.incrementRadius();
		
		width = Circle.getRaduis()*Circle.getRaduis()*Circle.PI;
		ference = Circle.getRaduis()*2*Circle.PI;
		System.out.println("변경 후 넓이 : "+width+" 변경 후 둘레 : "+ference);
		
	}

}
