package com.silsub2.point.main;

import com.silsub2.point.model.vo.Circle;
import com.silsub2.point.model.vo.Rectangle;

public class Main {

	public static void main(String[] args) {
		Circle[] circle = new Circle[3];

		circle[0] = new Circle(1,2,3);
		circle[1] = new Circle(4,5,6);
		circle[2] = new Circle(7,8,9);
		
		for(int i =0; i<circle.length; i++) {
			circle[i].draw();
		}
		
		Rectangle[] rec = new Rectangle[3];
		
		rec[0] = new Rectangle(1,2,3,4);
		rec[1] = new Rectangle(5,6,7,8);
		rec[2] = new Rectangle(9,10,11,12);
		for(int i =0; i<rec.length; i++) {
			rec[i].draw();
		}
	}

}
