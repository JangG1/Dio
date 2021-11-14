package p230;

public class ObjectEx01 {

	public static void main(String[] args) {
		// 클래스 만들기

	}

}

class A{
	//클래스속에 넣을 수 있는 것들 - 맴버
	//속성 : 변수, 배열
	int a;
	//int a;
	int[] ia= {10,20,30};
	//메소드 - 재정의 Overloading
	void method01() { //메소드 기능 구현 }
	}
	void method01(int a) { //메소드 기능 구현 }
	}
	double mehtod02() {
		return 0.0;//메소드 호출한 곳으롣 되돌려 주어라
	}
	double mehtod02(double b) {
		return 0.0;//메소드 호출한 곳으롣 되돌려 주어라
	}
	//생성자 : 클래스명이랑 같음
	A(){

	}
	A(String a){

	}
	//블록
	{

	}
	{

	}
	//정적 블록
	static {

	}
	static {

	}	
	//클래스
	class AA{

	}

}

class B{
	//생성자 만들기
	//기본생성자
	B(){ }
	//생성자에 매개변수로 boolean을 가지고 있는 생성자를 만드세요
	B(boolean b){}
	//블록 만들기
	{
	}
	//정적블록
	static { }
	//변수 Student 클래스의 참조 변수를 만드세요
	Student st;
	//Teacher 3행 4열의 배열을 만드세요
	Teacher[][] ta = new Teacher[3][4]; //2차원
	//메소드 - 리턴타입이 Student이고 매개변수가 없는 메소드 만드세요
	Student m1() {
		return null;
	}
	//메소드 - 리턴타입이 String이고 매개변수가 정수형 1개, 실수형 1개인 메소드 만드세요.
	String m2(int a, double b) {
		return null;
	}
	//내부 클래스로 CC를 만드세요 	내부클래스는 클래스안에 들어 있는 클래스
	class CC{
		class DD{
			
		}
	}
}

class Student{
	
}

class Teacher{
	
}