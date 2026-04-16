package com.practive;

import java.util.Scanner;

public class Test {
	Scanner sc = new Scanner(System.in);
	
	public void sample1() {
		int korean;
		int english;
		int math;
		int sum;
		double avg;
		System.out.print("국어 점수 입력 : ");
		korean = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		english = sc.nextInt();
		System.out.print("수힉 점수 입력 : ");
		math = sc.nextInt();
		sum = korean + english + math;
		avg = sum / 3;
		String score = ((avg >=60)&&(korean>=40)&&(english>=40)&&(math>=40)) ? "합격" : "불합격";
		System.out.println(score);
	}
	
	public void sample2() {
		String name;
		int grade;
		int classNum;
		int num;
		char gender;
		double score;
		System.out.print("학생 이름 입력 : ");
		name = sc.next();
		System.out.print("학년 입력 : ");
		grade = sc.nextInt();
		System.out.print("반 입력 : ");
		classNum = sc.nextInt();
		System.out.print("번호 입력 : ");
		num = sc.nextInt();
		System.out.print("성별(M/F) 입력 : ");
		gender = sc.next().charAt(0);
		String gen =(gender == 'M')? "남학생":"여학생";
		System.out.print("성적(소숫점 아래 둘째까지) 입력 : ");
		score = sc.nextDouble();
		
		System.out.println(grade+"학년 "+classNum+"반 "+num+"번 "+gen+" "+name+"은 성적이 "+score+"이다.");
	}
	public void sample3() {
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		String txt = (num>=0)? "양수다":"양수가 아니다";
		System.out.println(txt);
	}
	public void sample4() {
		int num;
		String txt;
		System.out.print("숫자 입력 : ");
		num = sc.nextInt();
		txt = (num%2 == 0)? "짝수다":"홀수다";
		System.out.print(txt);
			
	}
}
