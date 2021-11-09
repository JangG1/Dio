package p137;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// 단순 if문
		/*int a=15, b=15;
		if(a<10 || b<10) {
			System.out.println("참이면 수행 되는 곳.");
			a=a+10;
			System.out.println(a);
		}else {
		System.out.println("거짓이면 수행 되는 곳");
		}
		System.out.println("공동으로 출력되는 곳");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수값 1개 입력==>");
		int number = sc.nextInt();
		if(number >= 0) {
			System.out.println("양의 정수입니다.");
		}else {
		System.out.println("음의 정수입니다.");
		}
		
		if(number%5 == 0) {
			System.out.println(number + "수는 5의 배수입니다.");
		}else {
			System.out.println(number + "수는 5의 배수가 아닙니다.");
		}*/
		
		
		//정수 x가 90이상 100이하일 때 출력하기
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("정수값 1개 입력==>");
		int x = sc.nextInt();
		if(x>=90 && x<=100 ) //&& 그리고
			System.out.println("정수 x가 90이상 100이하일 때 출력하기");*/

		//정수 x가 0보다 작거나 100보다 클 때
		/*int x1=76;
		if(x1<0 || x1>100) {
			System.out.println("정수 x가 0보다 작거나 100보다 클 때");
		}
		
		//정수 x가 3의 배수지만 2의 배수는 아닐때  	//!= 아닐때
		int x2=33;
		if(x2%3 == 0 && x2%2 !=0) {
			System.out.println("정수 x가 3의 배수지만 2의 배수는 아닐때");
		}
		
		//문자 ch가 공백이거나 탭 또는 개행문자일때
		char ch='\t';
		if(ch==' ' || ch=='\t' || ch=='\n')
			System.out.println("문자 ch가 공백이거나 탭 또는 개행문자일때");
		
		//문자 ch가 대문자일때
		char ch1='A';
		if(ch1>='A' && ch1<='Z')
			System.out.println("문자 ch가 대문자일때");
		
		//문자 ch가 소문자일 때
		char ch2='a';
		if(ch2>='a' && ch2<='z')
			System.out.println("문자 ch가 소문자일때");
		
		//문자열 str의 내용이 "yes"일 때(대소문자 구분)
		String str="yes";
		if(str.equals("yes")) //String은 Class 이기 때문에 == 안쓰고 .equals 을 사용함
			System.out.println("문자열 str의 내용이 yes");
		
		//문자열 str의 내용이 "yes"일 때(대소문자 구분안함)
		String str1="YES";
		if(str1.equalsIgnoreCase("yes")){ //equalsIgnoreCase 대소문자 무시
			System.out.println("문자열 str의 내용이 yes");
		}*/	
		
	    //문제1 점수입력
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력==>");
		int score = sc.nextInt();
		
		if(100 >= score && score >= 96) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"A+학점 입니다.");
		}else if(95 >= score && score >= 91) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"A0학점 입니다.");
		}else if(90>= score && score >= 86) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"B+학점 입니다.");
		}else if(85>= score && score >= 81) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"B0학점 입니다.");
		}else if(80>= score && score >= 76) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"C+학점 입니다.");
		}else if(76>= score && score >= 71) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"C0학점 입니다.");
		}else if(70>= score && score >= 66) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"D+학점 입니다.");
		}else if(66>= score && score >= 61) {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"D0학점 입니다.");
		}else {
			System.out.println("당신의 점수는 "+ score +"점입니다."+"F학점 입니다.");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요==>");
		int jumsu = sc.nextInt();
		String hakjum=null;//null 자료를 아직 넣지 않았다. 
		boolean error=false;
		String opt="o";
		if(jumsu<0 || jumsu > 100) { //500   85<0 false 또는 85>100
			error=true;
		}
		if(jumsu >= 90 && !error) { //97
			hakjum="A";
			if(jumsu>=95) {
				opt="+";
			}
			
		}else if(jumsu >= 80 && !error) {
			hakjum="B";
			if(jumsu>=85) {
				opt="+";
			}
		}else if(jumsu>=70 && !error) {
			hakjum="C";
			if(jumsu>=75) {
				opt="+";
			}
		}else if(jumsu>=60 && !error) {
			hakjum="D";
			if(jumsu>=65) {
				opt="+";
			}
		}else if(jumsu < 60 && !error){
			hakjum="F";
			opt=null;
		}
		if(hakjum != null) {
			System.out.println("당신의 점수는 " + jumsu+"점입니다");
			if(opt != null) {
		     System.out.println("당신의 학점은 " + hakjum + opt + "학점입니다.");
			}else {
			  System.out.println("당신의 학점은 " + hakjum + "학점입니다.");
			}
			
		} else {
			System.out.println("점수 입력 범위는 0~100점 사이 입니다. ");
		}

	}
}
