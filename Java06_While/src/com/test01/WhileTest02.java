package com.test01;
import java.util.Scanner;

public class WhileTest02 {

	public void testDoWhile01() {
		int i =1;
		
		do {
			System.out.println("i: " + i);
			i++;
		}while(i <=10);
		
		//
		System.out.println("==========");
		int j=1;
		do {
			System.out.println("j: " + j);
			j++;
		}while(j==10);
	}
	
	public void testDoWhile02() {
		//키보드로 영어 문자열을 입력받아 출력
		//단, "end" 입력을 하게 되면 반복문 종료
		Scanner sc = new Scanner(System.in);
		String str = null;
	
		/*[1]
		do {
			System.out.print("문자열 입력: ");
			str = sc.nextLine();
			System.out.println("str: "+str);
		}while(!(str.equals("end")));
		*/
		//String 값 같은지 비교하려면 String 클래스의 equals() 활용

		//[2]
		do {
			System.out.print("문자열 입력: ");
			str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}
			System.out.println("str: "+str);
			
		}while(true);
		
		
	}
}
