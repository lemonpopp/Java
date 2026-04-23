package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		//객체 배열 선언 및 할당
		//int[] arr = new int[4];
		Book[] bk = new Book[3];
		
		//초기화
		bk[0] = new Book("어린 왕자","앙투안 드 생텍쥐페리", "예담", 9800);
		bk[1] = new Book("이것이 자바다", "신용권", "한빛미디어", 18000);
		bk[2] = new Book("돈 키호테", "미겔 데 세르반테스", "열린책들", 19000);
		
		System.out.println(bk); //Book[]
		System.out.println(bk[0]); //Book
		System.out.println(bk[0].getPrice()); //int
		System.out.println(bk[2].getWriter()); //String
		
		//도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(search)) {
				System.out.println(bk[i].informarion());
			}
				
		}
		
	}

}
