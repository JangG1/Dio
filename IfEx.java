package p137;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// �ܼ� if��
		/*int a=15, b=15;
		if(a<10 || b<10) {
			System.out.println("���̸� ���� �Ǵ� ��.");
			a=a+10;
			System.out.println(a);
		}else {
		System.out.println("�����̸� ���� �Ǵ� ��");
		}
		System.out.println("�������� ��µǴ� ��");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ 1�� �Է�==>");
		int number = sc.nextInt();
		if(number >= 0) {
			System.out.println("���� �����Դϴ�.");
		}else {
		System.out.println("���� �����Դϴ�.");
		}
		
		if(number%5 == 0) {
			System.out.println(number + "���� 5�� ����Դϴ�.");
		}else {
			System.out.println(number + "���� 5�� ����� �ƴմϴ�.");
		}*/
		
		
		//���� x�� 90�̻� 100������ �� ����ϱ�
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("������ 1�� �Է�==>");
		int x = sc.nextInt();
		if(x>=90 && x<=100 ) //&& �׸���
			System.out.println("���� x�� 90�̻� 100������ �� ����ϱ�");*/

		//���� x�� 0���� �۰ų� 100���� Ŭ ��
		/*int x1=76;
		if(x1<0 || x1>100) {
			System.out.println("���� x�� 0���� �۰ų� 100���� Ŭ ��");
		}
		
		//���� x�� 3�� ������� 2�� ����� �ƴҶ�  	//!= �ƴҶ�
		int x2=33;
		if(x2%3 == 0 && x2%2 !=0) {
			System.out.println("���� x�� 3�� ������� 2�� ����� �ƴҶ�");
		}
		
		//���� ch�� �����̰ų� �� �Ǵ� ���๮���϶�
		char ch='\t';
		if(ch==' ' || ch=='\t' || ch=='\n')
			System.out.println("���� ch�� �����̰ų� �� �Ǵ� ���๮���϶�");
		
		//���� ch�� �빮���϶�
		char ch1='A';
		if(ch1>='A' && ch1<='Z')
			System.out.println("���� ch�� �빮���϶�");
		
		//���� ch�� �ҹ����� ��
		char ch2='a';
		if(ch2>='a' && ch2<='z')
			System.out.println("���� ch�� �ҹ����϶�");
		
		//���ڿ� str�� ������ "yes"�� ��(��ҹ��� ����)
		String str="yes";
		if(str.equals("yes")) //String�� Class �̱� ������ == �Ⱦ��� .equals �� �����
			System.out.println("���ڿ� str�� ������ yes");
		
		//���ڿ� str�� ������ "yes"�� ��(��ҹ��� ���о���)
		String str1="YES";
		if(str1.equalsIgnoreCase("yes")){ //equalsIgnoreCase ��ҹ��� ����
			System.out.println("���ڿ� str�� ������ yes");
		}*/	
		
	    //����1 �����Է�
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�==>");
		int score = sc.nextInt();
		
		if(100 >= score && score >= 96) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"A+���� �Դϴ�.");
		}else if(95 >= score && score >= 91) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"A0���� �Դϴ�.");
		}else if(90>= score && score >= 86) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"B+���� �Դϴ�.");
		}else if(85>= score && score >= 81) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"B0���� �Դϴ�.");
		}else if(80>= score && score >= 76) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"C+���� �Դϴ�.");
		}else if(76>= score && score >= 71) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"C0���� �Դϴ�.");
		}else if(70>= score && score >= 66) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"D+���� �Դϴ�.");
		}else if(66>= score && score >= 61) {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"D0���� �Դϴ�.");
		}else {
			System.out.println("����� ������ "+ score +"���Դϴ�."+"F���� �Դϴ�.");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���==>");
		int jumsu = sc.nextInt();
		String hakjum=null;//null �ڷḦ ���� ���� �ʾҴ�. 
		boolean error=false;
		String opt="o";
		if(jumsu<0 || jumsu > 100) { //500   85<0 false �Ǵ� 85>100
			error=true;
		}
		if(jumsu >= 90 && !error) { //97
			hakjum="A";
			if(jumsu>=95) {
				opt="+";
			}
			
		}else if(jumsu >= 80 && !error) {
			hakjum="B";
			if(jumsu>=85) {
				opt="+";
			}
		}else if(jumsu>=70 && !error) {
			hakjum="C";
			if(jumsu>=75) {
				opt="+";
			}
		}else if(jumsu>=60 && !error) {
			hakjum="D";
			if(jumsu>=65) {
				opt="+";
			}
		}else if(jumsu < 60 && !error){
			hakjum="F";
			opt=null;
		}
		if(hakjum != null) {
			System.out.println("����� ������ " + jumsu+"���Դϴ�");
			if(opt != null) {
		     System.out.println("����� ������ " + hakjum + opt + "�����Դϴ�.");
			}else {
			  System.out.println("����� ������ " + hakjum + "�����Դϴ�.");
			}
			
		} else {
			System.out.println("���� �Է� ������ 0~100�� ���� �Դϴ�. ");
		}

	}
}