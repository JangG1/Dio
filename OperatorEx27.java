package p120;

public class OperatorEx27 {

	public static void main(String[] args) {
		/*boolean b=true;
		char ch='C';
		
		System.out.printf("b=%b%n", b); //%b boolean ��� %n �ٹٲٱ�
		System.out.printf("!b=%b%n", !b);// ! ���� �ݴ�
		System.out.printf("!!b=%b%n",!!b);
		System.out.printf("!!!b=%b%n",!!!b); // !�� �ݴ�
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' ch> 'z' = %b%n", ch<'a' || ch>'z');
		System.out.printf("!('a' <= ch ch <= 'z') = %b%n", !(ch<'a' || ch>'z'));
		System.out.printf("  'a' <= ch && ch <= 'z' = %b%n", 'a' <=ch && ch<='z');*/
		
		int x=0xAC, y = 0xf;
		
		System.out.printf("x= %#X \t\t%s%n", x, toBinaryString(x)); //%s ���ڿ� %n �ٹٲ�
		System.out.printf("y= %#X \t\t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X & %#X= %#X \t%s%n", x,y,x&y, toBinaryString(x&y));
		System.out.printf("%#X | %#X= %#X \t%s%n", x,y,x|y, toBinaryString(x|y));
		System.out.printf("%#X ^ %#X= %#X \t%s%n", x,y,x^y, toBinaryString(x^y));
		//xor�� 00 11 �̸� 0�� �� 01, 10�̸� 1�� ��
		//~�� ����
		int dec=9;
		System.out.printf("%d >> %d = %4d \t\t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t\t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.printf("%d >> %d = %4d \t\t%s%n", dec, 3, dec >> 3, toBinaryString(dec >> 3));
		System.out.printf("%d << %d = %4d \t\t%s%n", dec, 3, dec << 3, toBinaryString(dec << 3));
	}

	private static String toBinaryString(int x) {
		String zero="00000000000000000000000000000000"; //32��
		String temp = zero +Integer.toBinaryString(x);
		return temp.substring(temp.length()-32);
	}
}
