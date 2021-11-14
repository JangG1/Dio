package ep1319_01;

public class ShopServiceExample {

	public static void main(String[] args) {
		// 1319 page �̱��� �ǽ�
		ShopService obj1=ShopService.getInstance();
        ShopService obj2=ShopService.getInstance();
        if(obj1 == obj2) 
            System.out.println("���� ��ü");
        else
            System.out.println("�ٸ� ��ü");

	}

}

class ShopService{
	//�̱��� ����� 1�ܰ�
	private static ShopService ss = new ShopService();
	//2�ܰ� �⺻������ �����
	private ShopService(){ }
	//3�ܰ�  getInstance() �޼ҵ� �����ϰ� ss�ּҸ� �����Ѵ�
	static ShopService getInstance() {
		return ss;
	}
}