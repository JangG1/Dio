package mobile;

public class HelloAndroid {
	static String gstr = "전역변수";
	
	public static void main(String[] args) {
		String str="Hello, Android Application";
		System.out.println(str);
		//System.out.println(gstr);
		method();
	}
	static void method() {
		System.out.println(gstr);//전역 변수 이므로 사용할 수 있음
		//System.out.println(str);지역변수이므로 사용 못함
	}
}
