package p120;

public class OperatorEx27 {

	public static void main(String[] args) {
		/*boolean b=true;
		char ch='C';
		
		System.out.printf("b=%b%n", b); //%b boolean 출력 %n 줄바꾸기
		System.out.printf("!b=%b%n", !b);// ! 부정 반대
		System.out.printf("!!b=%b%n",!!b);
		System.out.printf("!!!b=%b%n",!!!b); // !는 반대
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		System.out.printf("ch < 'a' ch> 'z' = %b%n", ch<'a' || ch>'z');
		System.out.printf("!('a' <= ch ch <= 'z') = %b%n", !(ch<'a' || ch>'z'));
		System.out.printf("  'a' <= ch && ch <= 'z' = %b%n", 'a' <=ch && ch<='z');*/
		
		int x=0xAC, y = 0xf;
		
		System.out.printf("x= %#X \t\t%s%n", x, toBinaryString(x)); //%s 문자열 %n 줄바꿈
		System.out.printf("y= %#X \t\t\t%s%n", y, toBinaryString(y));
		System.out.printf("%#X & %#X= %#X \t%s%n", x,y,x&y, toBinaryString(x&y));
		System.out.printf("%#X | %#X= %#X \t%s%n", x,y,x|y, toBinaryString(x|y));
		System.out.printf("%#X ^ %#X= %#X \t%s%n", x,y,x^y, toBinaryString(x^y));
		//xor로 00 11 이면 0이 됨 01, 10이면 1이 됨
		//~은 보수
		int dec=9;
		System.out.printf("%d >> %d = %4d \t\t%s%n", dec, 2, dec >> 2, toBinaryString(dec >> 2));
		System.out.printf("%d << %d = %4d \t\t%s%n", dec, 2, dec << 2, toBinaryString(dec << 2));
		System.out.printf("%d >> %d = %4d \t\t%s%n", dec, 3, dec >> 3, toBinaryString(dec >> 3));
		System.out.printf("%d << %d = %4d \t\t%s%n", dec, 3, dec << 3, toBinaryString(dec << 3));
	}

	private static String toBinaryString(int x) {
		String zero="00000000000000000000000000000000"; //32개
		String temp = zero +Integer.toBinaryString(x);
		return temp.substring(temp.length()-32);
	}
}
