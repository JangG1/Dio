package p220;

public class EnumEx {

	public static void main(String[] args) {
		//다른 정보가 들어가면 오류가 나는게 열거형
		Word wd=null;
		System.out.println(wd.커피);
		//System.out.println(wd.학교); 없는 정보라 오류

	}

}

enum Word{
	커피, 빵, 공책, 핸드폰;
}