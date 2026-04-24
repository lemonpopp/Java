package com.poly.test02;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

		System.out.print("선택[1:고양이 2:강아지 3:송아지]: ");
		int no = new Scanner(System.in).nextInt();	

		Base base = null;
		
		switch(no) {
		case 1:
			base = new Cat();
			break;
		case 2:
			base = new Dog();
			break;
		case 3:
			base = new Cow();
			break;
		}
		
		base.start();
		base.stop();
	}

}
