package com.test.collection.chap02_listSort;

import java.util.Comparator;

public class ScoreNameDesc implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		String name1 = ((Score)o1).getName();
		String name2 = ((Score)o2).getName();

		return name1.compareTo(name2) * -1;
		
	}
	
}
