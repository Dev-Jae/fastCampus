package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {
		/*
		 * if ~ else if ~ else 문을 사용할 때 복잡하고 번거로운 부분을 가독성 좋게 구현
		 * 비교 조건이 특정 값이나 문자열인 경우 사용
		 * break 문을 사용하여 각 조건이 만족되면 switch 블럭을 빠져나오도록 함
		 * 자바 14부터 좀 더 간결해진 표현식이 지원 됨(break 사용하지 않음)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		int day;
		
		switch(month) {
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : 
				day = 31;
				break;
			case 2 : 
				day = 28;
				break;
			case 4 : case 6 : case 9 : case 11 : 
				day = 30;
				break;		
			default : 
				System.out.println("존재하지 않는 달입니다.");
				day = -1;
				break;				
		}
		
		System.out.println(month + "월은 " + day + "일 입니다.");
	}

	/*
	 * Java 14 부터 지원 되는 Switch Expression
	 * 간단하게 쉼표로 조건 구분
	 * 식으로 표현 하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류가 생김
	 * yield 키워드 사용
	 */
}
