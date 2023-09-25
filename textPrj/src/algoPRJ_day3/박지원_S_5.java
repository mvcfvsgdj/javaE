package algoPRJ_day3;

public class 박지원_S_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//등비수열 각항에 3*씩 적용 
		
		
		
		int sum =0 ; //항의 누적을 구할변수
		int n=0; //반복제어 변수 ,항의순번
		int a=2; //항을 구할변수
		int b=3; //공통된 비 
		
		
		while(n<7) {
			sum+=a;
			a=a*b;
			n++;
			
		}
		System.out.println(sum);
	}

}
