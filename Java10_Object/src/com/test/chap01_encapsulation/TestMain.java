package com.test.chap01_encapsulation;

public class TestMain {

	public static void main(String[] args) {
		//Account 클래스 객체 생성
		Account a = new Account();
		Account b = new Account();
		
		//현재 잔액 조회
		a.displayBalance();
		
		//입금
		a.deposit(100);
		a.displayBalance();
		
		//출금
		a.withdraw(70);
		a.displayBalance();
		
		//a.balance -= 30; // private 적용 후 에러
		
		a.withdraw(10);
		a.displayBalance();
		
		b.displayBalance();
		
	}

}
