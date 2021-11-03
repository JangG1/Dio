package ch01.ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 실습문제 1
		int input1;
		// 키보드로 입력받기 위해 Scanner 클래스 객체생성
		Scanner sc = new Scanner(System.in);
		System.out.print("성명을 입력하세요===>");
		String name = sc.next();
		System.out.printf("문자열 ===> %s\n",name);
		System.out.println(name);
	}
}
