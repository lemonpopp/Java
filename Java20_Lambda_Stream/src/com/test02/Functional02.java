package com.test02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Functional02 {
	public static void main(String[] args) {
		func01();
		func02();
	}

	public static void func01() {
		//Function 함수형 인터페이스
		// R apply(T t); 매개변수 O, 반환값 O
		//Function<매개변수 타입, 리턴 타입>
		Function<Integer, String> time = n -> (n<10) ? "0"+n : ""+n;
		System.out.println(time.apply(1));
		System.out.println(time.apply(6));
		System.out.println(time.apply(20));
	}
	
	public static void func02() {
		BiFunction<String, String, Integer> sum = (i, j) -> Integer.parseInt(i) + Integer.parseInt(j);
		System.out.println("sum: "+sum.apply("10","20"));
	}
}
