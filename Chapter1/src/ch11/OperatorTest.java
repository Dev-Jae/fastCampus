package ch11;

public class OperatorTest {

	public static void main(String[] args) {
		/*
		 * 자바의 연산자
		 * 
		 * 대입 연산자 : 변수에 다른 변수나 값을 대입하는 연산자
		 * 이항 연산자 중 우선 순위가 가장 낮은 연산자들
		 * 왼쪽 변수 = 오른쪽 변수(또는 식, 값)
		 *
		 * 부호 연산자 : 단항 연산자
		 * 변수의 부호를 유지 하거나(+) 바꿈(-)
		 * 실제 변수의 부호가 변하려면 대입 연산자를 사용해야 함
		 * 
		 * 산술 연산자 : 사칙 연산자(+, -, *, /, %)
		 * 나머지 연산자(%)가 자주 쓰임
		 * 
		 * 복합 대입 연산자 : 대입 연산자와 다른 연산자가 함께 쓰임(+=, -=, *= 등)
		 * 
		 * 증가, 감소 연산자 : 단항 연산자
		 * 변수의 값을 1 더하거나 뺄때 사용
		 * 연산자가 항의 앞에 있는가 뒤에 있는가에 따라 연산 시점과 결과가 달라짐
		 * 문장의 끝을 기준으로 연산 시점을 생각해야 함
		 * ++, --
		 * 
		 */
		
		// 복합 대입 연산자
		int myNum = 10;
		int yourNum = 20;
		
		myNum += yourNum;
		System.out.println(myNum);
		
		// 증가, 감소 연산자
		int gameScore = 150;
		
		int lastScore = gameScore--;	// gameScore += 1;
		
		System.out.println(lastScore);
		System.out.println(gameScore);
	}

}
