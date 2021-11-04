package mobile;

public class HelloAndroid2 {
	static String gstr = "전역변수";
	
	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.method();
		c1.method02();
	}
}


class C1{
	double generalVar=3.14;//전역변수 생명주기는 클래스 시작할 때부터 클래스 종료할때까지임
	void method() {
		int localVar=100;//지역변수
		System.out.println(localVar);
		System.out.println(generalVar);
	}
	void method02() {
		int localVar02=300;//지역변수
		System.out.println(localVar02);
		System.out.println(generalVar);
	}
}
