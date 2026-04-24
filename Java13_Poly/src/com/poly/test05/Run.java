package com.poly.test05;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("도형 선택 [1:원 2:삼각형 3:사각형]: ");
		int select = sc.nextInt();
		
		Area ar = null;
		
		switch(select) {
		case 1:
			ar = new Circle();
			break;
		case 2:
			ar = new Triangle();
			break;
		case 3:
			ar = new Square();
			break;
		}

		ar.make();
		ar.print();
	}

}
