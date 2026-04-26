package com.poly.silsub1.shape.controller;

import com.poly.silsub1.shape.model.vo.Shape;
import com.poly.silsub1.shape.model.vo.Triangle;
import com.poly.silsub1.shape.model.vo.Circle;
import com.poly.silsub1.shape.model.vo.IShape;
import com.poly.silsub1.shape.model.vo.Rectangle;

public class ShapeManager {
	
	public void calcShape(){
		Shape s; 

		s = new Circle (15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : " + s.area());
		System.out.println("사각형둘레 : " + s.perimeter());

	}
	
	public void calcShapeArray(){

		IShape[] iarr = new IShape[5];

		//5개의 객체를 무작위로(마음대로) 생성함(Circle, Rectangle, Triangle)	
		iarr[0] = new Circle(15.5);
        iarr[1] = new Rectangle(34.5, 42.7);
        iarr[2] = new Triangle(10.0, 20.0);
        iarr[3] = new Circle(7.5);
        iarr[4] = new Triangle(6.0, 8.0);
		//for loop 문으로 각 객체의 면적과 둘레를 출력 처리함
		//단, Triangle 객체는 빗변길이도 출력 처리함
        
        for (int i = 0; i < iarr.length; i++) {
            System.out.println("===== " + (i + 1) + "번째 도형 =====");
            System.out.println("면적 : " + iarr[i].area());
            System.out.println("둘레 : " + iarr[i].perimeter());

            if (iarr[i] instanceof Triangle) {
                Triangle t = (Triangle) iarr[i];
                System.out.println("빗변길이 : " + t.getHypotenuse());
            }

            System.out.println();
        }
		
	}

}
