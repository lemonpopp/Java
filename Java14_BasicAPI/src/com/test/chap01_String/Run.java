package com.test.chap01_String;

public class Run {

	public static void main(String[] args) {
		//Run.test01();
		Run.test02();
	}
	//자바 기본 API(Application Programming Interface)

	//String 클래스
	public static void test01() {
		
		//리터럴로 문자열 생성
		String str = "abc";
		String str1 = "abc";
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str == str1);
		System.out.println(str.hashCode());
		System.out.println(str.hashCode());
		
		//String pool
		//문자열 중복을 최대한 제거하기 위해 사용하는 메모리 영역
		
		//[2] 생성자를 통한 문자열 생성
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		//오버라이딩 된 hashcode() 대신 identityHashcode()
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println("---- new ----");
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(str2==str3);
		
		String str4 = "abc";
		System.out.println(System.identityHashCode(str4));
		
		String s = null;
		s = "";
		//char ch = ''; 불가능
		char ch = ' ';
		
		String s1 = new String("ABC");
		String s2 = new String("ABC" + "D");
		String s3 = "ABCD";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	}
	
	public static void test02() {
		//String 관련 대표 메소드들
		//charAt(i) : 해당 인덱스 문자열
		String str = "abcd";
		System.out.println(str.charAt(0));
		
		//concat("") : 문자열과 합치기
		System.out.println(str.concat("efg"));
		
		//contains("") : 포함 여부
		System.out.println(str.contains("bc"));
		
		//equals("") : 비교
		System.out.println(str.equals("abcd"));
		
		//length() : 문자열 길이
		System.out.println(str.length());
		
		//split("") : 특정 문자열을 기준으로 문자열을 나눔
		str = "a,b,c,d";
		String[] res = str.split(",");
		for(int i=0; i<res.length;i++) {
			System.out.println(i + ": "+ res[i]);
		}
		
		//substring() : 잘라내기
		System.out.println(str.substring(2,5));
		
		//trim() : 공백 제거
		str = "    abc    de    ";
		System.out.println(str);
		System.out.println(str.trim());
		
		System.out.println(str.replace(" ", ""));
	}
}
