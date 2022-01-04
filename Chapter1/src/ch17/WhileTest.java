package ch17;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 * 반목문 - while문
		 * 주어진 조건에 맞는 동안 지정된 수행문을 반복적으로 수행하는 제어문
		 * 조건이 맞지 않으면 반복하던 수행을 멈추게 됨
		 * 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false 판단 됨
		 * 예) 달리는 자동차, 일정 횟수 만큼 돌아가는 나사못
		 * 
		 * while(조건식){
		 * 	수행문1;
		 * } // 조건식이 참인 동안 반복 수행
		 *  수행문2;
		 */
		
		int num = 1;
		int sum = 0;	// 지역변수는 자동으로 초기화 되지 않으므로 초기화 시켜줘야 함 
		
		while( num <= 10 ) {
			sum += num;
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}

}
