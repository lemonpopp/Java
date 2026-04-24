package com.poly.test05;

import java.util.Scanner;

public class Circle extends AreaImpl{

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력: ");
		int r = sc.nextInt();
		
		double res = Math.PI*r*r;
		super.setResult(String.format("원의 %.2f", res));
	}

}
