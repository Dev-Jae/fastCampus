package ch09;

public class BoolTest {
	public static void main(String[] args) {
		/*
		 * ������ �ڷ���
		 * ���� : true, false �� ������ ��Ÿ��
		 * 1����Ʈ�� ��� ��
		 * ���� �����ϴ���, �迭�� �������, ����� ������ ������������ ǥ��
		 * boolean test = true;
		 */
		
		boolean test = true;
		System.out.println(test);
		
		/*
		 * ���� ���� �ڷ��� ���� ����ϱ� (�ڹ� 10 ���� ���� ��)
		 * �߷� ������ ������ ���� �ڷ����� �������� ����
		 * �ѹ� �����Ͽ� �߷� �� ������ �ٸ� Ÿ���� ���� ���� �� �� ����
		 * ���� ������ ��� ����
		 */
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";
		//str = 3; �̰� �ȵ�
		System.out.println(str);
		
		var str2 = str;
		
		System.out.println(str2);
		
		
	}
}
