package p183;

public class ArrayEx02 {

	public static void main(String[] args) {
		//�迭�� ���� ������ ������ ������ ������ �ʱ� ���� (ȿ����)
		int[] intArray=null;
		double[] doubleArray=null;
		String[] strArray=null;
		
		//�迭�� �����ϴ� ���1 - �迭�����ϸ鼭 �ٷ� ���� �ֱ�
		//���� ������ŭ �迭�� ũ�Ⱑ ����
		/*int[] iA1 = {1,2,3,4};
		double[] dA1= {1.2, 2.2};
		System.out.println(dA1[1]);
		System.out.println(iA1[3]);*/
		
		//�迭�� �����ϴ� ���2 - ���� ������ �� ��� ���� *�ǹ����� ���� ���� ����(�߿�)
		// ������Ÿ��[] ����;
		// ���� = new Ÿ��[] {��0, ��1, ��2, ��3, ...);
		/*boolean[] ba1;
		ba1 = new boolean[] {true, true, false};
		String[] sa1;
		sa1 = new String[] {"ȫ�浿", "������"};
		float[] fa1;
		fa1=new float[] {1.1f, 2.2f, 3.3f};
		System.out.println(ba1[2]);
		System.out.println(sa1[1]);
		System.out.println(fa1[0]);*/
		
		//�迭�� �����ϴ� ���3 - Ÿ��[] ���� = new Ÿ��[����];
		//�迭�� ������ ���޸𸮿� ����� �ΰ� ���߿� �� �ִ� ��쿡 �̿���
		int[] ia3 = new int[5];
		double[] da3 = new double[10];
		char[] ca3 = new char[3];
		boolean[] ba3 = new boolean[4];
		String[] sa3 = new String[5];
		//ia3�迭�� 0�� �ε����� ���� ����� ������
		//���޸𸮿� �ڷᰪ�� �Ҵ�Ǹ� �ڵ����� �⺻������ ä������.
		//���ø޸𸮴� �ڵ����� �ʱⰪ�� ��ä����.
		System.out.println(ia3[0]);//0
		System.out.println(da3[0]);//0.0
		System.out.println(ca3[0]);//����
		System.out.println(ba3[0]);//false
		System.out.println(sa3[0]);//null
		
		}
	}

