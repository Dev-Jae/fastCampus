package ch21;

public class Continuetest {

	public static void main(String[] args) {
		/*
		 * Continue��
		 * �ݺ��� ���ο��� ���ǹ�(if)�� ���� ����ϸ�, ������ �´� ���(true�̸�) �ݺ��� �� ������ �ٸ� ���๮���� �������� ����
		 */
		
		// 1 ~ 100 ���� �� 3�� ��� ���
		int num;
		for( num = 1; num <= 100; num++) {
			if( (num % 3) != 0 ) {
				continue;
			}
			
			System.out.println("num : " + num);
		}
	}
}
