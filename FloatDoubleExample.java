package sec02.examp08_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		//�Ǽ��� ����
		double var1 = 3.14;
		float var2=3.14F; //float��  ������ �ڿ� f�� ����(��ҹ��� ���X)
		float var3=3.14f;
		
		//���е� �׽�Ʈ
		double var4=0.1234567890123456789; //�Ҽ��� 16�ڸ� ��Ȯ
		float var5=0.1234567890123456789f; //�Ҽ��� 7�ڸ� ��Ȯ 8�ڸ� �ݿø�
		
		System.out.println("var1:" + var1);
		System.out.println("var3:" + var3);
		System.out.println("var4:" + var4);
		System.out.println("var5:" + var5);
		
		//e ������ ����ϱ�
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
