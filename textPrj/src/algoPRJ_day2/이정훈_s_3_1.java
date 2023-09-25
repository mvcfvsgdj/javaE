package algoPRJ_day2;

public class 이정훈_s_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a, b;
		a = b = 1;
		int n = 2;
		final int MAX = 50;
		System.out.println(a + " " + b);

		while (n < MAX) {
			b = a + b;
			a = b - a;
			n = n + 1;
			System.out.println(b);

		}

	}

}
