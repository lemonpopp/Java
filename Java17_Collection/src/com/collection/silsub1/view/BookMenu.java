package com.collection.silsub1.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.collection.silsub1.controller.BookManager;
import com.collection.silsub1.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("*** 도서 관리 프로그램 ***");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서정보 정렬 후 출력");
			System.out.println("3. 도서 삭제");
			System.out.println("4. 도서 검색출력");
			System.out.println("5. 전체 출력");
			System.out.println("6. 끝내기");
			System.out.print("메뉴 번호 선택: ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1:
				bm.addBook(inputBook());
				System.out.println("도서가 추가되었습니다.");
				break;
			case 2:
				Book[] br = bm.sortedBookList();
				bm.printBookList(br);
				break;
			case 3:
				int result = bm.deleteBook(inputBookNo());
				
				if(result == 1) {
					System.out.println("성공적으로 삭제되었습니다.");
				} else {
					System.out.println("삭제할 도서가 존재하지 않습니다.");
				}
				break;
			case 4:
				int index = bm.searchBook(inputBookTitle());
				
				if(index == -1) {
					System.out.println("조회한 도서가 존재하지 않습니다.");
				} else {
					System.out.println(bm.selectBook(index));
				}
				break;
			case 5:
				ArrayList<Book> list = bm.selectAll();
				
				if(list.isEmpty()) {
					System.out.println("등록된 도서가 없습니다.");
				} else {
					Iterator<Book> it = list.iterator();
					
					while(it.hasNext()) {
						System.out.println(it.next());
					}
				}
				break;
				
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
					
	}
	
	public Book inputBook() {
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타): ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("도서 저자 :");
		String author = sc.nextLine();
		
		return new Book(category,title,author);
		
	}
	
	public int inputBookNo() {
		System.out.print("도서 번호 : ");
		int bno = sc.nextInt();
		return bno;
		
	}
	
	public String inputBookTitle() {
		System.out.print("도서 제목: ");
		String title = sc.nextLine();
		return title;
	}
}
