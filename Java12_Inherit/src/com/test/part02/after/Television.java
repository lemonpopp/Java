package com.test.part02.after;

import java.util.Date;

public class Television extends Product {
	private int inch;
	
	public Television() {}

	public Television(String brand, String productNumber, String productCode, String productName, int price, Date date,
			int inch) {
		
		//부모의 생성자 호출
		super(brand, productNumber, productCode, productName, price, date);
		//자식 클래스의 필드 초기화
		this.inch = inch;
		System.out.println("product를 상속받은 television 클래스의 생성자 호출 완료");
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String prnInfo() {
//		return super.getBrand()+", "+super.getProductNumber()+", "+super.getProductCode()+", "+
//				super.getProductName()+", "+super.getPrice()+", "+super.getDate()+", "+inch;
		
		//부모의 필드 출력용 매소드가 리턴해주는 문자열을 받아
		//inch를 추가해서 리턴한다.
		return super.prnInfo() +", " + inch;
	}
	
}
