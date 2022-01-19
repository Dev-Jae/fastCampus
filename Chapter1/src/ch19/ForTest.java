package ch19;

public class ForTest {
	public static void main(String[] args) {
		/*
		 * 반복문 for문
		 * for (초기화식; 조건식; 증감식){
		 * 		수행문;
		 * }
		 */
		/*
		int num;
		for (num = 1; num <= 5; num++) {
			System.out.println(num);
		}
		*/
		
		int count = 1;
		int sum = 0;
		
		for(int i = 0; i < 10; i++, count++) {
			
			sum += count;
		}
		
		System.out.println("sum : " + sum);
		
		int num = 1;
		int total = 0;
		
		while ( num <= 10) {
			total += num;
			num++;
		}
		
		System.out.println("total : " + total);
		
		/*
		 * while문 : 조건인 참인 동안 수행
		 * 			조건이 맞지 않으면 수행되는 부분이 없음
		 * > 조건식의 결과나 변수가 true, false 값인 경우 주로 사용
		 * 
		 * do-while문 : 조건이 참인 동안 반복 수행
		 * 				수행문을 먼저 수행하고 조건 체크
		 * > 조건식의 결과나 변수가 true, false 값인 경우 주로 사용
		 * 
		 * for문 : 초기화, 조건체크, 증감 순으로 수행
		 * > 특정 수의 범위, 횟수와 관련하여 반복되는 경우 주로 사용, 배열과 함께 많이 사용됨
		 * 
		 */
	}
}
