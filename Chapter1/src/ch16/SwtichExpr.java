package ch16;

import java.util.Scanner;

public class SwtichExpr {
	public static void main(String[] args) {
		/*
		 * Java 14 부터 지원 되는 Switch Expression
		 * 간단하게 쉼표로 조건 구분
		 * 식으로 표현 하여 반환 값을 받을 수 있음. 리턴 값이 없는 경우는 오류가 생김
		 * yield 키워드 사용
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
		
		
		int day = switch(month) {
		
			case 1, 3, 5, 7, 8, 10, 12 -> {
				yield 31;
			}
			case 2->{
				yield 28;
			}
			case 4, 6, 9, 11 ->{
				yield 30;
			}
			default ->{
				System.out.println("존재하지 않는 달입니다.");
				yield -1;	// yield 반환값을 줄 때 사용
			}
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");
	}
}
