package ep1313;

import java.util.Scanner;

public class ProductMainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuSelect = 0;
		//��üȭ, ���޸𸮿� ��ǰ�Ǹ� Ŭ������ ����ϱ� ���ؼ� �÷���
		ProductSalesManagement psm = new ProductSalesManagement();
		
		while(menuSelect !=3) {
			System.out.println("------------------");
			System.out.println("��ǰ�ǸŰ��� ���α׷�");
			System.out.println("------------------");
			System.out.println("1. �Է� 2. ��� 3.����");
			System.out.print("����-->");
			menuSelect = sc.nextInt();
			//if(menuSelect == 1) psm.inputData();
			//else if(menuSelect == 2) psm.outputData();
			switch(menuSelect) {
			case 1 : {
				psm.inputData(); break;
			}
			case 2 : {
				psm.outputData(); break;
			}
			case 3 : {
				System.out.print("��ǰ�ǸŰ��� ���α׷��� �����մϴ�.");
				break;
			}
			default : {
				System.out.print("�޴��� ������ 1~3�Դϴ�. �ٽ� �Է��ϱ�");
			}
			}
		}
	}

}

//��ǰ�Ǹ� Ŭ���� - ���赵
class ProductSalesManagement{
	String[] productKind = new String[10]; //��ǰ�з��� ȭ��ǰ, ������ǰ
	String[] productName = new String[10]; //��ǰ��
	int[] price = new int[10]; //�ǸŰ�
	int[] saleAmount = new int[10]; //�Ǹŷ�
	int cnt=-1; //�Է��� ȸ��
	
	void calTake() {}; //��� �޼ҵ�
	void inputData() {
		System.out.println("----------");
		System.out.println("  �Է�ȭ��   ");
		System.out.println("----------");
		System.out.print("��ǰ �з�->");
		Scanner sc = new Scanner(System.in);
		cnt++;
		productKind[cnt] = sc.nextLine();
		System.out.print("ǰ ��->");
		productName[cnt] = sc.nextLine();
		System.out.print("�Ǹŷ�->");
		saleAmount[cnt] = sc.nextInt();
		
	}; //�Է�
	void outputData() {
		System.out.println("-------------------------");
		System.out.println("��ǰ�з� ǰ�� �ǸŰ� �Ǹŷ� �����");
		System.out.println("-------------------------");
		for(int i=0;i<=cnt;i++) { //i=0 .. cnt
		if(productKind[i].equals("ȭ��ǰ")) {
			if(productName[i].equals("����ƽ")) {
				price[i]=2000;
			}
			else if(productName[i].equals("��")) {
				price[i]=500;
			}
			else if(productName[i].equals("��Ǫ")) {
				price[i]=1000;
			}
		}else if(productKind.equals("�繫��ǰ") ){
			if(productName[i].equals("A4����")) {
				price[i]=10000;
			}else if(productName[i].equals("��Ʈ")) {
				price[i]=20000;
			}
			else if(productName[i].equals("��")) {
				price[i]=500;
			}
		 }
		
		System.out.println(productKind[i] + " " + productName[i] + " " + price[i] + " " + 
						   saleAmount[i] + " " + (price[i] * saleAmount[i]));
		} //end for ��
	}; //���
}