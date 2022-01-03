package ch15;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		/*
		 * 조건이 여러 개 일 때의 if문
		 * if ~ else if ~ else문
		 * 하나의 사오항에 대한 조건이 여러개로 나뉘고 각 조건에 다른 수행이 이루어져야 할 경우 사용
		 * 각 조건은 상호 배타적임
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		int charge;
		
		if( age < 8) {
			charge = 1000;
			System.out.println("미 취학 아동입니다.");
		} else if( age < 14 ) {
			charge = 2000;
			System.out.println("초등학생 입니다.");
		} else if( age < 20 ) {
			charge = 2500;
			System.out.println("중, 고등학생입니다.");
		} else {
			charge = 3000;
			System.out.println("성인 입니다.");
		}
		
		System.out.println("입장료는 " + charge + "원 입니다.");
		
		/*
		 * if ~ else if 를 사용하는 경우 하나의 조건이 만족이 되면 나머지 else if 부분은 수행되지 않음
		 * if ~ if로 사용하게 되면 각각 다른 조건을 해석되어 각각 수행하게 됨
		 * 위의 예제를 if ~ if로 하게 되면 조건에 해당되는 모든 조건을 수행함
		 */
	}

}
