package com.silsub1.model;

public class Sample {

	public void munjae1() {
		int[][] arr = new int[4][4];
		
		for(int i =0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]= (int)(Math.random()*100)+1;
			}
		}
	}

}
