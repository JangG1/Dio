package p310;

public class InheritanceEx {

	public static void main(String[] args) {
		//����� ����
		//��üȭ�ϱ�, �ν��Ͻ�ȭ�ϱ�
		Parent p = new Parent(); //��üȭ
		Child c = new Child(); //��üȭ
		
		p.name = "������";
		p.age = 30;
		c.phone = "010-1234-1234";
		p.method1();
		c.method02();
	}

}

class  Parent{
	//���� ����
	String name;
	int age;
	//�⺻������
	Parent(){
		
	}
	//����ϱ� �޼ҵ� ����
	void method1() {
		String phone = "7777"; //�θ�� �ڽ��� ������ �޼ҵ� ������
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

//����� �Ϸ��� �ڽ��� 1���� �θ� �����Ѵ�.
//���� ��� 1���� �ڽ��� 1���� �θ� ���� �� �ִ�.

class Child extends Parent{
	//�ڵ��� ��ȣ�� ������ ���� ���
	String phone;
	//������ ����
	Child(){
		
	}
	void method02() {
		name="������ �ڳ��Դϴ�.";  //�θ� �� ��ӹ޾� ��� ����
		age = 10;
		phone="8888";
		System.out.println(phone);
		
	}
}