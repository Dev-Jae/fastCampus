package ch12;

public class trueFalseTest {
	public static void main(String[] args) {
		/*
		 * 관계, 논리 연산자
		 * 
		 * 관계 연산자 : 이항 연산자
		 * 연산의 결과가 true(참) false(거짓)으로 반환 됨, 비교연산자 라고도 함
		 * 조건문, 반복문의 조건식으로 자주 사용
		 * 
		 * 논리 연산자 : 관계 연산자와 혼합하여 많이 사용 됨
		 * 연산의 결과가 true(참), false(거짓)으로 반환 됨
		 * &&(논리 곱) : 둘 다 참인 경우 true
		 * ||(논리 합) : 둘 중 하나라도 참인 경우 true
		 * !(부정) : 부정(반대)
		 * 
		 * 논리 연산에서 모든 항이 실행되지 않는 경우 : 단락 회로 평가
		 * 논리 곱(&&)은 두 항의 결과가 모두 true일 때만 true
		 * - 앞의 항의 결과가 false이면 뒤 항의 결과를 평가하지 않음
		 * 
		 * 논리 합(||)은 두 항의 결과가 모두 false일 때만 결과가 false
		 * - 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
		 */
		
		// 단락 회로 평가 예제
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 += 10) < 10 ) && ( (i += 2) < 10);
		
		System.out.println(value);	// 앞의 항이 false이기 때문에 뒤의 항이 수행되지 않음
		System.out.println(num1);
		System.out.println(i);
	}
}
