package ch12;

public class trueFalseTest {
	public static void main(String[] args) {
		/*
		 * ����, ���� ������
		 * 
		 * ���� ������ : ���� ������
		 * ������ ����� true(��) false(����)���� ��ȯ ��, �񱳿����� ����� ��
		 * ���ǹ�, �ݺ����� ���ǽ����� ���� ���
		 * 
		 * ���� ������ : ���� �����ڿ� ȥ���Ͽ� ���� ��� ��
		 * ������ ����� true(��), false(����)���� ��ȯ ��
		 * &&(���� ��) : �� �� ���� ��� true
		 * ||(���� ��) : �� �� �ϳ��� ���� ��� true
		 * !(����) : ����(�ݴ�)
		 * 
		 * ���� ���꿡�� ��� ���� ������� �ʴ� ��� : �ܶ� ȸ�� ��
		 * ���� ��(&&)�� �� ���� ����� ��� true�� ���� true
		 * - ���� ���� ����� false�̸� �� ���� ����� ������ ����
		 * 
		 * ���� ��(||)�� �� ���� ����� ��� false�� ���� ����� false
		 * - ���� ���� ����� true�̸� �� ���� ����� ������ ����
		 */
		
		// �ܶ� ȸ�� �� ����
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 += 10) < 10 ) && ( (i += 2) < 10);
		
		System.out.println(value);	// ���� ���� false�̱� ������ ���� ���� ������� ����
		System.out.println(num1);
		System.out.println(i);
	}
}