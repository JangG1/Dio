package p151;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		/*// ���� ���� �� ���� �����
		System.out.println( (int) (Math.random()*3)+1);
		//1 <= (int)(Math.random*3)+1 < 4
		System.out.println( (int) (Math.random()*6)+1);*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(1),����(2),��(3)�� �ϳ��� �Է��ϼ��� ==> ");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		String pandjung = null;
		switch(com-user) {
			case 0 : {
			pandjung="���º�";
			break;
		}
			case 1 : 
			case -2 : {
			pandjung="�� ��";
			break;
		}
			case 2 :
			case -1 : {
			pandjung="���� ��";
		}
			
		}//end switch
		String userOutput = null;
		switch (user) {
			case 1:
				userOutput="����";break;
			case 2:
				userOutput="����";break;
			case 3:
				userOutput="��";break;
		}
		String comOutput = null;
		switch (com) {
			case 1:
				comOutput="����";break;
			case 2:
				comOutput="����";break;
			case 3:
				comOutput="��";break;
		}
		System.out.println("����� " + userOutput + " �Դϴ�");
		System.out.println("��ǻ�ʹ� " + comOutput + " �Դϴ�");
		System.out.println(pandjung+" �߽��ϴ�");
		
	}
}
