package ch08;

public class CharTest {
	public static void main(String[] args) {
		/*
		 * ���ڵ� ������ ǥ��
		 * A�� 65 
		 * ���ڼ�Ʈ : �� ���ڸ� ����� ǥ���� ������ �ڵ� ���� ��Ƶ� ���� ���ڼ�Ʈ��� ��
		 * UNICODE : utf-8, utf-16
		 * �ڹٴ� ���ڸ� ��Ÿ���� ���� UNICODE�� ���
		 * utf-16 ���ڵ��� ���(��� ���ڸ� 2����Ʈ�� ǥ��)
		 * ���ڸ� ���� ������ Ÿ�� char ch = 'A';
		 * ���������� ���ڷ� ǥ���ǹǷ� ���ڸ� �־ ���ڰ� ��µ� �� ����
		 */
		
		char ch1 = 66;
		char ch2 = 'B';
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(ch2);
		System.out.println((char)ch2);
		
		int ch3 = 67;
		
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		char han = '��';
		char han2 = '\uD55C';	// �����ڵ� ������ ��
		
		System.out.println(han);
		System.out.println(han2);
	}
}
