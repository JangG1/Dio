package p298;

public class ThisEx01 {

	public static void main(String[] args) {
		// this�� ���� �˱� 
		// 1) �ڱ��ڽ� �ɹ��� ����Ų��. this.name = name;
		// 2) �ٸ� �����ڸ� ȣ���� �� ����Ѵ�. this()
		// *������ - �������� ù�ٿ� ���־�� �Ѵ�.*
		//A a1 = new A();
		A a2 = new A(123, 3.4);
		//A a3 = new A("������", 50);
		//��) A a2�� ��ü ������ �� ��µǴ� ������ ����� ������2 --> �⺻������ --> ����� ������1
		
	   
	}

}

class A{
	A(){
		//�����ڿ��� �ٸ� �����ڸ� ȣ���ϱ�
		//���� �ݵ�� ù�ٿ��� ��� �Ѵ�. �� this() this() �����ؼ� 2�� ���� ����.
		this("a", 1); //this("ȫ�浿", 5); �ѹ��� ����, �ؿ��� �ȉ�. 
		System.out.println("�⺻������");
	}
	A(int i, double d){ //this(55, 5.5);
		this();
		System.out.println("����� ������1" + i + " " + d);
	}
	A(String name, int c){
		System.out.println("����� ������2");
	}
}
