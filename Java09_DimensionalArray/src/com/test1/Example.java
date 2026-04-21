package com.test1;

public class Example {

	public static void main(String[] args) {
		Example e1 = new Example();
		//e1.ex1();
		e1.ex2();
		
	}

	
	public void ex1() {
		//2차원 배열을 생성(5*5)
		//값을 저장
		/*
		 * 1	2	3	4	5
		 * 10	9	8	7	6
		 * 11	12	13	14	15
		 * 20	19	18	17	16
		 * 21	22	23	24	25
		 */
		//출력을 통해 확인
		int[][] arr = new int[5][5];
		int n=1;
		for(int i=0; i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0; j<arr[i].length;j++) {
					arr[i][j] = n;
					n++;
				}				
			}else {
				for(int j=arr[i].length-1; j>=0; j--) {
					arr[i][j] = n;
					n++;
				}
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void ex2() {
		//2차원 배열을 생성(5*5)
		int[][] arr = new int[5][5];
		//값을 저장
		int n = 1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[j][i] = n++;
			}
		}
		
		/*
		 * 1	6	11	16	21	
		 * 2	7	12	17	22
		 * 3	8	13	18	23
		 * 4	9	14	19	24
		 * 5	10	15	20	25
		 */
		//출력을 통해 확인
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
