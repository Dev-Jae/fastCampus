package ch14;

import java.util.Scanner;

public class IfElseTest {

	public static void main(String[] args) {
		/*
		 * ���ǹ� : �־��� ���ǿ� ���� �ٸ� ������ �̷�� ������ ����
		 * if��, if ~ else ��, if ~ else if ~ else��
		 * if���� ���ǽ��� '��'�� ��쿡(���ǿ� �´� ���) ���๮�� �����
		 * 
		 */
				
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		if(age >= 8) {
			System.out.println("�б��� �ٴմϴ�.");
		} else {
			System.out.println("�б��� �ٴ��� �ʽ��ϴ�.");
		}
		
		System.out.println("��°� ���� ����");
	}

}
