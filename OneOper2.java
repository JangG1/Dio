package operationEx;

import java.util.Scanner;

public class OneOper2 {

	public static void main(String[] args) {
		//��Ģ������ +, -, *, /, %
		/*int a=10, b=3;
		System.out.println(a/(double)b); //���� ����, b�� double ó��
		System.out.println(a%b);//������ (����� ������)
		
		//������ ������ Ȱ���� ~�� ����� ���� �� �����
		//10�� 2�� ����ΰ�?
		System.out.println(a%2);
		if(a%2 == 0)
			System.out.println("2�� ����Դϴ�");
		else
			System.out.println("2�� ����� �ƴմϴ�.");
		//����1)
		System.out.println(2+3-4);//1
		System.out.println(2+3*4);//14
		System.out.println(2*3/4);//1
		System.out.println(4/3);//1	
		System.out.println(4%3);//1
		
		//����1-1) ���� 2���� �Է� �޾� ������� �ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�==>");
		int number1 = sc.nextInt();
		System.out.println("�����Է�==>");
		int number2 = sc.nextInt();
		System.out.println();
		int hap = number1+number2;
		System.out.println("��=>" + hap);
		int sub = number1 - number2;
		System.out.println("��=>" + sub);
		int mul = number1 * number2;
		System.out.println("��=>" + mul);
		int div = number1 / number2;
		System.out.println("������ ��=>" + div);
		int mod = number1 % number2;
		System.out.println("������=>" + mod);
		//ó�� �Է��� ������ ¦������ Ȧ������ ����ϱ�
		if(number1%2 == 0)
			System.out.println("¦���Դϴ�");
		else
			System.out.println("Ȧ���Դϴ�");*/
		//����2) ������ȯ ���α׷�
		/*Scanner sc = new Scanner(System.in);
		System.out.println("�����Է�==>");
		int number1 = sc.nextInt();
		System.out.println("�����Է�==>");
		int number2 = sc.nextInt();
		System.out.println();
		int div = number1/number2;
		System.out.println("500�� ¥�� ==>" + div);
		int sub = number1-7500;
		System.out.println("100�� ¥�� ==>" + sub/100);
		int mul = sub-(100*2);
		System.out.println("50�� ¥�� ==>" + mul/50);
		int hap = mul - (1*50);
		System.out.println("7�� ¥�� ==>" + hap/10);
		int mod = hap-(2*10);
		System.out.println("�ٲ��� ���� �ܵ��� ¥�� ==>" + mod);*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("��ȯ�� ����==>");
		int money = sc.nextInt();
		int money500, money100, money50, money10;
		money500 = money / 500;
		money = money - (money500*500);
		money100 = money / 100;
		money = money - (money100*100);
		money50 = money / 50;
		money = money - (money50*50);
		money10 = money / 10;
		money = money - (money10*10);
		
		System.out.println("500��¥�� ==>" + money500+"��");
		System.out.println("100��¥�� ==>" + money100+"��");
		System.out.println("50��¥�� ==>" + money50+"��");
		System.out.println("10��¥�� ==>" + money10+"��");
		System.out.println("�ٲ��� ���� �ܵ��� ==>" + money +"��");*/
		
		//����3 ���� ����ϱ�
		/*Scanner sc = new Scanner(System.in);
		System.out.print("������ ����� �⵵�� �Է� ==>");
		int year = sc.nextInt();
		//����) ������ 4�� ������ �������� 100���� ������ �������� ������ �����̴�. �Ǵ� ||
		// 400���� ������ �������� �ص� ���⿡ ���Եȴ�.
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + "�ش� �����Դϴ�.");
		else
			System.out.println(year + "�ش� ����ƴմϴ�.");*/
	
		//����4
		/*Scanner sc = new Scanner(System.in);
		System.out.print("�� �Ǽ� �Է��ϱ� ==>");
		double doubleNumber1 = sc.nextDouble();//3.5
		double doubleNumber2 = sc.nextDouble();//1.2
		double sum, avg;
		
		//doubleNumber1�� ������ ��ȯ
		int chN1 = (int) doubleNumber1;//3
		int chN2 = (int) doubleNumber2;//1
		
		//chN1�� �ٽ� �Ǽ������� ��ȯ�Ͽ��� ���
		doubleNumber1 = chN1;// 3.0?
		doubleNumber2 = chN2;// 1.0?
		
		sum = doubleNumber1 + doubleNumber2;//3.0+1.0
		avg = sum / 2;
		
		System.out.println(sum);
		System.out.println(avg);*/
		
		//����6
		/*Scanner sc = new Scanner(System.in);
		System.out.print("�Ǽ� �Է��ϱ� ==>");
		double kgNum = sc.nextDouble();
		
		double pound;
		pound = kgNum / 0.453592;
		
		//1�ܰ�
		pound = pound * 1000;
		//System.out.println(pound); - ����� ���α׷�
		//2�ܰ�
		pound = pound + 0.5;
		//System.out.println(pound);
		int cpound = (int)pound;
		//System.out.println(cpound);
		pound = cpound / (double)1000;
		System.out.println(pound);*/
		
		
		//����7
		/*Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϱ�(F,f,C,c) ==>");
		String word = sc.nextLine();
		System.out.print("�� �Է��ϱ� ==>");
		double value = sc.nextDouble();
		double f, c;
		if(word.equals("F") || word.equals("f")) {
			//���
			c = (5.0/9.0) * (value - 32);
			//���
			System.out.print(c);
		} else if(word.equals("C") || word.equals("c")) {
			f = (9.0/5.0) * value +32;
			System.out.print(f);
		} else {
			System.out.print("F, f, C, c�߿��� �Է��� �ϼž� �մϴ�. �ٽ� �Է�");*/
		
		//����8
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("�ݾ� �Է��ϱ� ==>");
	    int money = sc.nextInt();
	   
	    //2347653
		int money500, money100, money50, money10;
		money500 = money / 500;
		money = money - (money500*500);
		money100 = money / 100;
		money = money - (money100*100);
		money50 = money / 50;
		money = money - (money50*50);
		money10 = money / 10;
		money = money - (money10*10);
		
		System.out.println("money500+"��");
		System.out.println("money100+"��");
		System.out.println("money50+"��");
		System.out.println("money10+"��");
		System.out.println("money +"�� �Դϴ�");*/
		
		//����9
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("������ ���� �Է��ϱ� (1��~12��)==>");
	    int month = sc.nextInt();
	    String s;
	    s = (month <= 6) ? "��ݱ�":"�Ϲݱ�"; //���߿�����, ���׿�����
	    System.out.println(s+"�Դϴ�.");*/
		
		//����10
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("����1==>");
	    int m1 = sc.nextInt();
	    System.out.print("����2==>");
	    int m2 = sc.nextInt();
	    System.out.print("����3==>");
	    int m3 = sc.nextInt();
	    
	    int max;//���ؼ� ���� ū���� ����� ����
	    		//������=(���ǽ�) ? ��:����;
	    max = (m1 > m2) ? m1:m2;
	    				//���� ����
	    max = (max > m3) ? max:m3;
	    System.out.println(max);
	    
	    //�ּҰ�
	    int min;
	    min = (m1 < m2) ? m1:m2;
	    min = (min < m3) ? min:m3;
	    System.out.println(min);*/
		
		//����11~14 ���� 
		
		//����11
		/*Scanner sc = new Scanner(System.in);
	    System.out.print("������ �Է��ϱ� ==>");
	    int weight = sc.nextInt();
	    System.out.print("Ű �Է��ϱ� ==>");
	    int height = sc.nextInt();
	    
		if(weight <= (height-100) * 0.9)
			System.out.println("�����Դϴ�");
		else
			System.out.println("���Դϴ�");
		
		//����12
		Scanner sc = new Scanner(System.in);
	    System.out.print("�� �Է��ϱ� ==>");
	    int second = sc.nextInt();
	        
        int hour = second / 3600;
        second = second - hour*3600;
		int minute = second / 60;
		second = second - minute*60;

	    System.out.println(hour+"�� "+minute+"�� "+second+"�� �Դϴ�.");
		
		//����13
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("������ ���� ���� ==>");
	    int pencil = sc.nextInt();
		
	    int g = pencil/30;
	    int e = pencil%30;
	    System.out.print("�л� 30��� "+g+"���� ���޹ް� "+e+"���� �����ϴ�.");
		
		//����14
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϱ� ==>");
		int number = sc.nextInt();
		
		number = number/100;
		number = number*100;
		
		System.out.println(number);*/
		
 }
}


