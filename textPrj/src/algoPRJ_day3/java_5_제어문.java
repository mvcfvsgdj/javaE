package algoPRJ_day3;

public class java_5_제어문 {

	public static void main(String[] args) {

		
		//분기문 if,switch
		
		//if문 형식
		
		/*
		 * 
		 * if(조건식{
		 * }
		 * 
		 */
		
		
		/*
		 *  if(조건식){
		 *  }else {
		 *  }
		 * 
		 * 
		 */
		
		
		/*
		 *  if(조건식){
		 *  }else if(조건식){
		 *  }else if(조건식){
		 *  }else{
		 *  }
		 * 
		 */
		////////////////////////////
		int score=90;
		
		if(score>=90) {
			System.out.println("a");
		}else if(score>=80){
			System.out.println("b");
		}
		
		////////////////////////////
		//if문사용시 주의사항
		if(score>=90) {
			System.out.println("a");
		}
			if(score>=80) {
				System.out.println("b");
			}
	}
}
