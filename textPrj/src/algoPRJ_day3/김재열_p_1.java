package algoPRJ_day3;

public class 김재열_p_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double hp = 2500000;
		double kp = 1800000;
		double hr = 0.036;
		double kr = 0.042;
		int y = 1999;

		while (true) {
			y++;
			hp = hp * (1 + hr);
			kp = kp * (1 + kr);
			if (hp < kp)
				break;

		}
		System.out.println(y);
	}

}
