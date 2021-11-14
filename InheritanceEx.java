package p310;

public class InheritanceEx {

	public static void main(String[] args) {
		//상속의 개념
		//객체화하기, 인스턴스화하기
		Parent p = new Parent(); //객체화
		Child c = new Child(); //객체화
		
		p.name = "장지원";
		p.age = 30;
		c.phone = "010-1234-1234";
		p.method1();
		c.method02();
	}

}

class  Parent{
	//변수 선언
	String name;
	int age;
	//기본생성자
	Parent(){
		
	}
	//출력하기 메소드 정의
	void method1() {
		String phone = "7777"; //부모는 자식의 변수나 메소드 사용못함
		System.out.println(name);
		System.out.println(age);
		Child c = new Child();
		c.phone="555-5555"; 
		c.method02();
		System.out.println("@@@@");
	}
}

class P2 extends Parent{
	
}

//상속을 하려면 자식이 1명의 부모를 선언한다.
//단일 상속 1명의 자식은 1명의 부모만 가질 수 있다.

class Child extends Parent{
	//핸드폰 번호를 저장할 변수 언언
	String phone;
	//생성자 정의
	Child(){
		
	}
	void method02() {
		name="장지원 자녀입니다.";  //부모 것 상속받아 사용 가능
		age = 10;
		phone="8888";
		System.out.println(phone);
		
	}
}