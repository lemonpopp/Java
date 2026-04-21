package com.test.chap01_encapsulation;

public class Account {
	//멤버변수(필드)
	private String name = "레몬팡";
	private String accNo = "010-1234-5678";
	private String pwd = "1234";
	private int bankCode = 12;
	private int balance = 0;
	
	//생성자 : 객체를 생성하기 위한 일종의 메서드
	public Account() {}
	
	//입금 위한 메서드
	public void deposit(int money) {
		if(money>0) {
			balance += money;
			System.out.println(name + "님의 계좌에 " + money + "원이 입금되었습니다.");
		}else {
			System.out.println("잘못된 금액이 입력되었습니다.");
		}
	}
	
	//출금 위한 메서드
	public void withdraw(int money) {
		if(money < balance) {
			balance -= money;
			System.out.println(name + "님의 계좌에서 " + money + "원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	//잔액 조회 위한 메서드
	public void displayBalance() {
		System.out.println(name + "님의 잔액: " + balance + "원");
	}
	
}
