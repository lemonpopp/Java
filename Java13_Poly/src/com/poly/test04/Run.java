package com.poly.test04;

public class Run {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.eat("츄르");
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat("개껌");
		dog.bite();
		
		Eagle eagle = new Eagle();
		eagle.bark();
		eagle.eat("고기");
		eagle.fly();

	}

}
