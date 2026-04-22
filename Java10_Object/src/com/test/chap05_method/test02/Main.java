package com.test.chap05_method.test02;

public class Main {

	public static void main(String[] args) {
		
		NonStaticMethodTest test =new NonStaticMethodTest();
		
		test.method1();
		
		//리턴타입과 일치하는 자료형의 변수에 리턴값을 담아서 사용
		//String str = test.method2();
		//System.out.println(str);
		System.out.println(test.method2());
		
		test.method3(10, 20);

		int sum = test.method4(6,4);
		System.out.println("sum: " + sum);
		System.out.println("sum: " + test.method4(154, 152));
		
		//
		StaticMethodTest.method01();
		
		System.out.println("10과 100의 합은 " + StaticMethodTest.method02());
		
		StaticMethodTest.method03("레몬팡");
		
		String res = StaticMethodTest.method04("레몬");
		System.out.println(res);
	}

}
