package p151;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		/*// 가위 바위 보 게임 만들기
		System.out.println( (int) (Math.random()*3)+1);
		//1 <= (int)(Math.random*3)+1 < 4
		System.out.println( (int) (Math.random()*6)+1);*/
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1),바위(2),보(3)중 하나를 입력하세요 ==> ");
		int user = sc.nextInt();
		int com = (int)(Math.random()*3)+1;
		String pandjung = null;
		switch(com-user) {
			case 0 : {
			pandjung="무승부";
			break;
		}
			case 1 : 
			case -2 : {
			pandjung="컴 승";
			break;
		}
			case 2 :
			case -1 : {
			pandjung="유저 승";
		}
			
		}//end switch
		String userOutput = null;
		switch (user) {
			case 1:
				userOutput="가위";break;
			case 2:
				userOutput="바위";break;
			case 3:
				userOutput="보";break;
		}
		String comOutput = null;
		switch (com) {
			case 1:
				comOutput="가위";break;
			case 2:
				comOutput="바위";break;
			case 3:
				comOutput="보";break;
		}
		System.out.println("당신은 " + userOutput + " 입니다");
		System.out.println("컴퓨터는 " + comOutput + " 입니다");
		System.out.println(pandjung+" 했습니다");
		
	}
}
