package com.test.collection.chap01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {
	public void testArrayList() {
		//ArrayList
		
		int[] a = new int[4];
		
		ArrayList alist = new ArrayList();
		
		//다형성
		List list = new ArrayList();
		
		//ArrayList : 저장 순서 유지, 중복 저장 가능	
		//데이터 추가 : add()
		alist.add("apple");
		alist.add(123);	//auoBoxing (기본 자료형 ->객체)
		alist.add(45.67);
		alist.add(new Date());
		
		System.out.println("alist: " + alist.toString());
		
		//인덱스로 접근
		System.out.println(alist.get(2));
		//배열의 크기 : length
		//리스트의 크기 : size()
		for(int i=0; i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		
		
		//ArrayList 중복 저장 허용
		alist.add("apple");
		System.out.println("alist: "+alist);
		
		//리스트에 내가 원하는 위치에 추가
		alist.add(1,"banana");
		System.out.println("allist: "+alist);
		
		//삭제
		//remove(index)
		alist.remove(3);
		System.out.println("allist: "+alist);
		
		//수정
		alist.set(3, true);
		System.out.println("allist: "+alist);
		
		System.out.println(alist.size() + "개");
		System.out.println(alist.isEmpty());
		alist.clear();
		System.out.println(alist.size() + "개");
		System.out.println(alist.isEmpty());
	}
	
	public void testArrayListSort() {
		//기본 제공되는 sort(), 오름차순
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("orange");
		list.add("mango");
		list.add("banana");
		list.add("grape");
		list.add("melon");
		
		System.out.println("list: "+list);
		
		//list.sort(null);
		Collections.sort(list);
		System.out.println("list: "+list);
		
		//내림차순
		//Iterator 반복자 활용
		Iterator dIter = new LinkedList(list).descendingIterator();
		
		ArrayList descList = new ArrayList();
		
		while(dIter.hasNext()) {
			descList.add(dIter.next());
		}
		System.out.println("descList: "+descList);	
	}

}
