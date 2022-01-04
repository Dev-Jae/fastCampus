package ch18;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		/*
		 * do - while 문 : 조건과 상관 없이 한번은 수행문을 수행
		 * 
		 * do {
		 * 	수행문1;
		 * } while(조건식);
		 * 	수행문2;
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
