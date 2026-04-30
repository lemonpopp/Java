package com.test.collection.chap05_generics;

import java.util.List;

public class TestGenerics3<D, T> {
	private D key;
	private T val;
	
	public D getKey() {
		return key;
	}
	public void setKey(D key) {
		this.key = key;
	}
	public T getVal() {
		return val;
	}
	public void setVal(T val) {
		this.val = val;
	}
	
	public List<Double> test(){
		return null;
	}
	
}
