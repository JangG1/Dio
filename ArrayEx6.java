package p197;

public class ArrayEx6 {
     //배열 실습예제5
	public static void main(String[] args) {
		/*if(args.length != 2) {
		System.out.println("프로그램의 사용법");
		System.out.println("java MainStringArrayArgument num1 num2");
		System.exit(0);
	 	}
		String strNum1 = args[0]; // "100" => Run Configurations -> Arguments
		String strNum2 = args[1]; //  "90"
		//"100" --> 100   파싱 : 변환한다
		int num1 = Integer.parseInt(strNum1); //"a" --> 정수형 변환해라
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);*/
		
	 //배열 실습예제9
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//카피                             배열값 카피   0번터 	~에다가     0번 위치부터        n개,길이만큼
		//oldStrArray 배열의 0번 인덱스부터 newStrArray 배열의 0번 인덱스 위치부터
		//oldStrArray.length 길이만큼 복사하기
		for(int i=0; i<newStrArray.length; i++) {
		System.out.print(newStrArray[i] + " ");
			}
		//oldStrArray 배열안 array 3번자리에 추가하기
		System.out.println();
		System.arraycopy( oldStrArray, 1, newStrArray, 3, 1);
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " ");
				}
		System.out.println();
		for(String a : newStrArray) { 
        //향상된 for문	for(자료형 변수명 : 집합(배열, 컬렉션, 열거) 변수에 넣어서 참이면 반복문 유지
			System.out.print(a + "  ");
		}
			}
	} 


	
 

