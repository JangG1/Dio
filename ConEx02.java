package p293;

public class ConEx02 {

	public static void main(String[] args) {
		// ������ ����
		A a = new A("����");
		A a1 = new A("�����", 10);
		A a2 = new A(true);
		A a3 = new A(new B());
		System.out.println(a.kind);
		System.out.println(a1.kind+" "+a1.count);
		System.out.println(a2.ok);
		System.out.println(a3.b);
	}
	
}

class A{
	//�ɹ����� �����ϱ�
	String kind;
	int count;
	boolean ok;
	B b;
	
	A(String kind){ //������ �޾Ƽ� String kind; ������ �ֱ�
		this.kind = kind;
	}
	A(String kind, int c){
		this.kind=kind;
		count=c;
	}
	A(boolean ok){
		this.ok=ok;
	}
	//B b = new B()
	A(B b){
		this.b=b;
	}
}

class B{
	
}