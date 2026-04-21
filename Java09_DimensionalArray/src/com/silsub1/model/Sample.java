package com.silsub1.model;

import java.util.Scanner;

public class Sample {

	public void munjae1() {
		//1. 4행4열 2차원배열 선언 및 생성
		int[][] arr = new int[4][4];
		//2. 0행0열부터 2행2열까지 1부터 100사이의 임의의 정수값 기록해 넣음
		for(int i =0; i<3; i++) {
			int rsum = 0;
			for(int j=0; j<3; j++) {
				arr[i][j]= (int)(Math.random()*100)+1;
				rsum += arr[i][j];
			}
			arr[i][3] = rsum;
		}
		
		for(int i =0; i<arr.length; i++) {
			int csum = 0;
			for(int j=0; j<arr[i].length; j++) {
				csum += arr[j][i];
			}
			arr[3][i] = csum;
		}
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public void munjae2() {
		Scanner sc = new Scanner(System.in);
		//1. 3행짜리 2차원배열 선언 및 생성
		int[][] arr = new int[3][];
		
		//2. 각 행별 열갯수는 키보드로 입력받아 생성함
		System.out.print("첫 번째 열 개수 입력 : ");
		int col = sc.nextInt();
		arr[0]= new int[col];
		System.out.print("두 번째 열 개수 입력 : ");
		col = sc.nextInt();
		arr[1]= new int[col];
		System.out.print("세 번째 열 개수 입력 : ");
		col = sc.nextInt();
		arr[2]= new int[col];
		
		//3. 1~100사이의 임의의 정수를 모든 방에 기록함
		
		for(int i = 0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j] = (int)(Math.random()*100+1);
			}
		}
		//4. 각 행별 열의 합계가 5의 배수인 행열값만 출력함
		for(int i = 0; i<arr.length;i++) {	
			for(int j=0; j<arr[i].length;j++) {
				if((arr[i].length) % 5 == 0) {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
