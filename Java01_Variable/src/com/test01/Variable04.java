package com.test01;

public class Variable04 {
	// main
	public static void main(String[] args){
		// Variable01 클래스에 작성해둔 var02메소드 실행
		
		// 1. 준비
		// 클래스 변수명 = new 클래스();
		Variable01 test = new Variable01();
		// 2. 실행
		test.var02();
		
		Variable04 test2 = new Variable04();
		
		test2.test();
	}
	
	public void test() {
		// 오버플로우
		// byte bnum = 128;
		// 에러, 범위를 벗어난 값을 저장하려면 에러 발생
		
		// 계산 과정에서 범위를 벗어나면 오버플로우 처리
		byte bnum = 127;
		bnum++;
		// 값이 순환 : 최대값 127 -> 최솟값 -128
		
		System.out.println(bnum); // -128 출력
		
		bnum = (byte)(bnum - 1); // byte + int->int (형변환 필요)
		
		System.out.println(bnum); // 127 출력
		
	}
}
