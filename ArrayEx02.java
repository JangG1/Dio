package p216;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 2차원 배열
		// 방법1 배열 선언하고 바로 초기값을 넣는다.
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
		System.out.println(c.length); //행의 길이
		System.out.println(c[0].length); //열의 길이
		for(int i=0;i<c.length;i++) { //0,1,2
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();*/
		
		// 3차원 배열
		double[][][] jumsu = { { {1.1,2.2},{3.3,4.4},{5.5,6.6 } },
						     { {7.7,8.8},{9.9,10.10},{11.11,12.12}}};
	    //5.5 출력해 보기
        System.out.println(jumsu[0][2][0]);
	    //9.9 출력해 보기
        System.out.println(jumsu[1][1][0]);
        //전체 출력하기 for문
        //면 for 행 for 열for
        //면의 길이는 jumsu.length 배열의 길이, 
        //행의 길이 = 0면의 길이 jumsu[0].length
        //열의 길이 = jumsu[0][0].length
        System.out.println(jumsu.length + " " + jumsu[0].length + " " + jumsu[0][0].length);
        
        for(int i=0;i<jumsu.length;i++) {//면
        	for(int j=0;j<jumsu[i].length;j++) {//행
        		for(int k=0;k<jumsu[i][i].length;k++) {//열
        			System.out.print(jumsu[i][j][k]+" ");
        		}
        		System.out.println();
        	}
        	System.out.println();
        }
        System.out.println("====================");
        //향상된 for문 출력하기
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