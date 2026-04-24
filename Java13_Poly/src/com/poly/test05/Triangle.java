package com.poly.test05;

import java.util.Scanner;

public class Triangle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 입력: ");
		int x = sc.nextInt();
		System.out.print("높이 입력: ");
		int h = sc.nextInt();
		
		double res = (double)x*h/2;
		
		setResult(String.format("%.2f", res));
	}
	
	@Override
	public void print() {
		System.out.print("삼각형의 ");
		super.print();
	}

}
