package algoPRJ_day3;

import java.util.Scanner;

public class 김민지_p_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 수 ->
		// 입력 -> 출력 (양수의 개수 , 음수의개수 , 양수짝수의 개수 , 양수중 홀수개수 )
		// 5 -> 1 1
		// -4 -> 1
		// 8 -> 1 1
		// 3 -> 1 1

		int positive = 0;
		int negative = 0;
		int odd = 0;
		int even = 0;
		int i = 0; // 반복변수
		int n; // 입력변수
		final int MAX = 5;

		Scanner sc = new Scanner(System.in);

		while (i <= MAX) {

			System.out.print("수입력");
			n = sc.nextInt();
			if (n > 0) {
				positive++;
				if (positive % 2 == 0) { // 짝수
					even++;
				} else {
					odd++;
				}
			} else {
				negative++;
			}
			i++;
		}
		System.out.println("양수" + positive);
		System.out.println("양수" + positive);
		System.out.println("양수" + positive);
	}
}
