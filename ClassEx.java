package p235;

public class ClassEx {

	public static void main(String[] args) {
		// Ŭ������ ó�� ���� �˾ƺ���
		// static { } --> ��� { } --> �����ڴ� Ŭ������ ������ �ʱ�ȭ ���ִ� �뵵�� �ַ� ����Ѵ�.
		// Ŭ���� �ɹ����� �뵵 �˾ƺ���
		
		// A Ŭ���� ����ϱ� - ��üȭ, �ν��Ͻ�ȭ : ���޸𸮿� �÷���
		A a = new A();
		a.name = "ȫ�浿";
		a.age = 20;
		a.phone = "123456";
		System.out.println(a.name);
		System.out.println(a.age);
		
		//Pay Ŭ������ ��üȭ ��Ű��, �ν��Ͻ�ȭ ��Ű��, ����ϱ� ���ؼ� ���޸𸮿� �ø���
		Pay pay = new Pay(); //pay�� ��������
		pay.bNumber = "A1001";
	    pay.name = "������";
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
		
		//�� Ŭ������ �ν��Ͻ�ȭ �ؼ� ���� �־� ���� ����ر�
		//�ٸ� Ŭ������ �ִ� ������ ���� �������� ��������. ������ �ؾ� �Ѵ�.
		int aa=10;
		aa=20;
		//bNumber="BBB";
	}

}
//���赵, ���� ��� X,���� �ϻ�
class A{
	/*//Ŭ������ ó�� ���� �˾ƺ���
	 int a=0;
	//��� �����
	{
		System.out.println("�̰��� ����Դϴ�-2��");
		System.out.println( (a+=10) + "~");
	} 
	//�⺻������ �����
	A(){
		System.out.println("�̰��� �⺻�������Դϴ�-3��");
		System.out.println((a+=10) + "~~");
	}
	//���� ���
	static {
		System.out.println("�̰��� ���� ����Դϴ�-1��");
	}
	{
		System.out.println("�̰��� ����Դϴ�-4��");
		System.out.println((a+=10) + "~");
	}*/
	//���α׷��Ӱ� �������� ������ �ں� �����Ϸ��� �ڵ����� ����� �ش�. ��, {}�ȿ� �ƹ��͵�
	//���� �ʴ´� �׷��Ƿ� �ƹ��͵� ���õ����� �ʴ´�.

	//Ŭ���� �뵵 �˾ƺ���
	String name;
	int age;
	String phone;
	
	
}
//�޿����� Ŭ���� ���赵
class Pay{
	//���, �̸�, �⺻��, ������, �Ǽ��ɾ�
	String bNumber; //���
	String name; //�̸�
	int basePay; //�⺻��
	double tax; //����
	
	
}

//���ϰ��� Ŭ���� ���赵
class Market{
	//ǰ��, �������, ����, ��ǰ��, �԰��
	int item;
	String shelfLife;
	int numberOfStocks;
	int numberOfReturns;
	int numberOfInput;
}