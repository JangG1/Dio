package ch01;

public class Var_type {

	public static void main(String[] args) {
	 // 1. 변수란? 주기억장치의 일부분의 공간을 자료형에 맞추어서 공간을 확보하는 것
	 // 2. 변수 만드는 방법 자료형선언 변수명
     // 3. 자료형의 종류? 
	 // 4. 변수명 만드는 방법	
     // 문제) 정수형 변수 3개를 선언해서 전부 덧셈해서 출력하기
	 int a, b, c;
	 a=10;
	 b=20;
	 c=30;
     System.out.println(a+b+c);
     // 실수형 변수 4개를 선언하고 2개는 곱셈으로 2개는 나눗셈으로 출력해 보기
	 float fa,fb,fc,fd;
	 fa=10.30f;
	 fb=20.34f;
	 fc=5.0f;
	 fd=2.0f;
	 System.out.println(fa*fb);
	 System.out.println(fc/fd);
	}
}