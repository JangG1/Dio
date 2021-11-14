package p298;

public class ThisEx01 {

	public static void main(String[] args) {
		// this의 개념 알기 
		// 1) 자기자신 맴버를 가르킨다. this.name = name;
		// 2) 다른 생성자를 호출할 때 사용한다. this()
		// *주의점 - 생성자의 첫줄에 써주어야 한다.*
		//A a1 = new A();
		A a2 = new A(123, 3.4);
		//A a3 = new A("장지원", 50);
		//문) A a2로 객체 생성될 때 출력되는 순서가 명시적 생성자2 --> 기본생성자 --> 명시적 생성자1
		
	   
	}

}

class A{
	A(){
		//생성자에서 다른 생성자를 호출하기
		//문법 반드시 첫줄에만 써야 한다. 즉 this() this() 연속해서 2번 쓸수 없다.
		this("a", 1); //this("홍길동", 5); 한번만 가능, 밑에도 안됌. 
		System.out.println("기본생성자");
	}
	A(int i, double d){ //this(55, 5.5);
		this();
		System.out.println("명시적 생성자1" + i + " " + d);
	}
	A(String name, int c){
		System.out.println("명시적 생성자2");
	}
}
