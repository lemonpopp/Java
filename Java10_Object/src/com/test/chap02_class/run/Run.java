package com.test.chap02_class.run;

//import com.test.chap02_class.model.DefaultClassTest;

import com.test.chap02_class.model.PublicClassTest;

public class Run {

	public static void main(String[] args) {
		
		//default class 객체 생성
		//DefaultClassTest dc = new DefaultClassTest();
		//외부 패키지에서 접근이 불가능, 에러 발생
		
		//public class 객체 생성
		PublicClassTest pct = new PublicClassTest();
		pct.test();
	}

}
