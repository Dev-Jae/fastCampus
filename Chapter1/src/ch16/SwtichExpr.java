package ch16;

import java.util.Scanner;

public class SwtichExpr {
	public static void main(String[] args) {
		/*
		 * Java 14 ���� ���� �Ǵ� Switch Expression
		 * �����ϰ� ��ǥ�� ���� ����
		 * ������ ǥ�� �Ͽ� ��ȯ ���� ���� �� ����. ���� ���� ���� ���� ������ ����
		 * yield Ű���� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();
		
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31;
			}
			case 2->{
				yield 28;
			}
			case 4, 6, 9, 11 ->{
				yield 30;
			}
			default ->{
				System.out.println("�������� �ʴ� ���Դϴ�.");
				yield -1;	// yield ��ȯ���� �� �� ���
			}
		};
		
		System.out.println(month + "���� " + day + "�� �Դϴ�.");
	}
}
