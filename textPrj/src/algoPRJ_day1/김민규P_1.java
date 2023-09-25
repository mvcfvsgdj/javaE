package algoPRJ_day1;

public class 김민규P_1 {

	public static void main(String[] args) {
		
		
		int sum=0;
		
		for(int n=1; n<=100; n++) {  //초기식; 조건식; 증감식
			sum = sum + n*(101-n);
		}
	System.out.println(sum);
	
	
	}

}
