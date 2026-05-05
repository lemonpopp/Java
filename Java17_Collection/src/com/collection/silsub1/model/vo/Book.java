package com.collection.silsub1.model.vo;

public class Book {
	private int bNo;
	private int category;
	private String title;
	private String author;
	
	public Book() {}
	
	public Book(int category, String title, String author) {
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	public void setBNo(int bNo) {
		this.bNo=bNo;
	}
	
	public int getBNo() {
		return bNo;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	 @Override
	 public String toString() {
		 String categoryName = "";

		 switch(category) {
	        case 1:
	            categoryName = "인문";
	            break;
	        case 2:
	            categoryName = "자연과학";
	            break;
	        case 3:
	            categoryName = "의료";
	            break;
	        case 4:
	            categoryName = "기타";
	            break;
	        default:
	            categoryName = "잘못된 분류";
	      }

	      return bNo + "번 / " + categoryName + " / " + title + " / " + author;
	 }
	
	
}
