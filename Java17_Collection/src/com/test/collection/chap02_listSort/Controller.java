package com.test.collection.chap02_listSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Controller {
	public void test() {
		//Score 객체를 저장하는 ArrayList 생성
		List list = new ArrayList();
		
		list.add(new Score("레몬팡",99));
		list.add(new Score("오렌지팡",65));
		list.add(new Score("키위팡",83));
		
		list.add(new Score("딸기팡",52));
		list.add(new Score("사과팡",73));
		list.add(new Score("망고팡",81));
		
		System.out.println("list: "+list);
		
		//1.Comparable - 기본 정렬 기준
		//해당 클래스(객체 생성하는 클래스, Score)에 구현
		//Score 객체 정렬
		//2.Comparator - 기본 정렬 기준 이외 다른 정렬 기준 구현
		//새로운 클래스에 구현
		//Score 객체 나이 오름차순 정렬
		
		//Comparable로 정렬
		list.sort(null);
		System.out.println("list: "+list);
		
		//Comparator로 정렬
		list.sort(new ScorePointAsc());
		System.out.println("list: "+list);
		
		//이름 내림차순, 점수 내림차순 정렬을 할 수 있게
		//클래스 생성하고 그 기준에 맞춰 완성하기
		//ScoreNameDesc.java
		//ScorePointDesc.java
		
		Collections.sort(list, new ScoreNameDesc());
		System.out.println("list: "+list);
		list.sort(new ScorePointDesc());
		System.out.println("list: "+list);
		
	}
}
