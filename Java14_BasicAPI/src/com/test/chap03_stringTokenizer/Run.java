package com.test.chap03_stringTokenizer;

import java.util.StringTokenizer;

public class Run {
	public static void main(String[] args) {
		/*
		 * StringTokenizer 클래스
		 * 	:countToken() - 토큰의 수
		 * 	netxtToken() - 토큰 읽어오기
		 * 	hasMoreTokens() - 토큰이 남아있는지 확인
		 * 
		 */
		String str = "레몬팡,20,경기도 성남시,남";
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String arr[] = str.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
