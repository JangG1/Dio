package p183;

public class ArrayEx02 {

	public static void main(String[] args) {
		//배열을 쓰는 이유는 변수를 여러개 만들지 않기 위해 (효율성)
		int[] intArray=null;
		double[] doubleArray=null;
		String[] strArray=null;
		
		//배열을 생성하는 방법1 - 배열선언하면서 바로 값을 넣기
		//값의 갯수만큼 배열의 크기가 잡힘
		/*int[] iA1 = {1,2,3,4};
		double[] dA1= {1.2, 2.2};
		System.out.println(dA1[1]);
		System.out.println(iA1[3]);*/
		
		//배열을 생성하는 방법2 - 변수 선언후 값 목록 대입 *실무에서 가장 많이 쓰임(중요)
		// 데이터타입[] 변수;
		// 변수 = new 타입[] {값0, 값1, 값2, 값3, ...);
		/*boolean[] ba1;
		ba1 = new boolean[] {true, true, false};
		String[] sa1;
		sa1 = new String[] {"홍길동", "김유신"};
		float[] fa1;
		fa1=new float[] {1.1f, 2.2f, 3.3f};
		System.out.println(ba1[2]);
		System.out.println(sa1[1]);
		System.out.println(fa1[0]);*/
		
		//배열을 생성하는 방법3 - 타입[] 변수 = new 타입[길이];
		//배열의 공간을 힙메모리에 만들어 두고 나중에 값 넣는 경우에 이용함
		int[] ia3 = new int[5];
		double[] da3 = new double[10];
		char[] ca3 = new char[3];
		boolean[] ba3 = new boolean[4];
		String[] sa3 = new String[5];
		//ia3배열의 0번 인덱스의 값을 출력해 보세요
		//힙메모리에 자료값이 할당되면 자동으로 기본값들이 채워진다.
		//스택메모리는 자동으로 초기값이 안채워짐.
		System.out.println(ia3[0]);//0
		System.out.println(da3[0]);//0.0
		System.out.println(ca3[0]);//공백
		System.out.println(ba3[0]);//false
		System.out.println(sa3[0]);//null
		
		}
	}

