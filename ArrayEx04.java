package p187;

public class ArrayEx04 {

	public static void main(String[] args) {
		// �迭�� ���̴� �迭�� ����� ����, �� ���� ������ �� �ִ� ������ �����̴�.
		//�ִ� ������ 20�ﰳ
		//int[] ia1 = new int[0]; //�迭�� ���̰� 0���� ��
		//�迭�� ���̴� int������ ���� ����(0,1,2,...)�Դϴ�.
		//�迭�� ���̰� �����Ҷ��� ��ū �迭�� ũ�⸦ �����ϰ� �����Ѵ�.
		//�Ϲ������� �迭�� ũ�⺸�� 2������ �迭�� ũ�⸦ �����Ѵ�.
		
		//���2 10,20,30
		
		/*int[] ia2;
		ia2 = new int[] {10,20,30};
		
		//10,20,30 40,50,60 �迭�� �����
		//1�ܰ� ��ū �迭�� �����Ѵ�.
		int[] ia3 = new int[12];
		//������ �迭�� �����Ѵ�.
		ia3[0]=ia2[0];
		ia3[1]=ia2[1];
		ia3[2]=ia2[2];
		//for������ ���� ������
		for(int i=0;i<ia2.length;i++) {
			ia3[i]=ia2[i];
		}
		//ia3�� ��� �ڷ� ����� ����
		for(int i=0;i<ia3.length;i++) {
			System.out.print(ia3[i]+" ");
		}
		// 40,50,60�� �ڿ� �߰��ϱ�
		// 40�� ia3[3]�ȿ� �ִ´�. 50�� ia3[4]�� �ִ´�. 60�� ia3[5]�� �ִ´�.
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

		//����ǥ �����
		/*String[] name;
		name = new String[] {"ȫ�浿","������"};
		int[] kor;
		kor = new int[] {100,90};
		int[] eng;
		eng = new int[] {90,85};
		int[] mat;
		mat = new int[] {80,75};
		
		
		System.out.println("����       ����  ����  ����");
		for(int i=0;i<2;i++) {
		System.out.println(ia1[i]+"     "+kor[i]+" "+eng[i]+" "+mat[i]);
		}*/
		
		/*String[] name = {"ȫ�浿", "������"};
		
		int[] kor;
		kor = new int[] {100,90};
		
		int[] eng;
		eng = new int[2];
		eng[0]=90;
		eng[1]=85;
		
		int[] mat;
		mat = new int[] {80,75};
		
		System.out.println("����       ����  ����  ����");
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"     "+kor[i]+" "+eng[i]+" "+mat[i]);
			System.out.println();
			}*/
	}

}
