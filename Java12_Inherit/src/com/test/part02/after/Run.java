package com.test.part02.after;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		//Television(String brand, String productNumber, String productCode, String productName, int price, Date date,int inch)
		Television t = new Television("LG", "03", "L-451DS55", "LG TV", 1700000, new Date(), 45);
		System.out.println(t.prnInfo());
		
		//Desktop(String brand, String productNumber, String productCode, String productName, int price, Date date,String cpu, int ssd, int ram, String os, boolean allInOne)
		Desktop d = new Desktop("Apple", "02", "A-1751FSFE5", "MacBook", 1500000, new Date(), "M5", 512, 32, "mac OS 26", true);
		System.out.println(d.prnInfo());
		
		
		//SmartPhone 객체를 생성하여 필드에 저장된 값을 prnInfo()로 확인
		SmartPhone s = new SmartPhone("Samsung","01","S-26FSDf5","Galaxy S26",1300000, new Date(), "SSS", 512, 16, "AOS 16", false, "KT");
		System.out.println(s.prnInfo());
	}

}
