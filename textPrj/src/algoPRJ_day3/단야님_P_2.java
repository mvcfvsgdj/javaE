package algoPRJ_day3;

public class 단야님_P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;// 누적합

		// 처리
		int jsum = 0; // 항을 구할변수

		final int MAX = 100;

		int i = 1; // 반복을제어한 변수

		// i = 1 2 3 4 5 6 7 8 9 ... 100
		// j = 0 1 2 3 4 5 6 7 8 ... 99
		/// 1+(1+2)+(1+2+3)+(1+2+3+4)...
		// 1+ 3 6 10 ...
		while (i <= MAX) {

			jsum = jsum + i; // jsum=j;
			sum = sum + jsum;
			i++;
		}
		System.out.println(sum);

	}

}
