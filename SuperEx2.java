package p311;

public class SuperEx2 {

	public static void main(String[] args) {
		// super ����2 �θ������ ȣ���� �� �̿���
		// ������ ó�� ���� �˾ƺ���
		//new B();
		new BB(); //�ڽİ�ü�� �����ϸ� �θ�����ڸ� ���� ȣ���ϰ� �ڽ� �����ڰ� ȣ���
	}

}

class B{
	public B() {
		System.out.println("BŬ������ �⺻������");
	}
	//����� �����ڸ� ���α׷��Ӱ� �ۼ����ָ� �⺻�����ڴ� �ڵ����� ���ܳ��� �ʴ´�.
	//�׷��Ƿ� ��Ӱ����� �� �θ�����ڴ� �⺻�����ڸ� �ۼ��� �ִ� ��
	B(String n, int t){
		System.out.println("BŬ������ �����������");
	}
}

class BB extends B{
	public BB() {
		//�θ��� �⺻������ ȣ��
		//super(); //������ ����
		//�θ��� �⺻�����ڰ� �ƴ϶� ����� �����ڸ� ȣ���ϰ� ���� �� *ù�ٸ�
		//super("kk", 10); //�����Ͻ� �⺻������ ȣ��, Ÿ�� ������ �ش� ����������� ȣ�� *ù�ٸ�
		System.out.println("BBŬ������ �⺻������");
		
	}
	BB(int t, boolean e){
		System.out.println("BBŬ������ �����������");
	}
}