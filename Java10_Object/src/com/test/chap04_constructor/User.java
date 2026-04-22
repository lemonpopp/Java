package com.test.chap04_constructor;

import java.util.Date;
//crtl+shift+m : add import

public class User {
	//필드
	private String userId;
	private String userPwd;
	private String userName;
	private Date date;
	
	//생성자
	//생성자의 사용 목적
	//1. 객체를 생성해 주기 위한 목적
	//2. 매개 변수 전달받능 값으로 필드를 초기화 할 목적
	
	//주의사항
	//1. 반드시 클래스명과 동일
	//2. 리턴형이 존재하지 않는다.
	
	//기본 생성자 : 초기화하지 못하고 객체만 생성할 때 사용
	public User() {}
	
	//매개변수생성자 : 객체생성과 필드 초기화 두가지 목적으로 사용
	//오버로딩을 적용
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public User(String userId, String userPwd, String userName, Date date) {
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		this(userId, userPwd,userName);
		this.date = date;
	}
	
	//메소드
	//getter 메소드(필드값 반환)
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public Date getDate() {
		return date;
	}
	
	//setter 메소드(필드값 저장)
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setuserName(String userName) {
		this.userName = userName;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	/*
	 * getter() : 리턴타입은 필드의 타입과 동일하게, 메소드명 get으로 시작해서 필드명 추가!(단 필드명의 첫글자는 대문자)
	 * public 리턴타입 get필드명(){
	 * 	return 필드;
	 * }
	 * setter() : 매개변수의 타입은 변경하려는 필드와 동일한 타입, 메소드명 set으로 시작해서 필드명 추가!(단 필드명의 첫글자는 대문자)
	 * public void set필드명(매개변수){
	 * 	this.필드 = 매개변수;
	 * }
	 * 
	 */
	
	//출력용 메소드
	public void info() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + date);
	}
	
	
	
}
