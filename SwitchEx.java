package p146;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//switch~case�� ��� : ����� ���� ��������
		//���� switch(���ǽ� �Ǵ� ���� 
		/*switch(����) { }
			case ��1: {
			
				}
			case ��2: {				
				}
			case ��3: {
				
				}*/
		/*String word="f";
		switch(word) {
			case "A" :  
			case "a" : {
				System.out.println("a�� ���۵Ǵ� �����  ant�� �ִ�.");
				break; //switch���� ������
			}
			case "B" :
			case "b" : {
				System.out.println("b�� ���۵Ǵ� �����  bear�� �ִ�.");
				break; 
			}
			case "C" :
			case "c" : {
				System.out.println("c�� ���۵Ǵ� �����  cat�� �ִ�.");
				break; 
			}
			case "D" :
			case "d" : {
				System.out.println("d�� ���۵Ǵ� �����  dog�� �ִ�.");
				break; 
			}
			default : {
				System.out.println("a~d������ �����ڰ� �ƴ�.");
			}
		}*/

		/*int a=10, b=20;
		switch(a+b) {
			case 0 : {
				System.out.println("�ΰ��� ���� 0�Դϴ�.");
				break;
			}
			case 10 : {
				System.out.println("�ΰ��� ���� 10�Դϴ�.");
				break;
			}
			case 20 : {
				System.out.println("�ΰ��� ���� 20�Դϴ�.");
				break;
			}
			case 30 : {
				System.out.println("�ΰ��� ���� 30�Դϴ�.");
				break;
			}
			default : {
				System.out.println("�����Դϴ�.");
				break;
			}
		 }*/
		
		/*double a=0.5, b=1.5;
		switch(a+b) { //switch�� �� ����� �� �ִ� ������ int(char), String, enum�� ������
		// �Ǽ����� ��� �� �� ����.
		// enum ������ ex)��ȭ���������  1��2��...12��  �����ι�...��������  ������ �ʵ���� �����ϴ� ��
			case 0.0 : {
				System.out.println("�ΰ��� ���� 0.0�Դϴ�.");
				break;
			}
			case 1.0 : {
				System.out.println("�ΰ��� ���� 1.0�Դϴ�.");
				break;
			}
			case 1.5 : {
				System.out.println("�ΰ��� ���� 1.5�Դϴ�.");
				break;
			}
			case 2.0 : {
				System.out.println("�ΰ��� ���� 2.0�Դϴ�.");
				break;
			}
			default : {
				System.out.println("�����Դϴ�.");
				break;
			}
		 }*/
		
		//switch~case������ �ۼ��ϱ�
		/*Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��Ͻÿ�:");
		int month = sc.nextInt();
		switch(month) {
			case 3 :
			case 4 :
			case 5 :{
				System.out.println("3,4,5���̸� ������ ������ ���Դϴ�.");
				break;
			}
			case 6 :
			case 7 :
			case 8 :{
				System.out.println("6,7,8���̸� ������ ������ �����Դϴ�.");
				break;
			}
			case 9 :
			case 10 :
			case 11 :{
				System.out.println("9,10,11���̸� ������ ������ �����Դϴ�.");
				break;
			}
			case 12 :
			case 1 :
			case 2 :{
				System.out.println("12,1,2���̸� ������ ������ �ܿ��Դϴ�.");
				break;
			}
			default : {
				System.out.println("�����Դϴ�.");
				break;
			}
		}
		*/
		//���� ���α׷�
		System.out.println("���ϱ�: + , ���� - ���ϱ� * ������ /");
		Scanner sc = new Scanner(System.in);
		System.out.printf("����� ��ȣ��? ");
		String sign = sc.nextLine();
		System.out.println();
		System.out.println("����� ���� 2�� �Է��ϱ� ");
		System.out.printf("����1==> ");
		int num1 = sc.nextInt();
		System.out.printf("����2==> ");
		int num2 = sc.nextInt();
		int result=0;
		switch(sign) {
			case "+" :{
			result = num1+num2;
			break;
		}
			case "-" :{
			result = num1-num2;
			break;
		}
			case "*" :{
			result = num1*num2;
			break;
		}	case "/" :{
			result = num1/num2;
			break;
		}	default : {
			System.out.println("�����Դϴ�.");
			}
			
		}//end switch
		System.out.printf("���� ��� ȭ��.");
		System.out.printf(num1 + sign + num2 + "=" + result);
		
	}
}
		
		
		

	


