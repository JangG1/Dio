package character;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		CharTest ct = new CharTest();
		ct.printBMethod();
		ct.printBMethod();
		//ToPound 객체를 힙메모리에 올ㄹ리고 해당 주소를 변수에 저장하기
		ToPound tp=new ToPound();
		//입력하는 메소드 호출하기
		double result = tp.inputMethod();
		//출력 전담하는 메소드 호출하기
		tp.printMethod(result);
		//파운드로 바꾸어서 출력하는 메소드 호출하기
		tp.changePoundMethod(result);
	}

void printBMethod() {
		char c='B';
		System.out.println(c);
	}
}

class ToPound{
	double kg=0.0;
	//입력 받는 메소드 정의
	double inputMethod() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********");
	System.out.println("단위 변환 프로그램");
	System.out.println("**********");
	System.out.print("변환할 kg은?");
	kg = sc.nextDouble();
	return kg;
	}
	//출력 전담하는 메소드    tp.printMethod(result);
	void printMethod(double kg) {
		System.out.println("입력받은 값은" + kg);
	}
	//파운드로 바꾸어서 출력하는 메소드   tp.changePoundMethod(result);
	void changePoundMethod(double kg) {
		double pound;
		pound = kg * 2.2;
		System.out.println(kg + "kg을 파운드로 변환하면 " + pound + "입니다");
	}
}