package com.poly.test05;

import java.util.Scanner;

public class Square extends AreaImpl {

	@Override
	public void make() {
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 길이: ");
		int w = sc.nextInt();
		System.out.print("세로 길이: ");
		int h = sc.nextInt();
		
		int res = w * h;
		//super.setResult(res+"");
		//super.setResult(String.format("%d", res));
		super.setResult(String.valueOf(res));
	}
	
	@Override
	public void print() {
		System.out.print("사각형의 ");
		super.print();
	}

}
