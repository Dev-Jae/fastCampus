package ch07;

public class DataTest2 {
	public static void main(String[] args) { 
		/*
		 * �ε� �Ҽ������
		 * �Ǽ��� �������� �����ϱ� ������ �����ʹ� �ٸ� ������� ǥ���ؾ� ��
		 * �ε� �Ҽ��� ������� �Ǽ� �� 0.1 ǥ��
		 * �����ο� �����η� ǥ��
		 * �ڹٿ��� �Ǽ��� �⺻ Ÿ���� double�� ��� ��
		 */
		double dnum = 3.14;	// double�� 8����Ʈ
		float fnum = 3.14f;	// float�� �ڿ� f�� �ٿ���� ��, 4����Ʈ
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		/*
		 * ������ ������ ��Ÿ���� �ε� �Ҽ��� ��Ŀ��� �����ΰ� 0�� ǥ���� �� ���� ������ �ణ�� ������ �߻��� �� �ִ�.
		 */
		
		double test = 1;
		
		for(int i = 0; i<10000; i++) {
			test = test + 0.1;
			
		}
		
		System.out.println(test);
	}
}
