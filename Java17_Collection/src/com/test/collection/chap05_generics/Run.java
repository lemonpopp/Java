package com.test.collection.chap05_generics;

public class Run {

	public static void main(String[] args) {
		TestGenerics tg = new TestGenerics();
		//tg.test1();
		//tg.test2();
		//tg.test3();
		
		String[] arr = {"apple", "banana", "mango"};
		TestGenerics2<String> my = new TestGenerics2<String>(arr);
		my.prn();
		
		TestGenerics3<String, Integer> my2 = new TestGenerics3<String, Integer>();
		
		my2.setKey("one");
		my2.setVal(10);
		System.out.println(my2.getVal()*20);
	}

}
