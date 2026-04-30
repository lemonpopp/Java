package com.test.collection.chap04_map;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public void test1() {
		//HashMap
		HashMap hmap = new HashMap();
		
		//데이터 추가
		//put(key, value)
		hmap.put("one",LocalDate.now());
		hmap.put(12,"apple");
		hmap.put(34,123);
		//key,value 모두 반드시 객체'
		
		System.out.println("hmap: " + hmap);
		
		//키는 중복 저장되지 않음
		hmap.put(12, "banana");
		System.out.println("hmap: " + hmap);
		
		//벨류는 중복 저장 허용
		hmap.put(11, "banana");
		hmap.put(10, "banana");
		System.out.println("hmap: " + hmap);
		
		//value 가져오기
		System.out.println(hmap.get(10));
		
		//삭제
		hmap.remove(10);
		System.out.println("hmap: " + hmap);
			
	}
	
	public void test2() {
		//map에 저장된 객체 연속 처리
		HashMap map = new HashMap();
		
		map.put("one","키보드");
		map.put("two","마우스");
		map.put("three","무선충전기");
		map.put("four","에어팟");
		map.put("five","텀블러");
		
		//1. keySey() - key만 set으로 만든다
		Set keys = map.keySet();
		Iterator keyIt = keys.iterator();
		while(keyIt.hasNext()) {
			String key = (String)keyIt.next();
			String value = (String)map.get(key);
			System.out.println(key + "=" + value);
		}
		
		//Object[] oar = keys.roArray(); 이렇게도 가능
		
		//2. entrySet() - Map의 내부클래수(중첩클래스) Map.Entry를 set로 만든다.
		//Entry = key + value를 묶어둔 객체
		Set set = map.entrySet();
		Iterator entryIt = set.iterator();
		while(entryIt.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIt.next();//Entry 객체를 가져온다.
			
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println(key+ "="+value);
		}
		
		//3. values() - value 값들만 Collection으로 만든다
		Collection values = map.values();
		//iterator(), toArray()
		Object[] arr = values.toArray();
		for(int i=0; i<arr.length; i++) {
			String val = (String)arr[i];
			System.out.println(val);
		}
	}
	
	public void test3() {
		HashMap map = new HashMap();
		
		map.put("1", new Score("레몬",100));
		map.put("2", new Score("사과",90));
		map.put("3", new Score("오렌지",80));
		
		map.put("4", new Score("사과",90));
		
		System.out.println(map);
		
		map.clear();
		map.put(new Score(), "one");
		map.put(new Score("레몬",100), "two");
		System.out.println(map);
		map.put(new Score("레몬",100), "three");
		System.out.println(map);
	}
	
//	class test{
//		내부클래스(중첩클래스)
//	}
}
