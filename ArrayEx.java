package p180;

public class ArrayEx {

	public static void main(String[] args) {
		//����� Ŭ������ ����Ϸ��� ���޸𸮿� �÷��� �Ѵ�. = �ν��Ͻ�ȭ ��üȭ
		/*A a= new A();
		A a1= new A();
		A a2= a;
		System.out.println(a==a1); //�ּҰ� ���� �ʴ�
		System.out.println(a==a2); 
		
		//������ �ٶ� �ʱⰪ�� �ִ� �� (������ ���� ó�� �ִ� ��)
		int i; //���� ����
		i=0; //������ �ʱⰪ �ֱ�
		i=i+100; //������ �ι�° �� �ֱ�
		
		//�⺻�� �ʱⰪ
		int j = 0;
		double k = 0.0;
		boolean b=false;
		
		//������ �ʱⰪ
		A a3=null; //A��� ��ü(Class)�� a3�̶�� ����
		
		//int aa=null; �⺻���� ��쿡�� null�� �ʱⰪ���� ���� ���Ѵ�.
		A a4 = new A();
		
		System.out.println(a3 == null);
		System.out.println(a3 != null);
		System.out.println(a4 == null);*/
		
		
		/*int[] intArray = null;
		intArray[0] = 10;
		
		String str = "abcdef";
		System.out.println("�ѹ��ڼ� "+str.length());*/
		
		String name="������"; //�ּ�100����
		String hobby="�ڵ�";
		String name1="������"; //�ּ�100����
		System.out.println(name==hobby);
		System.out.println(name==name1);
		
		String name2= new String("������"); //�ּ� 200����
		String name3= new String("������"); //�ּ� 300����
		System.out.println(name2==name3);
		
	}

}

//����
class A{
	
}