package com.test02;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Functional04 {
	public static void main(String[] args) {
		//Supplier : 매개변수 X, 리턴값 O
		//출력만(리턴만)
		Supplier<Integer> rnum = () -> (int)(Math.random()*50)+1;
		System.out.println(rnum.get());
		
		//Consumer : 매개변수 O, 리턴값 X
		//입력만(매개변수만)
		Consumer<String> hello = (name) -> System.out.println("Hello, " + name);
		hello.accept("Lambda");
	}

}
