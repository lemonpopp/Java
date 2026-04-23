package com.test02.controller;

import java.util.Scanner;

import com.test02.model.vo.Person;

public class PersonController {
	
	Scanner sc = new Scanner(System.in);
	private Person[] people = new Person[2];

	//회원 추가
	public void insertPerson() {
		
		for(int i=0; i<people.length; i++) {		
			System.out.println("==사원 정보 입력==");
			System.out.print("이름: ");
			String name = sc.nextLine();
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("재산: ");
			int wealth = sc.nextInt();
			sc.nextLine();
			
			people[i] = new Person(name, age, wealth);
		}
	}
	
	//회원 전체 조회
	public void printPerson() {
		for(int i=0; i<people.length; i++) {
			System.out.println(people[i].info());
		}
	}
	
	//재산 평균 조회
	public void avgWealth() {
		int sum = 0;
		
		for(int i=0; i<people.length; i++) {
			sum += people[i].getWealth();
		}
		int avg = sum / people.length;
		System.out.println("회원들의 평균 재산 : " + avg);
	}
	
	//회원 이름으로 검색
	public void searchPerson() {
		System.out.print("검색할 이름: ");
		String search = sc.next();
		
		for(int i=0; i<people.length; i++) {
			if(people[i].getName().equals(search)) {
			  	System.out.println(people[i].info());
			}
		}
	}
}
