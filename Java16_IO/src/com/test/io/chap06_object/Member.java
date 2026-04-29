package com.test.io.chap06_object;

import java.io.Serializable;

					//직렬화(객체->바이트) 처리
public class Member implements Serializable{
	
	private String userId;
	//transient : 직렬화에서 제외
	private transient String userPw;
	private String userName;
	private int age;
	private char gender;
	
	public Member() {}

	public Member(String userId, String userPw, String userName, int age, char gender) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", age=" + age
				+ ", gender=" + gender + "]";
	}
	
	
	

}
