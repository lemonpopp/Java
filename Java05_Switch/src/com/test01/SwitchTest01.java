package com.test01;

public class SwitchTest01 {
	//switch문
	//if는 순차적으로 코드를 읽어가며 조건에 맞춰 처리
	//switch는 해당하는 case로 점핑
	public void testSwitch01() {
		int no = 2;
		
		switch(no) {
		case 1:
			System.out.println("1입니다.");
			break;//Switch 종료
		case 2:
			System.out.println("2입니다.");
			return; //메소드 종료
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("다른 숫자입니다.");
		}
		
		//
		char ch = 'b';
		switch(ch) {
		case 'a':
			System.out.println("a입니다.");
			break;
		case 'b':
			System.out.println("b입니다.");
			break;
		case 'c':
			System.out.println("c입니다.");
			break;
		default:
			System.out.println("다른 영어입니다.");
		
		}
	}
	
	public void testSwitch02() {
		int month = 4;
		
		//12,1,2: 겨울
		//3,4,5: 봄
		//6,7,8: 여름
		//9,10,11: 겨울
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("가을");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		}
	}
	
	       //void => 메소드 실행 후 리턴값 ㅇ벗다
	       //String => 리턴타입, 메소드 실행 후 리턴해주는 결과값의 타입
	public String testSwitch03() {
		int no = 2;
		
		switch(no) {
		case 1:
			return "1입니다.";
		case 2:
			return "2입니다.";
		case 3:
			return "3입니다.";
		default:
			return "1,2,3이 아닙니다.";
		}
		
	}
	
	public String testSwitch04() {
		int day = 5;
		
		//switch expression
		return switch(day) {
			case 0 -> "SUNDAY"; //day가 0이면 "SUNDAY" 반환
			case 1 -> "MONDAY";
			case 2 -> "TUESDAY";
			case 3 -> "WEDNESDAY";
			case 4 -> "THURSDAY";
			case 5 -> "FRIDAY";
			case 6 -> "SATURDAY";
			default -> "invalid day";	
			//반드시 하나의 값을 반환해야 하기 때문에 default 필요
		};
		
	}

}
