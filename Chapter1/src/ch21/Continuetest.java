package ch21;

public class Continuetest {

	public static void main(String[] args) {
		/*
		 * Continue문
		 * 반복문 내부에서 조건문(if)와 같이 사용하며, 조건이 맞는 경우(true이면) 반복문 블럭 내부의 다른 수행문들을 수행하지 않음
		 */
		
		// 1 ~ 100 까지 중 3의 배수 출력
		int num;
		for( num = 1; num <= 100; num++) {
			if( (num % 3) != 0 ) {
				continue;
			}
			
			System.out.println("num : " + num);
		}
	}
}
