package com.poly.test07;

public class Book extends AProduct implements Product {

	@Override
	public void testMethod() {
		
	}

	@Override
	public void abstMethod() {
		
	}
	
	public void printBook() {
		System.out.println("book클래스의 printBook()");
	}
	
	@Override
	public String toString() {
		return "Book클래스의 toString()...";
	}

}
