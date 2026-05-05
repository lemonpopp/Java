package com.collection.silsub1.model.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.collection.silsub1.model.comparator.AscCategory;
import com.collection.silsub1.model.vo.Book;

public class BookDao {
	private ArrayList<Book> bookList;
	
	public BookDao() {
		bookList = new ArrayList<Book>();
	}
	
	public BookDao(ArrayList<Book> list) {
		bookList = list;
	}
	
	public int getLastBookNo() {
		return bookList.get(bookList.size() - 1).getBNo();
	}
	
	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getBNo() == no) {
                bookList.remove(i);
                return 1;
            }
        }

        return 0;
	}
	
	public int searchBook(String title) {
		 for(int i = 0; i < bookList.size(); i++) {
	            if(bookList.get(i).getTitle().contains(title)) {
	                return i;
	            }
	        }

	        return -1;
	}
	
	public Book selectBook(int index) {
		return bookList.get(index);
		
	}
	
	public ArrayList<Book> selectAll(){
		return bookList;
		
	}
	
	public ArrayList<Book> sortedBookList() {
        ArrayList<Book> sortList = new ArrayList<Book>(bookList);

        Collections.sort(sortList, new AscCategory());

        return sortList;
    }
}
