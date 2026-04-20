package com.test02;

public class BreakContinue {

	public static void main(String[] args) {
		//break : 반복문, 조건문(switch)을 벗어난다.
		//continue : 반복문 내에서 사용, continue문 아래의 내용을 건너띈다.
		
		
		//break
		
		int num = 7;
		int sum = 0;
		for(int i=0; ; i++){
			sum += i;
			if(i==num) {
				break;
			}
		}
		System.out.println("sum : "+sum);
		
		//continue
		sum =0;
		for(int i=1; i<100; i++) {
			if(i%4==0) {
				continue;
			}
			System.out.print(i+"+");
			sum += i;
		}
		System.out.println();
		System.out.println("sum: "+sum);
	}

}
