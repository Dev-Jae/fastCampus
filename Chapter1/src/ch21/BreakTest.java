package ch21;

public class BreakTest {

	public static void main(String[] args) {
		/*
		 * break��
		 * ���ΰ� �ִ� ����� ����� ���� ������ ���(switch�� ������ ���)
		 * �ݺ��������� �ַ� ���ǹ�(if)�� ���� ����Ͽ� ���ǿ� �ش�Ǵ� ��� �ݺ� ������ ���߰� �ݺ��� �ܺη� ������ �̵�
		 * ���� �ݺ����� ��ø�Ǿ� �ִ� ��쿣 break ���� ���ԵǾ� �ִ� �ݺ����� ���� ����
		 */
		
		int sum = 0;
		int num;
		
		for(num = 1; sum <= 100; num++) {
			sum += num;
		}
		System.out.println("sum : " + sum);
		
		sum = 0;
		
		for(num = 1; ; num++) {
			sum += num;
			
			if(sum >= 100) {
				System.out.println("sum : " + sum);
				System.out.println("num : " + num);
				break;
			}
		}
	}

}
