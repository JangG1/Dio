package ch01;

public class Var01 {

	public static void main(String[] args) {
	     byte ba=10;//1byte
	     short sa=20;//2byte
	     byte bba;
	     bba=ba;//1byte = 1byte
	     sa=ba;//2byte(ūŸ��) = 1byte(����Ÿ��) ����������ȯ(�Ϲ�������ȯ)
	     ba=(byte) sa; //1byte(����Ÿ��) = (byte) 2byte(ūŸ��) �����ͼս� �߻��� �� ���� �����Ϸ��� ����ó��
	     //��������ȯ, ���������ȯ (�ٲ���Ÿ�Ը��)
	     int ia=100;//4byte
	     double da=10.2;//8byte
	     da=ia;//8byte(ūŸ��) = 4byte(����Ÿ��) �Ǽ�(ūŸ��) = ����(����Ÿ��)
	     ia=(int)da;
	     
	     byte bb=20;
	     short sb=30;
	     int sumb;
	     sumb=bb + sb; // ��Ģ�����ڴ� ��� int������ ó����
	     
	     //�Ǽ���
	     float fa=10.0f;//4byte
	     double dda=10.0;//8byte  �⺻��
	     dda=fa;//����������ȯ
	     fa=(float)dda;//���������ȯ
	     
	     fa=bb;//�Ǽ���(ūŸ��)=������(����Ÿ��)
	     int ii=100;
	     fa=ii;//�Ǽ��� = ������
	     dda=ii;
	     ii=(int)fa;//������=(int)�Ǽ���
	     ii=(int)dda;
	     
	     //�������� �����ڵ�(�ƽ�Ű�ڵ�)�� ó����
	     char ca='!';//1byte
	     int ica=0;
	     ica=ca;//������ = ������
	     byte bca=33;
	     ca = (char)bca;
	     
	     double ddda;
	     ddda=ca;
	     ca =(char)ddda;
	     
	     //���ڿ�-�⺻������ ǥ���� �� ��� Ŭ������ ǥ�� Ŭ��������(��������)�� �⺻���� ĳ���ÿ��� ���� �ʴ´�.
	     String ssa="a";
	     int isa=0;
	     // isa = (int) ssa;  �ȵ�
	     // ssa = (String) isa;
         // ��sa = (double) ssa;
	     // ssa = (String) dsa;
	     
	     //���� boolean�ȿ� ���� �� �ִ� ���ͷ��� true, false
	     boolean ok1, ok2, ok;
	     ok1=true;
	     ok2=false;
	     ok=ok1 && ok2;
	     System.out.println(ok);
	     
	     //������ ������ ����ȯ �ɱ��? �� �ȵ˴ϴ�
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
