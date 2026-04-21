package com.test01;

public class ArrayTest03 {

	public static void main(String[] args) {
		//준비
		ArrayTest03 at03 = new ArrayTest03();
		//실행
		//at03.shallowCopy();
		//at03.deepCopy01();
		//at03.deepCopy02();
		at03.deepCopy03();
	}
	
	public void shallowCopy() {
		//얕은 복사 : 주소만 복사
		int[] oArr = {1,2,3,4,5};
		int[] cArr = oArr; 
		
		//oArr 출력
		String str = prn(oArr);
		System.out.println("1. oArr: " + str);
		
		//cArr 출력
		str = prn(cArr);
		System.out.println("2. cArr: " + str);
		
		//oArr의 값 변경
		oArr[0] = 99;
		
		//변경 후 oArr 확인
		str = prn(oArr);
		System.out.println("1. 변경 후 oArr: " + str);
		
		//변경 후 cArr 확인
		str = prn(cArr);
		System.out.println("2. 변경 후 cArr: " + str);
		
		System.out.println("oArr의 hashcode: " + oArr.hashCode());
		System.out.println("cArr의 hashcode: " + cArr.hashCode());
	}
	
	public void deepCopy01() {
		//깊은 복사 : 동일한 형태의 배열을 생성하고 값을 복사
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[5];
		
		String str = prn(oArr);
		System.out.println("oArr: " + str);
		str = prn(cArr);
		System.out.println("cArr: " + str);
		
		//for문 활용해서 1:1 값을 복사
		for(int i=0; i<oArr.length; i++) {
			cArr[i] = oArr[i];
		}
		
		//복사 후 oArr 확인
		str = prn(oArr);
		System.out.println("복사 후 oArr: " + str);
				
		//복사 후 cArr 확인
		str = prn(cArr);
		System.out.println("복사 후 cArr: " + str);
		
		//원본 배열의 값 변경
		oArr[0] = 99;
		
		str = prn(oArr);
		System.out.println("변경 후 oArr: " + str);
		str = prn(cArr);
		System.out.println("변경 후 cArr: " + str);
		
		System.out.println("oArr의 hashcode: " + oArr.hashCode());
		System.out.println("cArr의 hashcode: " + cArr.hashCode());

	}
	
	public void deepCopy02() {
		//arraycopy() 메소드 활용
		//java.lang.System
		
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//src: 원본 배열, srcPos: 복사 시작 위치
		//dest: 카피 배열, destPos: 붙여넣기 시작 위치
		//length: 복사할 길이
		System.arraycopy(oArr, 0, cArr, 3, oArr.length);
		
		String str = prn(oArr);
		System.out.println("oArr: "+ str);
		str = prn(cArr);
		System.out.println("cArr: "+ str);
		
	}
	
	public void deepCopy03() {
		//clone()
		int[] oArr = {1,2,3,4,5};
		int[] cArr = new int[10];
		
		System.out.println("복사 전 cArr의 hashcode : "+cArr.hashCode());
		
		cArr = oArr.clone();
		
		System.out.println("복사 후 cArr의 hashcode : "+cArr.hashCode());
		
		String str = prn(oArr);
		System.out.println("oArr: "+ str);
		str = prn(cArr);
		System.out.println("cArr: "+str);
		
		
		
	}
	
		//String : 리턴타입, 메소드 종료 후 문자열을 되돌려준다
	public String prn(int[] arr){
		String val ="[";
		
		for(int i=0; i<arr.length; i++) {
			val += arr[i] + " ";
		}
		val +="]";
		return val;
	}
}
