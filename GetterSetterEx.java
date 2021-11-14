package p294;

public class GetterSetterEx {

	public static void main(String[] args) {
		// 맴버변수안에 값을 넣을 때 메소드 호출을 통해서 넣기
		//1단계 객체 생성을 한다.
		A a = new A();
		
		//2단계 메소드를 호출한다.
		a.setName("장지원");
		System.out.println(a.getName());
		a.setKind("사탕");
		System.out.println(a.getKind());
		a.setCount(10);
		System.out.println(a.getCount());
		a.setOk(true);
		System.out.println(a.getOk());
		a.setRate(3.4);
		System.out.println(a.getRate());

	}

}

class Member{
	String name;
	String id;
	String password;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//setter / getter  아클립스가 대신 해줄 수 있다.
	//이클립스 메뉴에서 source --> generate getter/setter 를 선택한다. 
}

class A{
	//맴버 변수, 맴버필드, 클래스변수
	String name;
	String kind;
	int count;
	boolean ok;
	double rate;
	//setter 메소드 만들기 역할 맴버변수에 값 넣기
	void setName(String name) {
		this.name=name;
	}
	void setKind(String kind) {
		this.kind=kind;
	}
	void setCount(int count) {
		this.count=count;
	}
	void setOk(boolean ok) {
		this.ok=ok;
	}
	void setRate(double rate) {
		this.rate=rate;
	}
	//getter 메소드 만들기
	String getName() {
		return this.name; //this 생략가능. 가장 가까운 변수를 찾기 때문
	}
	String getKind() {
		return kind;
	}
	int getCount() {
		return count;
	}
	boolean getOk() {
		return ok;		
	}
	double getRate() {
		return rate;
	}
}