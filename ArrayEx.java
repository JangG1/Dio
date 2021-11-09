package p180;

public class ArrayEx {

	public static void main(String[] args) {
		//설계된 클래스를 사용하려면 힙메모리에 올려야 한다. = 인스턴스화 객체화
		/*A a= new A();
		A a1= new A();
		A a2= a;
		System.out.println(a==a1); //주소가 같지 않다
		System.out.println(a==a2); 
		
		//변수를 줄때 초기값을 넣는 것 (변수에 제일 처음 넣는 값)
		int i; //변수 선언
		i=0; //변수에 초기값 넣기
		i=i+100; //변수에 두번째 값 넣기
		
		//기본형 초기값
		int j = 0;
		double k = 0.0;
		boolean b=false;
		
		//참조형 초기값
		A a3=null; //A라는 객체(Class)의 a3이라는 변수
		
		//int aa=null; 기본형인 경우에는 null을 초기값으로 넣지 못한다.
		A a4 = new A();
		
		System.out.println(a3 == null);
		System.out.println(a3 != null);
		System.out.println(a4 == null);*/
		
		
		/*int[] intArray = null;
		intArray[0] = 10;
		
		String str = "abcdef";
		System.out.println("총문자수 "+str.length());*/
		
		String name="장지원"; //주소100번지
		String hobby="코딩";
		String name1="장지원"; //주소100번지
		System.out.println(name==hobby);
		System.out.println(name==name1);
		
		String name2= new String("장지원"); //주소 200번지
		String name3= new String("장지원"); //주소 300번지
		System.out.println(name2==name3);
		
	}

}

//설계
class A{
	
}