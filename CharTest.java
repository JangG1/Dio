package character;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		CharTest ct = new CharTest();
		ct.printBMethod();
		ct.printBMethod();
		//ToPound ��ü�� ���޸𸮿� �ä����� �ش� �ּҸ� ������ �����ϱ�
		ToPound tp=new ToPound();
		//�Է��ϴ� �޼ҵ� ȣ���ϱ�
		double result = tp.inputMethod();
		//��� �����ϴ� �޼ҵ� ȣ���ϱ�
		tp.printMethod(result);
		//�Ŀ��� �ٲپ ����ϴ� �޼ҵ� ȣ���ϱ�
		tp.changePoundMethod(result);
	}

void printBMethod() {
		char c='B';
		System.out.println(c);
	}
}

class ToPound{
	double kg=0.0;
	//�Է� �޴� �޼ҵ� ����
	double inputMethod() {
	Scanner sc = new Scanner(System.in);
	System.out.println("**********");
	System.out.println("���� ��ȯ ���α׷�");
	System.out.println("**********");
	System.out.print("��ȯ�� kg��?");
	kg = sc.nextDouble();
	return kg;
	}
	//��� �����ϴ� �޼ҵ�    tp.printMethod(result);
	void printMethod(double kg) {
		System.out.println("�Է¹��� ����" + kg);
	}
	//�Ŀ��� �ٲپ ����ϴ� �޼ҵ�   tp.changePoundMethod(result);
	void changePoundMethod(double kg) {
		double pound;
		pound = kg * 2.2;
		System.out.println(kg + "kg�� �Ŀ��� ��ȯ�ϸ� " + pound + "�Դϴ�");
	}
}