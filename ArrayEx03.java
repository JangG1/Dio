package p219;

public class ArrayEx03 {

	public static void main(String[] args) {
		// ������ �迭
		/*int[][] ia = new int[3][];
		
		ia[0]=new int[4];
		ia[0][0]=1; // ����[��][��]=��;
		ia[0][1]=2;
		ia[0][2]=3;
		ia[0][3]=4;
		//ia[0][4]=5;  �ε��� ������ ����� ����, ����� ������ ����
		
		ia[1] = new int[2];
		ia[1][0]=5;
		ia[1][1]=6;
		
		ia[2]= new int[3];
		ia[2][0]=7;
		ia[2][1]=8;
		ia[2][2]=9;
		
		for(int i=0;i<ia.length;i++) {
		for(int j=0;j<ia[i].length;j++) {
			System.out.print(ia[i][j]+" ");
		}
		System.out.println();
		}*/
		
		/*String[][] na = new String[4][];
		
		na[0]=new String[2];
		na[0][0]="J";
		na[0][1]="A";
		
		na[1]=new String[3];
		na[1][0]="J";
		na[1][1]="V";
		na[1][2]="S";
		
		na[2]=new String[4];
		na[2][0]="K";
		na[2][1]="S";
		na[2][2]="Q";
		na[2][3]="P";
		
		na[3]=new String[1];
		na[3][0]="p";
		
		for(int i=0;i<na.length;i++) {
			for(int j=0;j<na[i].length;j++) {
				System.out.print(na[i][j]+" ");
			}
			System.out.println();
		}*/
		
		Student[] sa = new Student[4];
		sa[0]=new Student();
		sa[1]=new Student();
		sa[2]=new Student();
		sa[3]=new Student();
		// sa[4]=new Student(); ��Ÿ�� ���� ������ ���� ����� Student[4]��
		
		Teacher[] sa = new Teacher[2];
		ta[0]=new Teacher();
		//ta[1]=new Teacher(); �ּҰ� �ٸ�(class)
		ta[0]=null;
		
		for(int i=0;i<sa.length;i++) {
			for(int j=0;j<sa[i].length;j++) {
				System.out.print(sa[i][j]+" ");
			}
			System.out.println();
		}
	}

}

class Student{
	
}

class Teacher{
	
}