package com.test.part02.after;

import java.util.Date;

//computer 클래스를 상속받아 완성
public class SmartPhone extends Desktop{
	private String mobileAgency;
	
	public SmartPhone() {}

	public SmartPhone(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int ssd, int ram, String os, boolean allInOne, String mobileAgency) {
		super(brand, productNumber, productCode, productName, price, date, cpu, ssd, ram, os, allInOne);
		this.mobileAgency = mobileAgency;
		System.out.println("desktop을 상속받은 smartphone 클래스의 생성자 호출...");
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}

	@Override
	public String prnInfo() {
		return super.prnInfo() +", " + mobileAgency; 
	}
}
