package com.test.collection.chap02_listSort;

import java.util.Comparator;

public class ScorePointAsc implements Comparator {

	@Override
	//점수 오름차순 정렬
	public int compare(Object o1, Object o2) {
		//리턴값 음수: 자리 바꾸지 않겠다
		//      양수: 자리 바꾸겠다
		int point1 = ((Score)o1).getPoint();
		int point2 = ((Score)o2).getPoint();
		
		if(point1 > point2) {
			return 1;	
			//point1이 더 크기 때문에 자리를 바꾸기 위해 양수 리턴
		}else if(point1 < point2) {
			return -1;
		}else {
			return 0;			
		}
		
	}

}
