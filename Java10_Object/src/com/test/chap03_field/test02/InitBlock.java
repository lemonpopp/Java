package com.test.chap03_field.test02;

public class InitBlock {
	
	//1.기본값으로 초기화
	//private String pName;
	//private int price;
	//private static String brand;
	
	//2.명시적 초기화
	private String pName = "아이폰";
	private int price = 1000000;
	private static String brand = "애플";
	
	//3.초기화 블럭
	{
		//인스턴스 블록 : 객체를 만들때 마다 실행
		pName = "갤럭시";
		price = 1100000;
		
		brand = "삼성";
		//객체 생성 이후 값을 초기화하는 인스턴스 블록이기에 이전
		//스태틱 블럭에서 초기화된 값을 덮어씌운다.
	}
	static {
		//static 블록 : 프로그램 시작 시 실행
		//non-static 필드 초기화 못한다.
		//pName = "맥북";
		//price = 15000000;
		brand = "Apple";
	}
	
	//생성자
	//4. 생성자를 이용한 초기화
	//매개변수가 있는 생성자를 이용해 초기화하며 객체 생성이 가능하다.
	//위에서 초기화된 값을 다 덮어씌우고 전달받은 값으로 초기화.
	public InitBlock(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		InitBlock.brand = brand;
	}
	public InitBlock(){}
	
	
	
	//데이터 처리 함수
	//[1]필드에 값을 수정하는 기능
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static void setBrand(String brand) {
		InitBlock.brand = brand;
	}
	//[2]필드에 값을 반환해주는 기능
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public static String getBrand() {
		return brand;
	}
	
	
	public void information() {
		//필드에 저장된 값을 출력!
		System.out.println(pName+", "+price+", "+brand);
	}
}
