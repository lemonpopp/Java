package com.test.part02.after;

import java.util.Date;

public class Desktop extends Computer{

	private boolean allInOne;
	
	public Desktop() {}

	

	public Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int ssd, int ram, String os, boolean allInOne) {
		super(brand, productNumber, productCode, productName, price, date, cpu, ssd, ram, os);
		
		this.allInOne = allInOne;
		System.out.println("computer 상속받은 desktop 클래스 생성자 호출 완료...");
	}



	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	};
	
	@Override
	public String prnInfo() {
		return super.prnInfo()+", " + allInOne;		
	}
	
}
