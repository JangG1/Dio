package operationEx;

public class OneOper {

	public static void main(String[] args) {
		// 단항연산자, 이항연산자, 삼한연산자
		int a1=10;
		int b1=20;
		//a1 = a1+1;
		//a1++;
		//++a1;
		
		//a1=a1-1;
		//a1--;
		//--a1;
		
		int result;
		
		/*result = a1++;
		//result = a1, a1++
		System.out.println(result + " " + a1);*/
		
		/*result = ++a1;
		// ++a1, result = a1;
		System.out.println(result + " " + a1);*/
		
		/*result = ++a1;
		System.out.println(result + " " + a1);*/
		
		/*result = a1++ + ++b1;
		// 		 10   +   21
		System.out.println(result + " " + a1 + ", "+b1); //31 11 21
		*/
		
		
		System.out.println(++a1);//10 11
		a1++; //a1=a1+1
		a1--; //a1=a1-1
		//a1**; //a1 a1*1 <- 이런건 없음
	}

}
