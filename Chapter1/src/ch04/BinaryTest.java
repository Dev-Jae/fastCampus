package ch04;

public class BinaryTest {

	public static void main(String[] args) {
		// ��ǻ�Ϳ��� �ڷ� ǥ�� : 2����
		// 0�� 1�θ� �����͸� ����
		// bit : ��ǻ�Ͱ� ǥ���ϴ� �������� �ʼ� ������ 2���� �ϳ��� ���� ������ �� �ִ� �޸��� ũ��
		// byte : 1byte = 8bit
		// 2����, 8����, 16���� -> ���� �����ϱ�(��Ʈ�� �ʱ�)
		// �� ���� ��Ʈ�� ��Ÿ�� �� �ִ� �� : 0, 1 (2��)
		// �� ���� ��Ʈ�� ��Ÿ�� �� �ִ� �� : 00, 01, 10, 11 (4��)
		// �� ���� ��Ʈ�� ��Ÿ�� �� �ִ� �� : 000, 001, 010, 011, 100, 101, 110, 111 (8��)
		// ���� ǥ���ϴ� �ڷ��� : int(integer)
		int num = 10;			// 10����
		int bNum = 0B1010;		// 2����(0B�� �տ� ���� �ڿ� ������ ���ڴ� 2����)
		int oNum = 012;			// 8����(0�� �տ� ���� 8����)
		int xNum = 0XA;			// 16����(OX�� �տ� ���� 16����)
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
	}

}