package p146;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//switch~case를 사용 : 경우의 수가 많아질때
		//형식 switch(조건식 또는 수식 
		/*switch(수식) { }
			case 값1: {
			
				}
			case 값2: {				
				}
			case 값3: {
				
				}*/
		/*String word="f";
		switch(word) {
			case "A" :  
			case "a" : {
				System.out.println("a로 시작되는 영어는  ant가 있다.");
				break; //switch문을 빠져라
			}
			case "B" :
			case "b" : {
				System.out.println("b로 시작되는 영어는  bear가 있다.");
				break; 
			}
			case "C" :
			case "c" : {
				System.out.println("c로 시작되는 영어는  cat가 있다.");
				break; 
			}
			case "D" :
			case "d" : {
				System.out.println("d로 시작되는 영어는  dog가 있다.");
				break; 
			}
			default : {
				System.out.println("a~d사이의 영문자가 아님.");
			}
		}*/

		/*int a=10, b=20;
		switch(a+b) {
			case 0 : {
				System.out.println("두개의 합은 0입니다.");
				break;
			}
			case 10 : {
				System.out.println("두개의 합은 10입니다.");
				break;
			}
			case 20 : {
				System.out.println("두개의 합은 20입니다.");
				break;
			}
			case 30 : {
				System.out.println("두개의 합은 30입니다.");
				break;
			}
			default : {
				System.out.println("오류입니다.");
				break;
			}
		 }*/
		
		/*double a=0.5, b=1.5;
		switch(a+b) { //switch에 서 사용할 수 있는 형식은 int(char), String, enum만 가능함
		// 실수형은 사용 할 수 없다.
		// enum 열거형 ex)월화수목금토일  1월2월...12월  자축인묘...신유술해  고정된 필드들을 나열하는 것
			case 0.0 : {
				System.out.println("두개의 합은 0.0입니다.");
				break;
			}
			case 1.0 : {
				System.out.println("두개의 합은 1.0입니다.");
				break;
			}
			case 1.5 : {
				System.out.println("두개의 합은 1.5입니다.");
				break;
			}
			case 2.0 : {
				System.out.println("두개의 합은 2.0입니다.");
				break;
			}
			default : {
				System.out.println("오류입니다.");
				break;
			}
		 }*/
		
		//switch~case문으로 작성하기
		/*Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하시오:");
		int month = sc.nextInt();
		switch(month) {
			case 3 :
			case 4 :
			case 5 :{
				System.out.println("3,4,5월이면 현재의 계절은 봄입니다.");
				break;
			}
			case 6 :
			case 7 :
			case 8 :{
				System.out.println("6,7,8월이면 현재의 계절은 여름입니다.");
				break;
			}
			case 9 :
			case 10 :
			case 11 :{
				System.out.println("9,10,11월이면 현재의 계절은 가을입니다.");
				break;
			}
			case 12 :
			case 1 :
			case 2 :{
				System.out.println("12,1,2월이면 현재의 계절은 겨울입니다.");
				break;
			}
			default : {
				System.out.println("오류입니다.");
				break;
			}
		}
		*/
		//계산기 프로그램
		System.out.println("더하기: + , 빼기 - 곱하기 * 나누기 /");
		Scanner sc = new Scanner(System.in);
		System.out.printf("계산할 부호는? ");
		String sign = sc.nextLine();
		System.out.println();
		System.out.println("계산할 정수 2개 입력하기 ");
		System.out.printf("숫자1==> ");
		int num1 = sc.nextInt();
		System.out.printf("숫자2==> ");
		int num2 = sc.nextInt();
		int result=0;
		switch(sign) {
			case "+" :{
			result = num1+num2;
			break;
		}
			case "-" :{
			result = num1-num2;
			break;
		}
			case "*" :{
			result = num1*num2;
			break;
		}	case "/" :{
			result = num1/num2;
			break;
		}	default : {
			System.out.println("오류입니다.");
			}
			
		}//end switch
		System.out.printf("계산될 결과 화면.");
		System.out.printf(num1 + sign + num2 + "=" + result);
		
	}
}
		
		
		

	


