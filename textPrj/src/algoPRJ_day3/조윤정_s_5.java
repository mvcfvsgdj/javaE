package algoPRJ_day3;

public class 조윤정_s_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int n = 2;
		int i = 1;
		
		System.out.print(n+ ",");
		
		while (i <= 7) {
			sum += n;
			n= n*3;
		System.out.print(n + ",");
			i++;
			
		}
		System.out.println("\n sum="+sum);

	}

}
