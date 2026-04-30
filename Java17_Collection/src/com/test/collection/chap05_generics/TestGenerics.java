package com.test.collection.chap05_generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenerics {
	//제네릭 : 컬렉션에 저장되는 객체의 자료형에 제한을 거는 기능
	//       + 클래스나 매소드 내부에 다루려는 데이터의 타입을 지정
	
	public void test1() {
		//컬렉션에는 여러 종류의 객체 저장 가능
		List list = new ArrayList();
		
		list.add(new Book());
		list.add(new Student());
		list.add(new Score());
		
		System.out.println("저장된 객체 수: "+list.size());
		System.out.println("list: "+list);
		
		for(int i=0; i<list.size();i++) {
			Object obj = list.get(i);
			
			System.out.println(obj.toString());
			if(obj instanceof Book) {
				//obj에 저장된 객체가 Book 타입인지 확인
				((Book)obj).printBook();
			}else if (obj instanceof Student) {
				((Student)obj).prnStudent();
			}else if(obj instanceof Score) {
				((Score)obj).printScore();
			}
		}
		
	}
	
	public void test2() {
		//제네릭스 기능 활용
		//컬렉션에 한 종류의 객체만 저장 가능
		ArrayList<Book> list = new ArrayList<Book>();
		ArrayList list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
		
		list2.add(new Book());
		list2.add(new Book());
		
		//반복문을 활용하여 list, list2에 저장된 객체에 printBook() 실행
		for(int i=0; i<list.size();i++) {
//			Book b = list.get(i);
//			b.printBook();
			
			list.get(i).printBook();
		}
		
		for(int i=0; i<list2.size();i++) {
//			Book b = (Book)list2.get(i);
//			b.printBook();
			
			//위와 같이 한 줄로 실행 (ex-list.get(i).printBook())
			((Book) list2.get(i)).printBook();
		}
		
	}
	
	public void test3() {
		//Map에 제네릭 설정
		HashMap<String, Book> map = new HashMap<String, Book>(); 
		map.put("one", new Book());
		map.put("two", new Book());
		map.put("three", new Book());
		
		//entrySet() 이용
		Set<Map.Entry<String,Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String,Book>> iter = entry.iterator();
		
		while(iter.hasNext()) {
			Map.Entry<String, Book> ent = iter.next();
			String key = ent.getKey();
			Book value = ent.getValue();
			System.out.println(key+"="+value);
			
		}
	}
}
//하나의 클래스 파일 안에 여러 클래스 작성이 가능
//하지만 public 접근 제한자는 파일명과 동일한 class에만 붙인다.

class Book{
	public void printBook() {
		System.out.println("printBook() call...");
	}

	@Override
	public String toString() {
		return "Book";
	}

	
}

class Student{
	public void prnStudent() {
		System.out.println("prnStudent() call...");
	}

	@Override
	public String toString() {
		return "Student";
	}
	
}

class Score{
	public void printScore() {
		System.out.println("printScore() call...");
	}

	@Override
	public String toString() {
		return "Score";
	}
	
}