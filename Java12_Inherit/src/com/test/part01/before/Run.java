package com.test.part01.before;

import java.util.Date;

public class Run {

	public static void main(String[] args) {
		Desktop d = new Desktop("Apple","01","A-12Df58","MacBook","M5",500,32,"mac OS 26",2000000,new Date(),true);
		SmartPhone s = new SmartPhone("Samsung","02","S-17SE56","Galaxy S26","dd", 256, 16,"AOS 16", 1500000, new Date(), "KT");
		Television t = new Television("LG", "03", "L-45DFS5", "LG TV", 3000000, new Date(), 45);
		
		d.prnInfo();
		s.prnInfo();
		t.prnInfo();
	}

}
