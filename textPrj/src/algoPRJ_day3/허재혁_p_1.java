package algoPRJ_day3;

public class 허재혁_p_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 1999;
		double h = 2500000;
		double k = 1800000;
		double a, b;
		// a = h시 증가율 b = k 시증가율;

		while (h > k) {
			year++;
			a = h * 0.036;
			b = k * 0.042;
			//인구수 갱신
			h = h + a;
			k = k + b;

		}
		System.out.println(year);
	}

}
