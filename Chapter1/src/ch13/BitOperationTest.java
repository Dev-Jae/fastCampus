package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		/*
		 * ��Ʈ ������ : ���Կ����ڿ� �ٸ� �����ڰ� �Բ� ����
		 * ����ũ : Ư�� ��Ʈ�� ������ �� ���� ���� ����� ��
		 * ��Ʈ�ѱ� : Ư�� ��Ʈ�鸸�� 1�� �����ؼ� ����ϰ� ���� ��
		 * ��Ʈ���� : Ư�� ��Ʈ�鸸�� 0���� �����ؼ� ����ϰ� ���� ��
		 * ��Ʈ ��� : ��� ��Ʈ���� 0�� 1��, 1�� 0���� �ٲٰ� ���� ��
		 */
		
		int num1 = 5;  	// 00000101
		int num2 = 10; 	// 00001010
				
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		System.out.println(~num1);
		
		System.out.println(num1 << 2);
		System.out.println(num1);
		System.out.println(num1 <<= 2);
		System.out.println(num1);
		
		/*
		 * ������ �켱����
		 */
	}

}
