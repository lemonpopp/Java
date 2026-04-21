package com.test1;
import java.util.Random;
import java.util.Scanner;

public class DeArrayTest {

	public static void main(String[] args) {
		
		DeArrayTest da = new DeArrayTest();
		//da.testDeArray01();
		//da.testDeArray02();
		//da.testDeArray03();
		//da.testDeArray04();
		//da.testDeArray05();
		da.testDeArray06();
	}
	public void testDeArray01() {
		//2차원배열 선언
		//선언을 하게 되면 stack에 변수가 생성
		int[][] iarr1;
		int iarr2[][];
		
		//할당
		iarr1 = new int[3][5];
		
		//
		iarr2 = new int[3][];
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[3];
		iarr2[2] = new int[7];
		
		for(int i=0; i<iarr2.length; i++) {
			for(int j=0; j<iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public void testDeArray02() {
		int [][] iarr = new int[3][5];
		
		//배열에 값 저장
		//배열 인덱스로 하나하나 접근
		iarr[0][0] = 1;
		iarr[0][1] = 2;
		iarr[0][2] = 3;
		iarr[0][3] = 4;
		iarr[0][4] = 5;
		
		//반복문(이중 for문)이용해서
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = j+1;
			}
		}
		
		//배열에 저장된 값 출력
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.print(iarr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void testDeArray03() {
		int[][] iarr = new int[5][5];
		
		System.out.println(iarr);
		System.out.println(iarr[0]);
		System.out.println(iarr[0][0]);
		
		int[][] arr = new int[5][];
		System.out.println(arr);
		System.out.println(arr[0]);
		//System.out.println(arr[0][0]); nullpointerException 발생
		//System.out.println(arr[5]); ArrayIndexOutOfBoundsException 발생
	}
	
	public void testDeArray04() {
		//int[][] iarr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		int[][] iarr = {{1,2,3},{4,5,6,7,8,9},{10,11,12,13,14},{15}};
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void testDeArray05() {
		//행의 길이가 3, 열의 길이가 4인 2차원 배열을 만들고
		//1부터 12까지의 값으로 초기화 하여 출력하는 코드 작성
		int iarr[][] = new int[3][4];
		
		int a = 1;
		//초기화
		for(int i =0; i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				iarr[i][j]=a;
				a++;
			}
		}
		
		//출력
		for(int i =0; i<iarr.length;i++) {
			for(int j=0; j<iarr[i].length;j++) {
				System.out.print(iarr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void testDeArray06() {
		//이차원 	배열의 크기를 키보드로 입력 받고 (1~10)
		//생성한 이차원 배열에(char 타입) 알파벳 랜덤으로 넣기
		Scanner sc = new Scanner(System.in);
		
		//키보드로 입력
		System.out.print("행 크기 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 입력 : ");
		int col =sc.nextInt();
		//생성한 배열에 초기화
		char[][] cArr = new char[row][col];
		for(int i=0; i<0+cArr.length;i++) {
			for(int j=0;j<cArr[i].length;j++) {
				//cArr[i][j] = (char)(Math.random()*26+65);
				Random r = new Random();
				cArr[i][j]=(char)(r.nextInt(26)+65);
			}
		}
		
		//출력
		for(int i=0; i<0+cArr.length;i++) {
			for(int j=0;j<cArr[i].length;j++) {
				System.out.print(cArr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
