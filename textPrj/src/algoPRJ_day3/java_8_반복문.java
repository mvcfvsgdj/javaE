package algoPRJ_day3;

import java.util.Scanner;

public class java_8_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ㅎㅇ");
		System.out.println("ㅎㅇ");
		System.out.println("ㅎㅇ");
		System.out.println("ㅎㅇ");
		System.out.println("ㅎㅇ");
		/*for(초기식; 조건식; 증감식 ){
		반복해야할 코드작성
		}
		 */
		
	for(int i=1; i<=5; i++) { // i+=2
		System.out.println("ㅎㅇ");
	}
		
	Scanner sc = new Scanner(System.in);
	
	for(;;) {
			
		int su=sc.nextInt();
		if(su==0 )break;
		System.out.println(su + "계속");
	}
	
	System.out.println("끝");
	
	while(true) {
		int su = sc.nextInt();
		if(su==100) break;
		System.out.println(su+"ㄱㄱ");
	}
	
	
	
	
	
	}
	
	

}
