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
		//배열,리스트 -> 크기 - 1 == 마지막 인덱스
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
	
	//해당 인덱스에 Book 객체 리턴
	public Book selectBook(int index) {
		return bookList.get(index);
		
	}
	
	public ArrayList<Book> selectAll(){
		return bookList;
		
	}
	
	public ArrayList<Book> sortedBookList() {
        ArrayList<Book> list = new ArrayList<>(bookList);

        list.sort(new AscCategory());

        return list;
    }
}
