package ch13;

import java.util.Scanner;

public class ConitionTest {
	public static void main(String[] args) {
		/*
		 * ���� ������ : ���� ������
		 * ���ǽ��� ����� true�� ���� false�� ��쿡 ���� �ٸ� ����� �����
		 * ���ǽ� ? ���1 : ���2;
		 * ex) int num = (5>3) ? 10 : 20;
		 */
		
		int max;
		System.out.println("�� ���� �Է� �޾Ƽ� �� ū ���� ����ϼ���\n");
		// �Է� �޴� �Լ� Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է� 1 : ");
		int num1 = sc.nextInt();	// ������ �Է� ����
		System.out.println("�Է� 2 : ");
		int num2 = sc.nextInt();	// ������ �Է� ����
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}
}
