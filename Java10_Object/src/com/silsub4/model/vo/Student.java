package com.silsub4.model.vo;

public class Student {

	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{
		classroom = 5;
		name = "레몬팡";
		height = 173.5;
		gender = 'M';
	}
	
	static {
		grade =3;
	}
	
//	public Student() {};
	
	//setter
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//getter
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String name() {
		return name;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return grade+"학년 "+classroom+"반 "+name+" 키 : "+height+" 성별 : "+gender;
	}
}
