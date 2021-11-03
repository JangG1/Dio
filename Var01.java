package ch01;

public class Var01 {

	public static void main(String[] args) {
	     byte ba=10;//1byte
	     short sa=20;//2byte
	     byte bba;
	     bba=ba;//1byte = 1byte
	     sa=ba;//2byte(큰타입) = 1byte(작은타입) 묵시적형변환(암묵적형변환)
	     ba=(byte) sa; //1byte(작은타입) = (byte) 2byte(큰타입) 데이터손실 발생할 수 있음 컴파일러가 에러처리
	     //강제형변환, 명시적형변환 (바꿔줄타입명시)
	     int ia=100;//4byte
	     double da=10.2;//8byte
	     da=ia;//8byte(큰타입) = 4byte(작은타입) 실수(큰타입) = 정수(작은타입)
	     ia=(int)da;
	     
	     byte bb=20;
	     short sb=30;
	     int sumb;
	     sumb=bb + sb; // 사칙연산자는 모두 int형으로 처리됨
	     
	     //실수형
	     float fa=10.0f;//4byte
	     double dda=10.0;//8byte  기본형
	     dda=fa;//묵시적형변환
	     fa=(float)dda;//명시적형변환
	     
	     fa=bb;//실수형(큰타입)=정수형(작은타입)
	     int ii=100;
	     fa=ii;//실수형 = 정수형
	     dda=ii;
	     ii=(int)fa;//정수형=(int)실수형
	     ii=(int)dda;
	     
	     //문자형은 유니코드(아스키코드)로 처리됨
	     char ca='!';//1byte
	     int ica=0;
	     ica=ca;//정수형 = 문자형
	     byte bca=33;
	     ca = (char)bca;
	     
	     double ddda;
	     ddda=ca;
	     ca =(char)ddda;
	     
	     //문자열-기본형으로 표현할 수 없어서 클래스로 표현 클래스변수(참조변수)와 기본형은 캐스팅연산 하지 않는다.
	     String ssa="a";
	     int isa=0;
	     // isa = (int) ssa;  안됨
	     // ssa = (String) isa;
         // ㅇsa = (double) ssa;
	     // ssa = (String) dsa;
	     
	     //논리형 boolean안에 넣을 수 있는 리터럴은 true, false
	     boolean ok1, ok2, ok;
	     ok1=true;
	     ok2=false;
	     ok=ok1 && ok2;
	     System.out.println(ok);
	     
	     //논리형과 정수형 형변환 될까요? 답 안됩니다
	     boolean ok3=true;
	     int i3=0;
	     double d3=1.0;
	     // ok3 =(boolean) i3;
	     //  i3=(int)ok3;
	     // ok3=(boolean) d3;
	     // d3=(double) i3;
	}

}

class ChildVar{
	int cc;
	double dd;
	
}

class ChildVar02{
	
}
