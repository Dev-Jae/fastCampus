package ch19;

public class ForTest {
	public static void main(String[] args) {
		/*
		 * �ݺ��� for��
		 * for (�ʱ�ȭ��; ���ǽ�; ������){
		 * 		���๮;
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
		 * while�� : ������ ���� ���� ����
		 * 			������ ���� ������ ����Ǵ� �κ��� ����
		 * > ���ǽ��� ����� ������ true, false ���� ��� �ַ� ���
		 * 
		 * do-while�� : ������ ���� ���� �ݺ� ����
		 * 				���๮�� ���� �����ϰ� ���� üũ
		 * > ���ǽ��� ����� ������ true, false ���� ��� �ַ� ���
		 * 
		 * for�� : �ʱ�ȭ, ����üũ, ���� ������ ����
		 * > Ư�� ���� ����, Ƚ���� �����Ͽ� �ݺ��Ǵ� ��� �ַ� ���, �迭�� �Բ� ���� ����
		 * 
		 */
	}
}
