package com.test.chap02_stringBuffer_stringBuilder;

public class Run {
	public static void main(String[] args) {
		//Run.test01();
		Run.test02();
	}
	
	public static void test01() {
		//가변, 불변
		String str = "안녕하세요! ";
		System.out.println("str: "+str+", 주소: "+System.identityHashCode(str));
		
		str += "반가워요~ ";
		System.out.println("str에 추가 후: "+str+", 주소: "+System.identityHashCode(str));
		
		//StringBuffer sbf = new StringBuffer("안녕! ");
		StringBuilder sbf = new StringBuilder("안녕! ");
		System.out.println("sbf: "+sbf+", 주소: " + System.identityHashCode(sbf));
		sbf.append("이제 밥 먹을 시간이야!");
		System.out.println("sbf 추가 후: "+sbf+", 주소: " + System.identityHashCode(sbf));
	}
	
	public static void test02() {
		
		//StringBuilder sb = new StringBuilder("우리는 ");
		StringBuffer sb = new StringBuffer("우리는 ");
		System.out.println(sb);
		
		sb.append("오늘도 ");
		sb.append("열심히 ");
		System.out.println(sb);
		System.out.println(sb.length());
		
		sb.insert(0, "월요일: ");
		System.out.println(sb);
		
		sb.delete(0, 5);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
	}

}
