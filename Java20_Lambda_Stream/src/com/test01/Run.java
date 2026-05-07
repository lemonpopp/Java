package com.test01;

public class Run {
/*
 * 람다식(Lambda Expression) : 메서드를 하나의 표현식으로 간결하게 표현한 익명함수
 * 		(매개변수)->{실행코드;}
 * 		클래스 정의 없이 실행코드를 직접 작성해 코드를 줄인다.
 * 		주로 함수형 인터페이스(추상메서드가 하나인 인터페이스) 구현에 사용
 */
	public static void main(String[] args) {
		//익명 클래스를 이용하여 Runnable 인터페이스 구현
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("hi");
			}
		};
		r.run();
		
		//람다식
		Runnable r2 = () -> System.out.println("hello");
		r2.run();
		
		//----------------------
		//Test01 인터페이스 사용
		
		//익명 클래스
		Test01 test01_0 = new Test01() {
			@Override
			public void prn() {
				System.out.println("test01_0, 익명클래스");

			}
		};
		test01_0.prn();
		
		//()->{code;}
		Test01 test01_1 = () -> {
			System.out.println("test01_1");
			System.out.println("람다식");
		};
		test01_1.prn();
		
		//(param) -> {code;}
		Test02 test02_1 = (int n) -> System.out.println("input no: "+n);
		test02_1.prn(5);
		
		Test02 test02_2 = (n) -> System.out.println("input no: "+n);
		test02_2.prn(20);
		
		Test02 test02_3 = n -> System.out.println("input no: "+n);
		test02_3.prn(22);
		
		//(param) -<{code; return;}
		Test03 test03_1 = n -> n*n;
		System.out.println("Test03 prn(): "+test03_1.prn(5));
		
		Test03 test03_2 = n -> {
			System.out.println(n+"입력");
			return n*n*n;
		};
		System.out.println(test03_2.prn(8));
		
		//(param,param)->{code; return;}
		Test04 test04_1 = (n, m) -> {
			System.out.println("n: "+ n +", m: "+m);
			return n+m;
		};
		int no = test04_1.prn(5, 3);
		System.out.println("test04_1.prn(): "+no);
	}

}
