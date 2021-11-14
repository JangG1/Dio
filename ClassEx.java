package p235;

public class ClassEx {

	public static void main(String[] args) {
		// 클래스의 처리 순서 알아보기
		// static { } --> 블록 { } --> 생성자는 클래스의 변수를 초기화 해주는 용도로 주로 사용한다.
		// 클래스 맴버들의 용도 알아보기
		
		// A 클래스 사용하기 - 객체화, 인스턴스화 : 힙메모리에 올려라
		A a = new A();
		a.name = "홍길동";
		a.age = 20;
		a.phone = "123456";
		System.out.println(a.name);
		System.out.println(a.age);
		
		//Pay 클래스를 객체화 시키기, 인스턴스화 시키기, 사용하기 위해서 힙메모리에 올리기
		Pay pay = new Pay(); //pay가 참조변수
		pay.bNumber = "A1001";
	    pay.name = "장지원";
		pay.basePay = 2000000;
		System.out.println(pay.bNumber);
		System.out.println(pay.basePay);
		
		//
		Market market = new Market();
		market.item = 1000;
		market.shelfLife = "2022-11-05";
		market.numberOfStocks = 1000;
		market.numberOfReturns = 10;
		market.numberOfInput = 1100;
		System.out.println(market.item);
		System.out.println(market.shelfLife);
		
		//각 클래스를 인스턴스화 해서 값을 넣어 보고 출력해기
		//다른 클래스에 있는 변수에 값을 넣으려면 참조변수. 변수로 해야 한다.
		int aa=10;
		aa=20;
		//bNumber="BBB";
	}

}
//설계도, 별도 출력 X,종이 일뿐
class A{
	/*//클래스의 처리 순서 알아보기
	 int a=0;
	//블록 만들기
	{
		System.out.println("이곳은 블록입니다-2번");
		System.out.println( (a+=10) + "~");
	} 
	//기본생성자 만들기
	A(){
		System.out.println("이곳은 기본생성자입니다-3번");
		System.out.println((a+=10) + "~~");
	}
	//정적 블록
	static {
		System.out.println("이곳은 정적 블록입니다-1번");
	}
	{
		System.out.println("이곳은 블록입니다-4번");
		System.out.println((a+=10) + "~");
	}*/
	//프로그래머가 정의하지 않으면 자비 컴파일러가 자동으로 만들어 준다. 단, {}안에 아무것도
	//넣지 않는다 그러므로 아무것도 셋팅되지는 않는다.

	//클래스 용도 알아보기
	String name;
	int age;
	String phone;
	
	
}
//급여관리 클래스 설계도
class Pay{
	//사번, 이름, 기본급, 세금율, 실수령액
	String bNumber; //사번
	String name; //이름
	int basePay; //기본급
	double tax; //세금
	
	
}

//마켓관리 클래스 설계도
class Market{
	//품목, 유통기한, 재고수, 반품수, 입고수
	int item;
	String shelfLife;
	int numberOfStocks;
	int numberOfReturns;
	int numberOfInput;
}