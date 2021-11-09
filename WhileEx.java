package p156;

public class WhileEx {

	public static void main(String[] args) {
		//while문 예제
	    /*while(조건문) {
			참
		};
		int a=10;
		while(a>=0) {
			System.out.println("참이면 이곳을 처리됨"+a+"값의 변화");
			a--;
		}
		System.out.println("이곳은 반복문의 바깥임");*/
		
		//do~while문 예제
		/*do {
			반복할 명령문 나열
		}while(조건문);
		조건문이 참이면 반복할 명령문을 가서 수행한다.*/
		
		/*int b=20;
		do {
			System.out.println("do~while문일 때 반복하는 부분임" +b+ "의 값의 변화");
			b+=5;
		}while(b != 100);
		System.out.println("do~while문의 바깥문장임");*/
		
		//1~10까지 출력하기
	/*	int i=1;
		do {
			System.out.print(i + " ");
			i=i+1;
		} while(i<=10);*/
		
		//50~1까지 출력하기 50 49 .. 41
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
		
		//0~300까지 짝수를 출력 0 2 4
		//한줄에 20개씩 출력하기
		//출력한 전체 갯수를 찍기 total
		//10의 배수는 출력하지 않기 if(i%10 == 0) continue;
		//i의 합을 출력하기 sum
		//sum의 값이 20000이상 될 때 반복문을 끝내기
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
			if(i%10 == 0) continue; //10의 배수
			System.out.print(i + " ");			
			total++;
		}
		System.out.println();
		System.out.println("전체 출려된 갯수는 "+total+" 개 입니다.");
		System.out.println("전체 합은 "+sum+" 입니다.");*/
		
		//1~100까지 정수 출력하기
		//한행 10개씩 출력하기 cnt 변수 이용
		//2의 배수 제외한 수 출력하기
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