package mobile;

public class HelloAndroid {
	static String gstr = "��������";
	
	public static void main(String[] args) {
		String str="Hello, Android Application";
		System.out.println(str);
		//System.out.println(gstr);
		method();
	}
	static void method() {
		System.out.println(gstr);//���� ���� �̹Ƿ� ����� �� ����
		//System.out.println(str);���������̹Ƿ� ��� ����
	}
}
