package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/*
		 * do - while �� : ���ǰ� ��� ���� �ѹ��� ���๮�� ����
		 * 
		 * do {
		 * 	���๮1;
		 * } while(���ǽ�);
		 * 	���๮2;
		 */
		
		Scanner sc = new Scanner(System.in);
		int input;
		int sum = 0;
		
 		do{
			input = sc.nextInt();
			sum += input;
		} while( input != 0 );
		
		System.out.println(sum);
	}

}
