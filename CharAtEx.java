package p55;

public class CharAtEx {

	public static void main(String[] args) {
		// ���ڿ����� Ư���� ��ġ�� ���� ������ "951010-1234567" ������ ���³��� 1�� �����ϱ� charAt(7)
		String juminBunho="951010-1234567";
		char gender = juminBunho.charAt(7);//'1'
		System.out.println(gender);
		switch(gender) {
		case '1':
		case '3':{
			System.out.println("����");break;
		}
		case '2':
		case '4':{
			System.out.println("����");break;
		}
		
	}

	}
}
