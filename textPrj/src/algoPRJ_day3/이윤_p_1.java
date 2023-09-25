package algoPRJ_day3;

public class 이윤_p_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 2 3 4 5 6
		// 1+3+5+7+9+11 ...99 합

		int sum =0;
		int n=1;
		final int MAX =99;
		
		while(n<=MAX) {
			sum+=n;
			n+=2;
			
		}
		System.out.println(sum);
		
		
		
	}

}
