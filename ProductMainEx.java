package ep1313;

import java.util.Scanner;

public class ProductMainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menuSelect = 0;
		//객체화, 힙메모리에 제품판매 클래스를 사용하기 위해서 올려줌
		ProductSalesManagement psm = new ProductSalesManagement();
		
		while(menuSelect !=3) {
			System.out.println("------------------");
			System.out.println("제품판매관리 프로그램");
			System.out.println("------------------");
			System.out.println("1. 입력 2. 출력 3.종료");
			System.out.print("선택-->");
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
				System.out.print("제품판매관리 프로그램을 종료합니다.");
				break;
			}
			default : {
				System.out.print("메뉴의 범위는 1~3입니다. 다시 입력하기");
			}
			}
		}
	}

}

//제품판매 클래스 - 설계도
class ProductSalesManagement{
	String[] productKind = new String[10]; //제품분류명 화장품, 가전제품
	String[] productName = new String[10]; //제품명
	int[] price = new int[10]; //판매가
	int[] saleAmount = new int[10]; //판매량
	int cnt=-1; //입력한 회수
	
	void calTake() {}; //계산 메소드
	void inputData() {
		System.out.println("----------");
		System.out.println("  입력화면   ");
		System.out.println("----------");
		System.out.print("제품 분류->");
		Scanner sc = new Scanner(System.in);
		cnt++;
		productKind[cnt] = sc.nextLine();
		System.out.print("품 명->");
		productName[cnt] = sc.nextLine();
		System.out.print("판매량->");
		saleAmount[cnt] = sc.nextInt();
		
	}; //입력
	void outputData() {
		System.out.println("-------------------------");
		System.out.println("제품분류 품명 판매가 판매량 매출액");
		System.out.println("-------------------------");
		for(int i=0;i<=cnt;i++) { //i=0 .. cnt
		if(productKind[i].equals("화장품")) {
			if(productName[i].equals("립스틱")) {
				price[i]=2000;
			}
			else if(productName[i].equals("비누")) {
				price[i]=500;
			}
			else if(productName[i].equals("샴푸")) {
				price[i]=1000;
			}
		}else if(productKind.equals("사무용품") ){
			if(productName[i].equals("A4용지")) {
				price[i]=10000;
			}else if(productName[i].equals("노트")) {
				price[i]=20000;
			}
			else if(productName[i].equals("펜")) {
				price[i]=500;
			}
		 }
		
		System.out.println(productKind[i] + " " + productName[i] + " " + price[i] + " " + 
						   saleAmount[i] + " " + (price[i] * saleAmount[i]));
		} //end for 끝
	}; //출력
}