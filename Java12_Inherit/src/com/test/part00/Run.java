package com.test.part00;

public class Run {
	public static void main(String[] args) {
		Car c1 = new Car("노란");
		c1.accel();
		c1.accel();
		System.out.println(c1.info());
		c1.breakPedal();
		System.out.println(c1.info());
		
		SUV s1 = new SUV("검은");
		
		s1.accel();
		s1.accel();
		System.out.println(s1.info());
		s1.breakPedal();
		System.out.println(s1.info());
		
		System.out.println(s1.getColor());
	}

}
