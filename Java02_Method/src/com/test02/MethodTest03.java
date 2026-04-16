package com.test02;

import com.test01.MethodTest01;

public class MethodTest03 {
	public static void main(String[] args) {
		MethodTest01 mt01 = new MethodTest01();
		mt01.publicMethod();
		// mt01.protectedMethod();
		// mt01.defaultMethod();
		
		MethodTest01.staticMethod();
	}
}
