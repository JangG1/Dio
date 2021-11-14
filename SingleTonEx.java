package ep1318;

import java.util.Calendar;

public class SingleTonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SingleTon.getInstance()); //static으로 선언된 메소드는 클래스명.메소드명
		System.out.println(SingleTon.getInstance()); 
		
		Calendar c;
		//new SingleTon();
	}

}

class SingleTon{
	private static SingleTon st = new SingleTon();
	private SingleTon() { }
	static SingleTon getInstance() {
		return st;
	}
}