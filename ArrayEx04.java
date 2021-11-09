package p187;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 배열의 길이는 배열의 요소의 개수, 즉 값을 저장할 수 있는 공간의 개수이다.
		//최대 갯수는 20억개
		//int[] ia1 = new int[0]; //배열의 길이가 0개인 것
		//배열의 길이는 int범위의 양의 정수(0,1,2,...)입니다.
		//배열의 길이가 부족할때는 더큰 배열의 크기를 선언하고 복사한다.
		//일반적으로 배열의 크기보다 2배정도 배열의 크기를 선언한다.
		
		//방법2 10,20,30
		
		/*int[] ia2;
		ia2 = new int[] {10,20,30};
		
		//10,20,30 40,50,60 배열을 만들기
		//1단계 더큰 배열을 선언한다.
		int[] ia3 = new int[12];
		//기존의 배열을 복사한다.
		ia3[0]=ia2[0];
		ia3[1]=ia2[1];
		ia3[2]=ia2[2];
		//for문으로 고쳐 보세요
		for(int i=0;i<ia2.length;i++) {
			ia3[i]=ia2[i];
		}
		//ia3의 모든 자료 출력해 보기
		for(int i=0;i<ia3.length;i++) {
			System.out.print(ia3[i]+" ");
		}
		// 40,50,60을 뒤에 추가하기
		// 40은 ia3[3]안에 넣는다. 50은 ia3[4]에 넣는다. 60은 ia3[5]에 넣는다.
		int number=40;
		for(int i=3;i<6;i++){
			ia3[i]=number;
			number+=10;
		}
		for(int i=4;i<7;i++) { //i=4 5 6
			ia3[i-1]=i*10;
		}
		System.out.println();
		for(int i=0;i<ia3.length;i++) {
			System.out.print(ia3[i]+" ");
		}*/

		//성적표 만들기
		/*String[] name;
		name = new String[] {"홍길동","김유신"};
		int[] kor;
		kor = new int[] {100,90};
		int[] eng;
		eng = new int[] {90,85};
		int[] mat;
		mat = new int[] {80,75};
		
		
		System.out.println("성명       국어  영어  수학");
		for(int i=0;i<2;i++) {
		System.out.println(ia1[i]+"     "+kor[i]+" "+eng[i]+" "+mat[i]);
		}*/
		
		/*String[] name = {"홍길동", "김유신"};
		
		int[] kor;
		kor = new int[] {100,90};
		
		int[] eng;
		eng = new int[2];
		eng[0]=90;
		eng[1]=85;
		
		int[] mat;
		mat = new int[] {80,75};
		
		System.out.println("성명       국어  영어  수학");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"     "+kor[i]+" "+eng[i]+" "+mat[i]);
			System.out.println();
			}*/
	}

}
