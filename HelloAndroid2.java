package mobile;

public class HelloAndroid2 {
	static String gstr = "��������";
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.method();
		c1.method02();
	}
}


class C1{
	double generalVar=3.14;//�������� �����ֱ�� Ŭ���� ������ ������ Ŭ���� �����Ҷ�������
	void method() {
		int localVar=100;//��������
		System.out.println(localVar);
		System.out.println(generalVar);
	}
	void method02() {
		int localVar02=300;//��������
		System.out.println(localVar02);
		System.out.println(generalVar);
	}
}
