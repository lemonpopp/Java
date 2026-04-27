package com.test.chap04_WrapperClass;

public class Run {

	public static void main(String[] args) {
		//WrapperClass
		//java.lang 패키지

	
		//프로그램에 따라 기본타입의 데이터가 객체로 취급되어야 할 경우가 있다.
		// -Boxing : 기본 자료형 => Wrapper 클래스 객체
		// -UnBoxing : Wrapper 클래스 객체 -> 기본 자료형
		
		//Boxing
		Integer i = new Integer(10);//deprecated : 더이상 사용하지 않는 기능, 이전에 작성한 코드들은 동작할 수 있도록 유지
		Integer i2 = new Integer(2);	
		Double d = new Double(10.0);
		
		System.out.println(i==i2);
		System.out.println(i.equals(i2));
		System.out.println(i.compareTo(i2));
		
		//AutoBoxing
		Integer i3 = 10;
		Short s = 10;
		Double d2 = 3.14;
		
		String str = "string";
		
		//UnBoxing
		int pi = i.intValue();
		double pd = d.doubleValue();
		
		//AutoUnBoxing
		int a = i2;
		int b = i3;
		abox(i2+i3);
		//int >> (autoBoxing) >> Integer >> (다형성) >> Object
		
	}
	public static void abox(Object obj) {
		System.out.println((Integer)obj);
	}
	
	public static void strToPri() {
		//String => Primitive
		int i = Integer.parseInt("2");
		i = Integer.valueOf("4");
		
		double d = Double.parseDouble("8.0");
		d = Double.valueOf("8.0");
		
		boolean tf = Boolean.parseBoolean("true");
		tf = Boolean.valueOf("true");
		
		//pri => String
		String si = Integer.valueOf(4).toString();
		si = 4 + "";
	}

}
