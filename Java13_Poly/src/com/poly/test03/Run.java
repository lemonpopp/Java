package com.poly.test03;

public class Run {

	public static void main(String[] args) {
		
		Animal ani = new Cat();
		ani.bark();
		ani.eat("생선");
		
		ani = new Dog();
		ani.bark();
		ani.eat("뼈");
		
				

	}

}
