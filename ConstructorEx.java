package p311;

public class ConstructorEx {

	public static void main(String[] args) {
		// �������� Ȱ�뵵
		Parent p1 = new Parent();
		Parent p2 = new Parent("ȫ�浿");
		Parent p3 = new Parent(30);
		System.out.println(p2.name);
		System.out.println(p3.age);
	}

}

class Parent{
	String name; //�ɹ�����, Ŭ��������
	int age;
	String phone;
	Parent(String name){ //p2
		this.name=name; //this�� �ڱ��ڽ�, �ɹ������� ����Ų��. *���� �ִ� Ŭ����(Parent)
	}
	Parent(int age){
		this.age=age;
	}
	Parent(){
		
	}
}