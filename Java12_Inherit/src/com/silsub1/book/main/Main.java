package com.silsub1.book.main;

import com.silsub1.book.model.vo.Book;

public class Main {

	public static void main(String[] args) {

		Book book1 = new Book("어린 왕자","앙투안 드 생텍쥐페리", 9800);
		Book book2 = new Book("돈 키호테", "미겔 데 세르반테스", 19000);
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book1.equals(book2));
		
		// ===== 얕은 복사 =====
        Book shallowCopy = book1;

        // ===== 깊은 복사 =====
        Book deepCopy = new Book(book1.getTitle(), book1.getAuthor(), book1.getPrice());

        System.out.println("\n===== 얕은 복사 =====");
        System.out.println("주소 같은가? : " + (book1 == shallowCopy));
        System.out.println("내용 같은가? : " + book1.equals(shallowCopy));

        System.out.println("\n===== 깊은 복사 =====");
        System.out.println("주소 같은가? : " + (book1 == deepCopy));
        System.out.println("내용 같은가? : " + book1.equals(deepCopy));
	}

}
