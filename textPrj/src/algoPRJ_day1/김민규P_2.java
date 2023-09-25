package algoPRJ_day1;

public class 김민규P_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수선언
		
		// n
		//sum
		//int : 자료형 <- 변수선언용 정수값
		
		int n=0;
		int sum=0;
		
		
		
		while( n<100) { // 100미만일때
			n=n+1;
			sum=sum+ n*(101-n);
			
		}
		
		System.out.println(sum);
		
		
	}

}
