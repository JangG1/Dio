package day05.p208;

public class StringEx {

	public static void main(String[] args) {
		//String Ŭ������ �ֿ���
		
		// StringŬ������ char�迭�� ����� �߰��� ���Դϴ�.
		char[] c = new char[10];
		String name="abcdefg";
		
		//���ڿ����� ������ ���ڸ� �����ϱ� ��) "c"
		char cs = name.charAt(2);
		System.out.println(cs);
		//"g" "a" �����ϱ�
		cs = name.charAt(0);
		cs = name.charAt(6);
		System.out.println(cs);
		System.out.println(cs);
		//���ڿ��� ���̸� ����ϱ�
		int len = name.length();
		System.out.println(len);
		//�����ؼ� bcd ����ϱ�
		String bcd = name.substring(1, 4); //begin index ���� ���� endindex�� ���Ե��� ���� 1<=x<3
		System.out.println(bcd);
		//�����ؼ� defg ����ϱ�
		//String defg = name.substring(3);     3�ڷ� ���� ��
		String defg = name.substring(3, 7);  //3������ 6����
		System.out.println(defg);
		//String�� char[]��ȯ�ϱ�  ��Ʈ���� ĳ���͹迭�� ��ȯ
		char[] tca = name.toCharArray();
		//�迭�ȿ� �ִ� ��� ���ڿ��� ����ϱ�
		for(int i=0;i<name.length();i++) {
		System.out.print(tca[i]+ " ");
		}
		System.out.println();
		//���� for������ ����ϱ�
		for(char a : tca) {
		System.out.print(a + "  ");
		}
	}

}
