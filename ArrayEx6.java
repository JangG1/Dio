package p197;

public class ArrayEx6 {
     //�迭 �ǽ�����5
	public static void main(String[] args) {
		/*if(args.length != 2) {
		System.out.println("���α׷��� ����");
		System.out.println("java MainStringArrayArgument num1 num2");
		System.exit(0);
	 	}
		String strNum1 = args[0]; // "100" => Run Configurations -> Arguments
		String strNum2 = args[1]; //  "90"
		//"100" --> 100   �Ľ� : ��ȯ�Ѵ�
		int num1 = Integer.parseInt(strNum1); //"a" --> ������ ��ȯ�ض�
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);*/
		
	 //�迭 �ǽ�����9
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		//ī��                             �迭�� ī��   0���� 	~���ٰ�     0�� ��ġ����        n��,���̸�ŭ
		//oldStrArray �迭�� 0�� �ε������� newStrArray �迭�� 0�� �ε��� ��ġ����
		//oldStrArray.length ���̸�ŭ �����ϱ�
		for(int i=0; i<newStrArray.length; i++) {
		System.out.print(newStrArray[i] + " ");
			}
		//oldStrArray �迭�� array 3���ڸ��� �߰��ϱ�
		System.out.println();
		System.arraycopy( oldStrArray, 1, newStrArray, 3, 1);
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " ");
				}
		System.out.println();
		for(String a : newStrArray) { 
        //���� for��	for(�ڷ��� ������ : ����(�迭, �÷���, ����) ������ �־ ���̸� �ݺ��� ����
			System.out.print(a + "  ");
		}
			}
	} 


	
 

