package com.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.silsub1.model.dao.BookDao;
import com.collection.silsub1.model.vo.Book;

public class BookManager {
    private BookDao bd = new BookDao();
    private Scanner sc = new Scanner(System.in);

    public BookManager() {}

    public void addBook(Book book) {
        try {
            int lastNo = bd.getLastBookNo();
            book.setBNo(lastNo + 1);
        } catch(IndexOutOfBoundsException e) {
            book.setBNo(1);
        }

        bd.addBook(book);
    }

    public int deleteBook(int no) {
        return bd.deleteBook(no);
    }

    public int searchBook(String title) {
        return bd.searchBook(title);
    }

    public Book selectBook(int index) {
        return bd.selectBook(index);
    }

    public ArrayList<Book> selectAll() {
        return bd.selectAll();
    }

    public Book[] sortedBookList() {
        ArrayList<Book> list = bd.sortedBookList();

        Book[] bk = new Book[list.size()];

        for(int i = 0; i < list.size(); i++) {
            bk[i] = list.get(i);
        }

        return bk;
    }

    public void printBookList(Book[] br) {
        for(Book b : br) {
            System.out.println(b);
        }
    }
}