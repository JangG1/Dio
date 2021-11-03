package sec02.examp08_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//실수값 저장
		double var1 = 3.14;
		float var2=3.14F; //float은  변수값 뒤에 f가 붙음(대소문자 상관X)
		float var3=3.14f;
		
		//정밀도 테스트
		double var4=0.1234567890123456789; //소숫점 16자리 정확
		float var5=0.1234567890123456789f; //소숫점 7자리 정확 8자리 반올림
		
		System.out.println("var1:" + var1);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		//e 지수값 사용하기
		int var6=30000000;
		double var7=3e6;
		float var8=3e6f;
		double var9=2e-3;
		System.out.println("var6:" + var6);
		System.out.println("var7:" + var7);
		System.out.println("var8:" + var8);
		System.out.println("var9:" + var9);
	}

}
