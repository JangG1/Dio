package p163;

public class ForEx {

	public static void main(String[] args) {
		int i=10;
		for(;;) { //무조건 참이라 무한 반복
			i++;
			System.out.println(i);
			if(i==100) break;
		}
		int j=10;
		while(true) {
			System.out.println(j + "while문임");
			j++;
			if(j==20) break;
		}
		int k=10;
		do {
			System.out.println(k+"do~while문");
			k++;
			if(k==20) break;
		}while(true);
	}

}
