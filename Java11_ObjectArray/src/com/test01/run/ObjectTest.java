package com.test01.run;

import java.util.Scanner;

import com.test01.model.Book;

public class ObjectTest {

	public static void main(String[] args) {
		Book bk1 =new Book("어린 왕자","앙투안 드 생텍쥐페리", "예담", 9800);
		Book bk2 =new Book("이것이 자바다", "신용권", "한빛미디어", 18000);
		Book bk3 =new Book("돈 키호테", "미겔 데 세르반테스", "열린책들", 19000);
		
		//출력
		System.out.println(bk1.informarion());
		System.out.println(bk2.informarion());
		System.out.println(bk3.informarion());
		
		//도서 제목으로 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String search = sc.nextLine();
		
		if(bk1.getTitle().equals(search)) {
			System.out.println(bk1.informarion());
		}else if(bk2.getTitle().equals(search)) {
			System.out.println(bk2.informarion());
		}else if(bk3.getTitle().equals(search)) {
			System.out.println(bk3.informarion());
		}else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

}
