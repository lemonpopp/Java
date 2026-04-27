package com.test.chap01_runtimeException;

import java.util.Random;
import java.util.Scanner;

public class RunExceptiomPrac {
	Scanner sc = new Scanner(System.in);
	
	public void aruthEx() {
		//ArithmeticException
		int no1 = 10;
		int no2 = 0;
		
		//System.out.println(no1/no2);//ArithmeticException
		//System.out.println(no1%no2);//ArithmeticException
		//System.out.println(no1/0.0);//Infinity
		
		int ran = 0;
		
		while(true) {
			System.out.print("나눌 수를 입력[음수 입력 시 종료]: ");
			int inputNo = sc.nextInt();
			if(inputNo<0) {
				break;
			}
			
			if(inputNo == 0) {
				System.out.println("0이 아닌 값을 입력하세요.");
			}else {				
				//1~10 랜덤값
				ran = new Random().nextInt(10)+1;
				int res = ran / inputNo;
				System.out.println(ran + "/" + inputNo +"=" + res);
			}
		}
	}
	
}
