package ep1319;

public class MemberMainEx {

	public static void main(String[] args) {
		// ��üȭ, �ν��Ͻ�ȭ ���޸𸮿� �ø���
		Member user1 = new Member("ȫ�浿", "hong");
		Member user2 = new Member("���ڹ�", "java");
		//MemberServiceŬ������ login()ȣ���ϱ�
		//��üȭ�ϰ� ȣ���ϱ�
		MemberService ms = new MemberService(); //��äȭ
		System.out.println(ms.login(user1.id, user1.password)); //ȣ��
		ms.logout(user1.id);
	}

}

class Member{
	String name;
	String id;
	String password="12345";
	int age;
	
	Member(String name, String id){
		this.name=name;
		this.id=id;
	}
}

class MemberService{
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345"))
			return true;
		else return false;
	}
	// ms.logout(user1.id); ȣ��
	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}