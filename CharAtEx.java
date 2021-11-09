package p55;

public class CharAtEx {

	public static void main(String[] args) {
		// 문자열에서 특별한 위치의 값을 얻어오기 "951010-1234567" 성별을 나태내는 1을 추출하기 charAt(7)
		String juminBunho="951010-1234567";
		char gender = juminBunho.charAt(7);//'1'
		System.out.println(gender);
		switch(gender) {
		case '1':
		case '3':{
			System.out.println("남자");break;
		}
		case '2':
		case '4':{
			System.out.println("여자");break;
		}
		
	}

	}
}
