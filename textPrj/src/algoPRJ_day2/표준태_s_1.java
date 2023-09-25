package algoPRJ_day2;

public class 표준태_s_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수선언

		double hp = 2500000; // h 시 인구
		double hu = 0.036; // h 시 증가율
		double hup = 0; // h시 증가인구

		double kp = 1800000; // k 시인구
		double ku = 0.042; // k 시 증가율
		double kup = 0; // k시 증가인구

		int y = 1999; // 기준연도
		int c = 0; //
		int sum; // 출력변수 ( k시가 h시 인구를 초과하는 년도)

		while (kp <= hp) {
			hup = hp * hu;
			hp = hp + hup;

			kup = kp * ku;
			kp = kp + kup;

			c = c + 1;

			System.out.println("h시" + hp);
			System.out.println("k시" + kp);
		}
		sum = y + c;
		System.out.println("초과하는년도" + sum);

	}

}
