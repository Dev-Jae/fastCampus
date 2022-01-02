package ch13;

import java.util.Scanner;

public class ConitionTest {
	public static void main(String[] args) {
		/*
		 * 조건 연산자 : 삼항 연산자
		 * 조건식의 결과가 true인 경우와 false인 경우에 따라 다른 결과가 수행됨
		 * 조건식 ? 결과1 : 결과2;
		 * ex) int num = (5>3) ? 10 : 20;
		 */
		
		int max;
		System.out.println("두 수를 입력 받아서 더 큰 수를 출력하세요\n");
		// 입력 받는 함수 Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 1 : ");
		int num1 = sc.nextInt();	// 정수를 입력 받음
		System.out.println("입력 2 : ");
		int num2 = sc.nextInt();	// 정수를 입력 받음
		
		max = (num1 > num2) ? num1 : num2;
		System.out.println(max);
	}
}
