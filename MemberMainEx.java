package ep1319;

public class MemberMainEx {

	public static void main(String[] args) {
		// 객체화, 인스턴스화 힙메모리에 올리기
		Member user1 = new Member("홍길동", "hong");
		Member user2 = new Member("김자바", "java");
		//MemberService클래스의 login()호출하기
		//객체화하고 호출하기
		MemberService ms = new MemberService(); //객채화
		System.out.println(ms.login(user1.id, user1.password)); //호출
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
	// ms.logout(user1.id); 호출
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}