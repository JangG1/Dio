package operationEx;

import java.util.Scanner;

public class OneOper2 {

	public static void main(String[] args) {
		//사칙연산자 +, -, *, /, %
		/*int a=10, b=3;
		System.out.println(a/(double)b); //몫이 나옴, b를 double 처리
		System.out.println(a%b);//나머지 (배수의 나머지)
		
		//나머지 연산의 활용은 ~의 배수를 구할 때 사용함
		//10이 2의 배수인가?
		System.out.println(a%2);
		if(a%2 == 0)
			System.out.println("2의 배수입니다");
		else
			System.out.println("2의 배수가 아닙니다.");
		//문제1)
		System.out.println(2+3-4);//1
		System.out.println(2+3*4);//14
		System.out.println(2*3/4);//1
		System.out.println(4/3);//1	
		System.out.println(4%3);//1
		
		//문제1-1) 정수 2개를 입력 받아 산술연산 하세요
		Scanner sc = new Scanner(System.in);
		System.out.println("정수입력==>");
		int number1 = sc.nextInt();
		System.out.println("정수입력==>");
		int number2 = sc.nextInt();
		System.out.println();
		int hap = number1+number2;
		System.out.println("합=>" + hap);
		int sub = number1 - number2;
		System.out.println("차=>" + sub);
		int mul = number1 * number2;
		System.out.println("곱=>" + mul);
		int div = number1 / number2;
		System.out.println("나누기 몫=>" + div);
		int mod = number1 % number2;
		System.out.println("나머지=>" + mod);
		//처음 입력한 정수가 짝수인지 홀수인지 출력하기
		if(number1%2 == 0)
			System.out.println("짝수입니다");
		else
			System.out.println("홀수입니다");*/
		//문제2) 동전교환 프로그램
		/*Scanner sc = new Scanner(System.in);
		System.out.println("정수입력==>");
		int number1 = sc.nextInt();
		System.out.println("정수입력==>");
		int number2 = sc.nextInt();
		System.out.println();
		int div = number1/number2;
		System.out.println("500원 짜리 ==>" + div);
		int sub = number1-7500;
		System.out.println("100원 짜리 ==>" + sub/100);
		int mul = sub-(100*2);
		System.out.println("50원 짜리 ==>" + mul/50);
		int hap = mul - (1*50);
		System.out.println("7원 짜리 ==>" + hap/10);
		int mod = hap-(2*10);
		System.out.println("바꾸지 못한 잔돈원 짜리 ==>" + mod);*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("교환할 돈은==>");
		int money = sc.nextInt();
		int money500, money100, money50, money10;
		money500 = money / 500;
		money = money - (money500*500);
		money100 = money / 100;
		money = money - (money100*100);
		money50 = money / 50;
		money = money - (money50*50);
		money10 = money / 10;
		money = money - (money10*10);
		
		System.out.println("500원짜리 ==>" + money500+"개");
		System.out.println("100원짜리 ==>" + money100+"개");
		System.out.println("50원짜리 ==>" + money50+"개");
		System.out.println("10원짜리 ==>" + money10+"개");
		System.out.println("바꾸지 못한 잔돈은 ==>" + money +"원");*/
		
		//문제3 윤년 계산하기
		/*Scanner sc = new Scanner(System.in);
		System.out.print("윤년을 계산할 년도를 입력 ==>");
		int year = sc.nextInt();
		//조건) 윤년은 4로 나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다. 또는 ||
		// 400으로 나누어 떨어지는 해도 윤년에 포함된다.
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + "해는 윤년입니다.");
		else
			System.out.println(year + "해는 윤년아닙니다.");*/
	
		//문제4
		/*Scanner sc = new Scanner(System.in);
		System.out.print("두 실수 입력하기 ==>");
		double doubleNumber1 = sc.nextDouble();//3.5
		double doubleNumber2 = sc.nextDouble();//1.2
		double sum, avg;
		
		//doubleNumber1을 정수로 변환
		int chN1 = (int) doubleNumber1;//3
		int chN2 = (int) doubleNumber2;//1
		
		//chN1을 다시 실수형으로 변환하여서 계산
		doubleNumber1 = chN1;// 3.0?
		doubleNumber2 = chN2;// 1.0?
		
		sum = doubleNumber1 + doubleNumber2;//3.0+1.0
		avg = sum / 2;
		
		System.out.println(sum);
		System.out.println(avg);*/
		
		//문제6
		/*Scanner sc = new Scanner(System.in);
		System.out.print("실수 입력하기 ==>");
		double kgNum = sc.nextDouble();
		
		double pound;
		pound = kgNum / 0.453592;
		
		//1단계
		pound = pound * 1000;
		//System.out.println(pound); - 디버깅 프로그램
		//2단계
		pound = pound + 0.5;
		//System.out.println(pound);
		int cpound = (int)pound;
		//System.out.println(cpound);
		pound = cpound / (double)1000;
		System.out.println(pound);*/
		
		
		//문제7
		/*Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력하기(F,f,C,c) ==>");
		String word = sc.nextLine();
		System.out.print("값 입력하기 ==>");
		double value = sc.nextDouble();
		double f, c;
		if(word.equals("F") || word.equals("f")) {
			//계산
			c = (5.0/9.0) * (value - 32);
			//출력
			System.out.print(c);
		} else if(word.equals("C") || word.equals("c")) {
			f = (9.0/5.0) * value +32;
			System.out.print(f);
		} else {
			System.out.print("F, f, C, c중에서 입력을 하셔야 합니다. 다시 입력");*/
		
		//문제8
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("금액 입력하기 ==>");
	    int money = sc.nextInt();
	   
	    //2347653
		int money500, money100, money50, money10;
		money500 = money / 500;
		money = money - (money500*500);
		money100 = money / 100;
		money = money - (money100*100);
		money50 = money / 50;
		money = money - (money50*50);
		money10 = money / 10;
		money = money - (money10*10);
		
		System.out.println("money500+"개");
		System.out.println("money100+"개");
		System.out.println("money50+"개");
		System.out.println("money10+"개");
		System.out.println("money +"원 입니다");*/
		
		//문제9
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("임의의 달을 입력하기 (1월~12월)==>");
	    int month = sc.nextInt();
	    String s;
	    s = (month <= 6) ? "상반기":"하반기"; //조견연산자, 삼항연산자
	    System.out.println(s+"입니다.");*/
		
		//문제10
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("숫자1==>");
	    int m1 = sc.nextInt();
	    System.out.print("숫자2==>");
	    int m2 = sc.nextInt();
	    System.out.print("숫자3==>");
	    int m3 = sc.nextInt();
	    
	    int max;//비교해서 가장 큰것을 담아줄 변수
	    		//변수명=(조건식) ? 참:거짓;
	    max = (m1 > m2) ? m1:m2;
	    				//진실 거짓
	    max = (max > m3) ? max:m3;
	    System.out.println(max);
	    
	    //최소값
	    int min;
	    min = (m1 < m2) ? m1:m2;
	    min = (min < m3) ? min:m3;
	    System.out.println(min);*/
		
		//문제11~14 숙제 
		
		//문제11
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("몸무게 입력하기 ==>");
	    int weight = sc.nextInt();
	    System.out.print("키 입력하기 ==>");
	    int height = sc.nextInt();
	    
		if(weight <= (height-100) * 0.9)
			System.out.println("정상입니다");
		else
			System.out.println("비만입니다");
		
		//문제12
		Scanner sc = new Scanner(System.in);
	    System.out.print("초 입력하기 ==>");
	    int second = sc.nextInt();
	        
        int hour = second / 3600;
        second = second - hour*3600;
		int minute = second / 60;
		second = second - minute*60;

	    System.out.println(hour+"시 "+minute+"분 "+second+"초 입니다.");
		
		//문제13
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("지급할 연필 개수 ==>");
	    int pencil = sc.nextInt();
		
	    int g = pencil/30;
	    int e = pencil%30;
	    System.out.print("학생 30명당 "+g+"개를 지급받고 "+e+"개가 남습니다.");
		
		//문제14
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력하기 ==>");
		int number = sc.nextInt();
		
		number = number/100;
		number = number*100;
		
		System.out.println(number);*/
		
 }
}


