package com.test.part02.after;

import java.util.Date;

public class Computer extends Product{
	private String cpu;
	private int ssd;
	private int ram;
	private String os;
	
	public Computer() {}

	//부모 필드까지 초기화하며 생성되는 생성자를 만들자
	public Computer(String brand, String productNumber, String productCode, String productName, int price, Date date,
			String cpu, int ssd, int ram, String os) {
		super(brand, productNumber, productCode, productName, price, date);
		this.cpu = cpu;
		this.ssd = ssd;
		this.ram = ram;
		this.os = os;
		
		System.out.println("product를 상속받은 Computer 클래스의 생성자 호출 완료");
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
	
	@Override
	public String prnInfo() {
		return super.prnInfo() + ", "+ cpu + ", " + ssd +", " + ram +", " + os;
	}
}
