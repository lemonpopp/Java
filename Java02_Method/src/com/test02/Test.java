package com.test02;
import com.test01.MethodTest01;

public class Test extends MethodTest01{
	public void test() {
		super.publicMethod();
		super.protectedMethod(); // MethodTest01을 상속받은 Test에서 protected 접근이 가능하다.
	}
}
