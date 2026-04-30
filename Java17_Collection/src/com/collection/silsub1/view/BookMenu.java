package com.collection.silsub1.view;

import java.util.Scanner;

import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public void mainMenu() {
		System.out.println("*** 도서 관리 프로그램 ***");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서정보 정렬 후 출력");
		System.out.println("3. 도서 삭제");
		System.out.println("4. 도서 검색출력");
		System.out.println("5. 전체 출력");
		System.out.println("6. 끝내기");
		System.out.print("메뉴 번호 선택: ");
		int num = sc.nextInt();
		switch(num) {
			case1:
				
			case2:
			case3:
			case4:
			case5:
			case6:
			defalut:
				return bm.main();
		}
					
	}
	
	public Book inputBook() {
		System.out.print("도서 제목 : ");
		String title = sc.next();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
		int category = sc.nextInt();
		
		System.out.print("도서 저자 :");
		String author = sc.next();
		
		return new Book(1,category,title,author);
		
	}
	
	public int inputBookNo() {
		System.out.print("도서 번호 : ");
		int bno = sc.nextInt();
		return bno;
		
	}
	
	public String inputBookTitle() {
		System.out.println("도서 제목: ");
		String title = sc.next();
		return title;
	}
}
