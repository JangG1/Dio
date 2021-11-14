package day05.p208;

public class StringEx {

	public static void main(String[] args) {
		//String 클래스의 주요요소
		
		// String클래스는 char배열에 기능을 추가한 것입니다.
		char[] c = new char[10];
		String name="abcdefg";
		
		//문자열에서 임의의 문자를 추출하기 예) "c"
		char cs = name.charAt(2);
		System.out.println(cs);
		//"g" "a" 추출하기
		cs = name.charAt(0);
		cs = name.charAt(6);
		System.out.println(cs);
		System.out.println(cs);
		//문자열의 길이를 출력하기
		int len = name.length();
		System.out.println(len);
		//연속해서 bcd 출력하기
		String bcd = name.substring(1, 4); //begin index 범위 포함 endindex는 포함되지 않음 1<=x<3
		System.out.println(bcd);
		//연속해서 defg 출력하기
		//String defg = name.substring(3);     3뒤로 전부 다
		String defg = name.substring(3, 7);  //3번부터 6까지
		System.out.println(defg);
		//String을 char[]변환하기  스트링을 캐릭터배열로 변환
		char[] tca = name.toCharArray();
		//배열안에 있는 모든 문자열을 출력하기
		for(int i=0;i<name.length();i++) {
		System.out.print(tca[i]+ " ");
		}
		System.out.println();
		//향상된 for문으로 출력하기
		for(char a : tca) {
		System.out.print(a + "  ");
		}
	}

}
