package com.test01;

public class ArrayTest02 {
	
	public static void main(String[] args) {
		//배열 생성 및 데이터 초기화
		char[] ch = new char[26];
		for(int i =0; i<ch.length; i++) {
			ch[i] = (char)((int)'a' + i);
		}
		
		//1. a~z 배열에 저장된 값 출력
		prn(ch);
		
		//2. 배열을 거꾸로 출력
		reverse(ch);
		
		//3. 배열에 저장된 영어를 대문자로 바꾸어 출력
		upper(ch);
	}
	
	public static void prn(char[] ch) {
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}
	
	public static void reverse(char[] ch) {		
		for(int i = ch.length-1;i>=0;i--) {
			System.out.print(ch[i]+ " ");
		}
		System.out.println();
		
		char re[] = new char[26];
		int tmp = 0;
		for(int i=ch.length-1;i>=0;i--) {
			re[tmp] = ch[i];
			tmp++;
		}
		prn(re);
	}
	
	public static void upper(char[] ch) {
		for(int i=0; i<ch.length;i++) {
			//1.
			//ch[i] = Character.toUpperCase(ch[i]);
			
			//2.
			System.out.print((char)(ch[i]-32) + " ");
		}
		System.out.println();
	}
}
