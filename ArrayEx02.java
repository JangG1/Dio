package p216;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 2���� �迭
		// ���1 �迭 �����ϰ� �ٷ� �ʱⰪ�� �ִ´�.
		/*int[][] scores = new int[][] {{1,2,3},{4,5,6}};
			System.out.print(scores[0][2]);
			System.out.println(scores[1][1]);
		char[][] c = {{'a','b'},{'c','d'},{'e','f'}};
		for(char[] a : c) {
			for(char cc : a) {
				System.out.print(cc + " ");
			}
			System.out.println();
		}
		System.out.println(c.length); //���� ����
		System.out.println(c[0].length); //���� ����
		for(int i=0;i<c.length;i++) { //0,1,2
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();*/
		
		// 3���� �迭
		double[][][] jumsu = { { {1.1,2.2},{3.3,4.4},{5.5,6.6 } },
						     { {7.7,8.8},{9.9,10.10},{11.11,12.12}}};
	    //5.5 ����� ����
        System.out.println(jumsu[0][2][0]);
	    //9.9 ����� ����
        System.out.println(jumsu[1][1][0]);
        //��ü ����ϱ� for��
        //�� for �� for ��for
        //���� ���̴� jumsu.length �迭�� ����, 
        //���� ���� = 0���� ���� jumsu[0].length
        //���� ���� = jumsu[0][0].length
        System.out.println(jumsu.length + " " + jumsu[0].length + " " + jumsu[0][0].length);
        
        for(int i=0;i<jumsu.length;i++) {//��
        	for(int j=0;j<jumsu[i].length;j++) {//��
        		for(int k=0;k<jumsu[i][i].length;k++) {//��
        			System.out.print(jumsu[i][j][k]+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
        System.out.println("====================");
        //���� for�� ����ϱ�
        for(double[][] j1 : jumsu) {
        	for(double[] j11 : j1) {
        		for(double j111 : j11) {
        			System.out.print(j111+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
}
}