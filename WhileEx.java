package p156;

public class WhileEx {

	public static void main(String[] args) {
		//while�� ����
	    /*while(���ǹ�) {
			��
		};
		int a=10;
		while(a>=0) {
			System.out.println("���̸� �̰��� ó����"+a+"���� ��ȭ");
			a--;
		}
		System.out.println("�̰��� �ݺ����� �ٱ���");*/
		
		//do~while�� ����
		/*do {
			�ݺ��� ��ɹ� ����
		}while(���ǹ�);
		���ǹ��� ���̸� �ݺ��� ��ɹ��� ���� �����Ѵ�.*/
		
		/*int b=20;
		do {
			System.out.println("do~while���� �� �ݺ��ϴ� �κ���" +b+ "�� ���� ��ȭ");
			b+=5;
		}while(b != 100);
		System.out.println("do~while���� �ٱ�������");*/
		
		//1~10���� ����ϱ�
	/*	int i=1;
		do {
			System.out.print(i + " ");
			i=i+1;
		} while(i<=10);*/
		
		//50~1���� ����ϱ� 50 49 .. 41
		//              40 39 .. 31
		/*int i=50;
		int cnt=0;
		while(i>=1) {
			if(cnt==10) {
				System.out.println();
				cnt=0;
			}
			System.out.print(i + " ");
			i--;
			cnt++;*/
		
		//0~300���� ¦���� ��� 0 2 4
		//���ٿ� 20���� ����ϱ�
		//����� ��ü ������ ��� total
		//10�� ����� ������� �ʱ� if(i%10 == 0) continue;
		//i�� ���� ����ϱ� sum
		//sum�� ���� 20000�̻� �� �� �ݺ����� ������
		/*int i=0;
		int cnt=0;
		int total=0;
		int sum=0;
		while(i<300) {
			if(cnt==20) {
				System.out.println();
				cnt=0;
			}		
			i+=2;
			sum=sum+i; //sim+=i;
			if(sum >= 20000) break;
			cnt++;
			if(i%10 == 0) continue; //10�� ���
			System.out.print(i + " ");			
			total++;
		}
		System.out.println();
		System.out.println("��ü ����� ������ "+total+" �� �Դϴ�.");
		System.out.println("��ü ���� "+sum+" �Դϴ�.");*/
		
		//1~100���� ���� ����ϱ�
		//���� 10���� ����ϱ� cnt ���� �̿�
		//2�� ��� ������ �� ����ϱ�
		int i=1;
		int cnt=0;
		while (i<=100) {
			if(cnt==10) {
			System.out.println();
			cnt=0;
		}
		i+=1;
		if(i%2==0 || i%3==0 || i%5==0 || i%7==0 ) continue;
		System.out.print(i+" ");
		cnt++;
	}
}
}