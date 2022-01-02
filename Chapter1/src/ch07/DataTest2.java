package ch07;

public class DataTest2 {
	public static void main(String[] args) { 
		/*
		 * 부동 소수점방식
		 * 실수는 정수보다 정밀하기 때문에 정수와는 다른 방식으로 표현해야 함
		 * 부동 소수점 방식으로 실수 값 0.1 표현
		 * 지수부와 가수부로 표현
		 * 자바에서 실수의 기본 타입은 double를 사용 함
		 */
		double dnum = 3.14;	// double은 8바이트
		float fnum = 3.14f;	// float는 뒤에 f를 붙여줘야 함, 4바이트
		
		System.out.println(dnum);
		System.out.println(fnum);
		
		/*
		 * 지수와 가수로 나타내는 부동 소수점 방식에는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다.
		 */
		
		double test = 1;
		
		for(int i = 0; i<10000; i++) {
			test = test + 0.1;
			
		}
		
		System.out.println(test);
	}
}
