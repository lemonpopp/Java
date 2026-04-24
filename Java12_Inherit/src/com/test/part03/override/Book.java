package com.test.part03.override;

public class Book {
	//필드
	private String title;
	private String writer;
	private int price;
	
	//생성자
	Book(){}
	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	//getter&setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return title + ", " + writer + ", " + price;
	}
	
	//Object의 equals()는 두 객체의 주소값 비교 후 같으면 true, 다르면 false
	//객체가 가진 값을 비교하여 같은 객체인지 판단하기 위해 오버라이딩
	@Override
	public boolean equals(Object obj) {
		//Object obj => 모든 타입의 객체를 다 받겠다.
		
		//두 객체의 주소값을 비교 했을 때 같으면 무조건 같은 타입
		if(this == obj) {
			return true;			
		}
		
		//전달받은 객체가 null -> 무조건 다른 객체
		if(obj == null) {
			return false;
		}
		
		//두 객체의 필드값들을 비교
		Book other = (Book)obj;
		
		if(this.title == null) {
			if(other.title != null) {
				return false;
			}
		}else if(!this.title.equals(other.title)) {
			//두 값이 다르면 false 리턴
			return false;
		}
		
		if(writer == null) {
			if(other.writer != null) {
				return false;
			}
		}else if(!writer.equals(other.writer)) {
			return false;
		}
		
		if(price != other.price) {
			return false;
		}
		
		//ㅇ위에 모든 조건을 통과하면 두 객체는 같은 값을 가지는 같은 객체로 판단
		return true;
	}
	
	@Override
	public int hashCode() {
		return (title+price+writer).hashCode();
	}

}
