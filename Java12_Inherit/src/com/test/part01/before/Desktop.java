package com.test.part01.before;

import java.util.Date;

public class Desktop {
	//필드
	private String brand;	//제조사
	private String productNumber;	//상품번호
	private String productCode;	//상품코드
	private String productName;	//상품명
	private String cpu;	//cpu
	private int ssd;	//ssd
	private int ram;	//ram
	private String os;	//운영체재
	private int price;		//가격
	private Date date;	//제조일
	private boolean allInOne;	//일체형 여부
	
	//생성자
	public Desktop() { /*super();*/}

	public Desktop(String brand, String productNumber, String productCode, String productName, String cpu, int ssd,
			int ram, String os, int price, Date date, boolean allInOne) {
		super();
		this.brand = brand;
		this.productNumber = productNumber;
		this.productCode = productCode;
		this.productName = productName;
		this.cpu = cpu;
		this.ssd = ssd;
		this.ram = ram;
		this.os = os;
		this.price = price;
		this.date = date;
		this.allInOne = allInOne;
	}

	//getter&setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getSsd() {
		return ssd;
	}

	public void setSsd(int ssd) {
		this.ssd = ssd;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public void prnInfo() {
		System.out.println(brand+", "+productNumber+", "+productCode+", "+productName+", "+cpu+", "+ssd+", "+
									ram+", "+os+", "+price+", "+date+", "+allInOne);
	}
	
	
}