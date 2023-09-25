package algoPRJ_day2;

import java.util.Scanner;

public class 김현수_s_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력자료
		String name;
		int kor, eng, math;

		// 출력자료
		double avg;
		double avg_kor, avg_eng, avg_math;

		// 처리자료
		int n = 1; // 반복제어변수
		int sm_kor = 0, sm_eng = 0, sm_math = 0;

		final int MAX = 3; // 상수화변수

		Scanner sc = new Scanner(System.in);

		while (n <= MAX) {
			// 입력
			name = sc.next();
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();

			sm_kor = sm_kor + kor;
			sm_eng = sm_eng + eng;
			sm_math = sm_math + math;

			avg = (kor + eng + math) / 3.0;

			if (avg >= 90) {
				System.out.println("Excellent");

			} else if (avg < 60) {
				System.out.println("Fail");
			}

			System.out.println(name + " " + kor + " " + eng + " " + math);

			n = n + 1;

		}
		// 과목별 평균구하기

		avg_kor = (double) sm_kor / MAX;
		avg_eng = (double) sm_eng / MAX;
		avg_math = (double) sm_math / MAX;

		//
		System.out.println("국어평균균" + avg_kor);
		System.out.println("영어평균균" + avg_eng);
		System.out.println("수학평균균" + avg_math);

	}

}
