package p311;

public class ConstructorEx {

	public static void main(String[] args) {
		// 생성자의 활용도
		Parent p1 = new Parent();
		Parent p2 = new Parent("홍길동");
		Parent p3 = new Parent(30);
		System.out.println(p2.name);
		System.out.println(p3.age);
	}

}

class Parent{
	String name; //맴버변수, 클래스변수
	int age;
	String phone;
	Parent(String name){ //p2
		this.name=name; //this는 자기자신, 맴버변수를 가르킨다. *속해 있는 클래스(Parent)
	}
	Parent(int age){
		this.age=age;
	}
	Parent(){
		
	}
}