package com.test.collection.chap02_listSort;

//vo(value object) 클래스 == dto(data transfer object) 클래스
public class Score implements Comparable{
	private String name;
	private int point;
	
	public Score() {}
	public Score(String name, int point) {
		this.name = name;
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", point=" + point + "]";
	}
	
	@Override
	//기본 정렬 기준
	//name 오름차순 정렬
	public int compareTo(Object o) {
		//비교되는 두 값을 기준으로(name 필드 값)
		//양수를 리턴하면 바꾼다. 음수를 리턴하면 안바꾼다.
		
		String otherName = ((Score)o).getName();
		
		return name.compareTo(otherName);
		//음수 : 자리 안바꾼다.
		//양수 : 자리 바꾼다
		// 0 : 제자리
		//String의 기본 정렬 기준인 오름차순을 그대로 따라서 정렬
		
		//"나".compareTo("가") =>양수
	}
	
}
