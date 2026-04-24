package com.poly.test05;

public abstract class AreaImpl implements Area {

	private String result;
	
	@Override
	public void print() {
		System.out.println(Area.PRINT + result);
	}
	
	public void setResult(String result) {
		this.result = result;
	}

}
