package com.test.chap03_field.test02;

public class Run {

	public static void main(String[] args) {
		InitBlock p = new InitBlock();
		
		p.information();
		p.setpName("레몬");
		p.setPrice(2000);
		p.setBrand("델몬트");
		p.information();
		
		//매개변수가 있는 생성자를 이용해 객체를 생성
		InitBlock p2 = new InitBlock("픽셀폰", 600000, "구글");
		p2.information();
		
		p2.setPrice(750000);
		p2.information();
		
		
	}

}
