package com.test02;

import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Functional03 {
	public static void main(String[] args) {
		//predic01();
		//predic02();
		predic03();
	}
	//Predicate 함수형 인터페이스
	//매겨변수O , 반환값O(반환갑이 Boolean)
	//조건 검사 시 활용
	
	public static boolean isNull(String name, Predicate<String> predic) {
		return predic.test(name);
	}
	
	public static void predic01() {
		String name = null;
		while(true) {
			System.out.print("이름 입력: ");
			name = new Scanner(System.in).nextLine();
			//Predicate<String> predic = (input) -> input.length() == 0;
			if(isNull(name, (input) -> input.length() == 0)) {
				System.out.println("다시 입력");
			}else {
				System.out.println("입력 완료");
				break;
			}
		}
		System.out.println("제 이름은 " + name + "입니다.");
	}
	
	public static void predic02() {
		Predicate<Integer> p1 = n -> {return n%2 ==0;};
		Predicate<Integer> p2 = n -> n%3 ==0;
		
		System.out.println("2의 배수인지 확인");
		System.out.println(p1.test(6));
		System.out.println("3의 배수인지 확인");
		System.out.println(p2.test(7));
		
		//and 연산
		Predicate<Integer> p3 = n -> p1.test(n) && p2.test(n);
		
		System.out.println("2의 배수이면서 3의 배수인지 확인");
		System.out.println(p3.test(6));
		
		Predicate<Integer> p4 = p1.and(p2);
		System.out.println("2의 배수이면서 3의 배수인지 확인");
		System.out.println(p3.test(72));
	}
	
	public static void predic03() {
		//BiPredicate 함수형 인터페이스
		//매개변수 2개, boolean 리턴
		
		BiPredicate<Integer, Integer> bp =(i,j) -> i-j > 0;
		
		System.out.println(bp.test(1, 10));
	}
}
