package com.collection.silsub1.controller;

import java.util.Scanner;

import com.collection.silsub1.model.dao.BookDao;
import com.collection.silsub1.model.vo.Book;

public class BookManager {
	private BookDao bd = new BookDao();
	private Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
	public void addBook(Book book) {
		int num = (Integer)book.getBNo();
		
	}
	
//	public void test() {
//		bd.test();
//	}
	
}
