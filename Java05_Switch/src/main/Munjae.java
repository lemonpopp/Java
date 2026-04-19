package main;
import java.util.Scanner;

public class Munjae {
	Scanner sc = new Scanner(System.in);

	public void test1() {
		int korean;
		int math;
		int english;
		
		System.out.print("국어 점수 : ");
		korean = sc.nextInt();
		System.out.print("영어 점수 : ");
		english = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		
		int avgScore = (korean+english+math) / 3;
		if((korean>=40)&&(english>=40)&&(math>=40)&&(avgScore>=60)) {
			System.out.println("합격");
			System.out.printf("점수 합 : %d, 평균 : %d",(korean+english+math),avgScore);
		}else {
			System.out.println("불합격");
		}
	}
	
	public void test2(){
		System.out.print("***초기 메뉴***\n"
				+ "1. 입력\n"+
				"2. 수정\n"+
				"3. 조회\n"+
				"4. 삭제\n"+
				"7. 종료\n"+
				"메뉴번호 입력 : ");
		int num = sc.nextInt();
		
		switch(num){
			case 1:
				System.out.println("입력메뉴가 선택되었습니다.");
				break;
			case 2:
				System.out.println("수정메뉴가 선택되었습니다.");
				break;
			case 3:
				System.out.println("조회메뉴가 선택되었습니다.");
				break;
			case 4:
				System.out.println("삭제메뉴가 선택되었습니다.");
				break;
			case 7:
				System.out.println("프로그램이 종료되었습니다.");
				break;
			default:
				System.out.println("번호가 잘 못 입력되었습니다.\n"
						+"다시 입력하십시오.");
		}		
	}	
	
	public void test3(){
		int num;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		if(num>=0) {
			System.out.println("양수다.");
		}else {
			System.out.println("양수가 아니다.");
		}
	}
	
	public void test4(){
		int num;
		String str;
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		if(num%2==0) {
			str = "짝수다.";
		}else {
			str = "홀수다.";
		}
		System.out.println(str);
	}
	
	public void inputTest(){
		String name;
		int age;
		double height;
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("키 입력 : ");
		height = sc.nextDouble();
		
		if((name != null)&&(name.length()>0)&&(age>0)&&(height>0)) {
			System.out.printf("확인 : %s의 나이는 %d세이고, 키는 %.1fcm 이다.", name,age,height);
		}
	}
	
	public void test6(){
		int a, b;
		System.out.print("첫번째 정수 : ");
		a=sc.nextInt();
		System.out.print("두번째 정수 : ");
		b=sc.nextInt();
		if(a>0 && b>0) {
			System.out.printf("%d + %d = %d \n",a,b,(a+b));
			System.out.printf("%d - %d = %d \n",a,b,(a-b));
			System.out.printf("%d * %d = %d \n",a,b,(a*b));
			System.out.printf("%d / %d = %d \n",a,b,(a/b));
			System.out.printf("%d %% %d = %d",a,b,(a%b));
		}	
	}
	
	public void test7(){
		int score;
		char grade;
		do{
			System.out.print("점수 입력 : ");
			score = sc.nextInt();			
		}while(score < 0);
		
		if(score >=90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >=70) {
			grade = 'C';
		}else if(score >=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		
		System.out.printf("점수 : %d 학점 : %c",score,grade);
	}
	

}
