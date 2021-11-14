package p311;

public class SuperEx2 {

	public static void main(String[] args) {
		// super 개념2 부모생성자 호출할 때 이용함
		// 생성자 처리 순서 알아보기
		//new B();
		new BB(); //자식객체를 생성하면 부모생성자를 먼저 호출하고 자식 생성자가 호출됨
	}

}

class B{
	public B() {
		System.out.println("B클래스의 기본생성자");
	}
	//명시적 생성자를 프로그래머가 작성해주면 기본생성자는 자동으로 생겨나지 않는다.
	//그러므로 상속관계일 때 부모생성자는 기본생성자를 작성해 주는 것
	B(String n, int t){
		System.out.println("B클래스의 명시적생성자");
	}
}

class BB extends B{
	public BB() {
		//부모의 기본생성자 호출
		//super(); //생략된 것임
		//부모의 기본생성자가 아니라 명시적 생성자를 호출하고 싶을 때 *첫줄만
		//super("kk", 10); //공백일시 기본생성자 호출, 타입 넣을시 해당 명시적생성자 호출 *첫줄만
		System.out.println("BB클래스의 기본생성자");
		
	}
	BB(int t, boolean e){
		System.out.println("BB클래스의 명시적생성자");
	}
}