package algoPRJ_day3;

public class 김민규_s_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double ha = 2500000;
		double ka = 1800000;
		int y = 1999;
		final double Alpha = 1.036;
		final double Beta = 1.042;

		while (ha > ka) {
			y++;
			ha = ha * Alpha;
			ka = ka * Beta;

		}
		System.out.println(y);
	}

}
