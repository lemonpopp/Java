package com.test.collection.chap03_set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {
	public void testHashSet() {
		//Hashset
		HashSet hset = new HashSet();
		
		//다형성
		Set hset2 = new HashSet();
		
		hset.add(new String("Java"));
		hset.add(new Integer(123));
		hset.add(new Double(45.67));
		hset.add(LocalDate.now());
		hset.add(new Character('A'));
		
		//저장 순서 유지 X
		System.out.println("hset: "+hset);
		
		hset.add(new String("Java"));
		hset.add(new Integer(123));
		
		System.out.println("hset: "+hset);
		System.out.println("저장된 객체 수: "+hset.size());
		System.out.println("포함 여부: "+hset.contains(new String("Java")));

		//저장된 객체에 하나씩 접근
		//[1]iterator() 사용: 저장된 객체들을 목록으로 만들어 준다. 줄을 세운다
		Iterator it = hset.iterator();
		while(it.hasNext()) {//다음에 가져올 데이터 있는지 확인하는 메소드
			System.out.println(it.next());//줄서있는 데이터를 가져온다
		}
		System.out.println("한번 더!!");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//출력하지 않는다. 이미 사용된 iterator이므로 커서가 마지막에 위치
		
		//[2]toAttay() 사용
		Object[] arr= hset.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//삭제
		hset.remove(new String("Java"));
		System.out.println(hset);
		hset.clear();
		System.out.println(hset.isEmpty());
	}
	
	public void testHashSet2() {
		//데이터 중복 저장 확인
		
		Set<Member> set = new HashSet<Member>();
		//<Member> => 제네릭, 컬렉션에 저장 가능한 객체의 타입을 지정
		
		set.add(new Member("레몬",20));
		set.add(new Member("오렌지",21));
		set.add(new Member("애플",22));
		System.out.println(set);
		//set.add("Java");제네릭 설정으로 set에는 Member 객체만 저장 가능
		
		set.add(new Member("오렌지",21));
		set.add(new Member("애플",22));
		
		System.out.println(set);
		
		//hashcode, equals 오버라이딩
		
	}
	
	
}
