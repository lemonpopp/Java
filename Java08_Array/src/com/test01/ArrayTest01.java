package com.test01;

public class ArrayTest01 {
	public void testArray01() {
		int[] arr = new int[5];
		
//		arr[0] = 10;
//		arr[1] = 20;
//		arr[2] = 30;
//		arr[3] = 40;
//		arr[4] = 50;
		
		for(int i=0;i<5;i++) {
			arr[i]=(i+1)*10;
		}
		
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += arr[i];
		}
	}
	
	public void testArray02() {
		//배열의 선언
		//자료형[] 변수명;
		//자료형 변수명[];
		//선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만든는 것
		//int[] iarr;
		//char carr[];
		
		//iarr = new int[]; // 크기를 지정하지 않으면 에러 발생
		//arr = new int[3];
		//carr = new char[5];
		
		//-------------------------
		int[] iarr = new int[5];
		char carr[] = new char[10];
		
		System.out.println("iarr: "+iarr);
		System.out.println("carr: "+carr);
		
		System.out.println("iarr의 hashcode: " + iarr.hashCode());
		System.out.println("carr의 hashcode: " + carr.hashCode());

		System.out.println("iarr의 길이: " + iarr.length);
		System.out.println("carr의 길이: " + carr.length);
		
		//-------------
		int size = 7;
		double[] darr = new double[size];
		System.out.println("darr의 hashcode: " + darr.hashCode());
		System.out.println("darr의 길이: " + darr.length);
		
		//배열의 크기 변경
		//사이즈 변경이 아니고, 새로운 배열을 생성하고 주소값을 덮어씌운거다
		darr = new double[30];
		
		System.out.println("수정 후 darr의 길이: " + darr.length);
		System.out.println("수정 후 darr의 hashcode: " + darr.hashCode());
	
		//배열 삭제
		//실제로 배열을 지울 수는 없으나
		//주소값 대신 null로 변경해 더이상 참조하는 배열이 없게끔 만든다.
		darr = null;
		
		//더이상 참조하지 않게된 배열은 일정 시간 후 gc(거바자콜랙토)가 삭제시킨다.

		System.out.println("darr: "+darr);
		
		//NullPointerException 발생
		System.out.println("darr의 길이: " + darr.length);
		
	}
	
	public void testArray03() {
		int[] iarr = new int[5];
		System.out.println(iarr[0]);
		System.out.println(iarr[1]);
		System.out.println(iarr[2]);
		System.out.println(iarr[3]);
		System.out.println(iarr[4]);
		
		//배열 선언하고 할당 -> jvm이 지정한 값으로 배열이 초기화
		//0으로 초기화 되어 있다
		
		String[] sarr = new String[3];
		System.out.println(sarr[0]);	//null로 자동으로 초기화
		
		//
		//int[] iarr2 = {11,22,33,44,55};
		int[] iarr2 = new int[] {11,22,33,44,55};
		
		for(int i=0; i<iarr2.length; i++) {
			System.out.println(iarr2[i]);
		}
	}
}
