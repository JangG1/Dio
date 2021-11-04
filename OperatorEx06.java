package p132;

public class OperatorEx06 {

	public static void main(String[] args) {
		// 대입연산자
		int a=10;
		int b,c;
		c=b=a; // b=a; c=b;    a를 b에 넣고 b가 c와 같다
		System.out.printf("%d %d %d", a,b,c);
		
		a=a+10;
		a+=10; //복합대입연산자 (위와 같음)
		
		b=b-5;
		b-=5;
		
		c=c*8;
		c*=8;

		c=c/2;
		c/=2;
		
		c=c%5;
		c%=5;
		
		a-=2;
		a=a-2;
		
		b+=3;
		b=b+3;
		
		c*=4;
		c=c*4;
		
		c/=5;
		c=c/5;
		
		a%=2;
		a=a%2;
		
		a=a+1;
		a+=1;
		a++;
		
		a=b+3;
	}

}
