package ch01.ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// �ǽ����� 1
		int input1;
		// Ű����� �Է¹ޱ� ���� Scanner Ŭ���� ��ü����
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���===>");
		String name = sc.next();
		System.out.printf("���ڿ� ===> %s\n",name);
		System.out.println(name);
	}
}
