package p184;

public class ArrayEx3 {

	public static void main(String[] args) {
		//���1
		int[] ia1 = {1,2,3,4};
		
		System.out.println(ia1.length);
		//�迭�� ���� ����ϱ�
		//for������ �ٲ㺸����
		for(int i=0;i<4;i++) {
		System.out.println(ia1[i]);
		}
		
		//���2 *�߿�
		int[] ia2;
		ia2 = new int[] {10,20,30,40,50};
		
		System.out.println(ia2.length);
		for(int j=0;j<5;j++) {
		System.out.println(ia2[j]);
		}
		//10, 30, 50
		for(int j=0;j<5;j=j+2) {
		System.out.println(ia2[j]);
		}
		//���3
		int[] ia3=new int[5];
		System.out.println(ia3.length);
		//���� 100,200,.. 500���� �ֱ�
		ia3 = new int[] {100,200,300,400,500};
		//���� ����ϱ�
		for(int k=0;k<5;k=k+1) {
		System.out.print(ia3[k]+" ");
		}
		
	}

}
