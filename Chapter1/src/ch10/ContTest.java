package ch10;

public class ContTest {
	public static void main(String[] args) {
		/*
		 * ������ �ʴ� ����� ���ͷ�, ������ �� ��ȯ
		 * ����� ������ �ʴ� ��
		 * final ���� ����Ͽ� ����
		 * 
		 */
		
		final int MAX_NUM = 100; // ���߿� �ٲܼ� ����
		final int MIN_NUM;		 // ����� �빮�ڷ� ǥ��
		
		MIN_NUM = 10;
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		/*
		 * ���ͷ�(Literal) : ���α׷����� ����ϴ� ����, ����, ������ ����
		 * ���ͷ��� ��� Ǯ(constant pool)�� ����
		 * ���� ���ͷ��� int, �Ǽ� ���ͷ��� double�� �����
		 */
		
		/*
		 * �� ��ȯ(type conversion)
		 * ���� �ٸ� �ڷ��� ���� ������� ������ ���� �ϳ��� �ڷ������� �����ϴ� ��
		 * ������ �� ��ȯ(�ڵ� �� ��ȯ), ����� �� ��ȯ(���� �� ��ȯ)�� ����
		 * ����Ʈ ũ�Ⱑ ���� �ڷ������� ū �ڷ��� : �ڵ�
		 * �� ������ �ڷ������� �� ������ �ڷ��� : �ڵ�
		 */
		
		byte bNum = 125;
		int iNum = bNum;
		
		System.out.println(iNum);
		
		int test = 255;
		byte bTest = (byte) test;
		
		System.out.println(bTest);
		
		double dNum = 3.14;
		int iTest = (int) dNum;
		
		System.out.println(iTest);
		
		/*
		 * ���� TEST
		 */
		
		double dTest = 1.2;
		float fTest = 0.9F;
		
		int iNum1 = (int)dTest + (int)fTest;
		int iNum2 = (int)(dTest + fTest);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
