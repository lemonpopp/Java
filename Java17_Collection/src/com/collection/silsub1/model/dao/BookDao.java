package com.collection.silsub1.model.dao;

import java.util.ArrayList;

import com.collection.silsub1.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	
	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}
}
