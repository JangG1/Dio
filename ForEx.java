package p163;

public class ForEx {

	public static void main(String[] args) {
		int i=10;
		for(;;) { //������ ���̶� ���� �ݺ�
			i++;
			System.out.println(i);
			if(i==100) break;
		}
		int j=10;
		while(true) {
			System.out.println(j + "while����");
			j++;
			if(j==20) break;
		}
		int k=10;
		do {
			System.out.println(k+"do~while��");
			k++;
			if(k==20) break;
		}while(true);
	}

}
