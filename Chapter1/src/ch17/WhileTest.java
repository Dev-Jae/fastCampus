package ch17;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * �ݸ� - while��
		 * �־��� ���ǿ� �´� ���� ������ ���๮�� �ݺ������� �����ϴ� ���
		 * ������ ���� ������ �ݺ��ϴ� ������ ���߰� ��
		 * ������ �ַ� �ݺ� Ƚ���� ���� ���� ����� ���� true, false �Ǵ� ��
		 * ��) �޸��� �ڵ���, ���� Ƚ�� ��ŭ ���ư��� �����
		 * 
		 * while(���ǽ�){
		 * 	���๮1;
		 * } // ���ǽ��� ���� ���� �ݺ� ����
		 *  ���๮2;
		 */
		
		int num = 1;
		int sum = 0;	// ���������� �ڵ����� �ʱ�ȭ ���� �����Ƿ� �ʱ�ȭ ������� �� 
		
		while( num <= 10 ) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
