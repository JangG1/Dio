package p294;

public class GetterSetterEx {

	public static void main(String[] args) {
		// �ɹ������ȿ� ���� ���� �� �޼ҵ� ȣ���� ���ؼ� �ֱ�
		//1�ܰ� ��ü ������ �Ѵ�.
		A a = new A();
		
		//2�ܰ� �޼ҵ带 ȣ���Ѵ�.
		a.setName("������");
		System.out.println(a.getName());
		a.setKind("����");
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
	
	//setter / getter  ��Ŭ������ ��� ���� �� �ִ�.
	//��Ŭ���� �޴����� source --> generate getter/setter �� �����Ѵ�. 
}

class A{
	//�ɹ� ����, �ɹ��ʵ�, Ŭ��������
	String name;
	String kind;
	int count;
	boolean ok;
	double rate;
	//setter �޼ҵ� ����� ���� �ɹ������� �� �ֱ�
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
	//getter �޼ҵ� �����
	String getName() {
		return this.name; //this ��������. ���� ����� ������ ã�� ����
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