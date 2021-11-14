package ep1319_01;

public class ShopServiceExample {

	public static void main(String[] args) {
		// 1319 page 싱글톤 실습
		ShopService obj1=ShopService.getInstance();
        ShopService obj2=ShopService.getInstance();
        if(obj1 == obj2) 
            System.out.println("같은 객체");
        else
            System.out.println("다른 객체");

	}

}

class ShopService{
	//싱글톤 만들기 1단계
	private static ShopService ss = new ShopService();
	//2단계 기본생성자 만들기
	private ShopService(){ }
	//3단계  getInstance() 메소드 선언하고 ss주소를 리턴한다
	static ShopService getInstance() {
		return ss;
	}
}