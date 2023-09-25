package algoPRJ_day2;

import java.util.Scanner;

public class 허재화_p_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력변수

		int num;

		// 출력변수
		int pos = 0;
		int neg = 0;
		int posEven = 0;
		int posOdd = 0;
		final int MAX = 5;
		// 처리변수
		int count = 0;

		Scanner sc = new Scanner(System.in);

		while (count < MAX) {

			count++; // count = count+1
			num = sc.nextInt();

			if (num > 0) {
				pos++;
				if (num % 2 == 0) {
					posEven++;

				} else {
					posOdd++;

				}
			} else {
				neg++;

			}

		}
		System.out.println("양수수" + pos);
		System.out.println("음수수" + neg);
		System.out.println("양수수짝수수" + posEven);
		System.out.println("양수수음수수" + posOdd);
	}

}
