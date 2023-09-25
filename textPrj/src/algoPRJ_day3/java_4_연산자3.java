package algoPRJ_day3;

public class java_4_연산자3 {

	public static void main(String[] args) {
			
		//관계연산자
		// > , < , >= , <= , ==(같음) , !=(다름)
	int myAge= 27;
	boolean result = myAge>25;  //true or false 
	System.out.println(result);
	
	boolean result2 = myAge>=25;
	System.out.println(result2);
	
	boolean result3 = myAge<25;
	System.out.println(result3);

	boolean result4 = myAge<=25;
	System.out.println(result4);

	
	int yourAge=26;
	boolean result5 = yourAge ==26;
	System.out.println(result5);
	
	boolean result6 = yourAge !=27;
	System.out.println(result6);
	
	// 논리 연산자 그리고 (&&), 일떄(||) , 논리부정 !
	
	int kor=80;
	int eng=100;
	//두과목 모두 90이상이면 장학금
	
	boolean result7 = kor>=90 && eng>=90; 
	System.out.println("7"+result7);

	//두과목중 하나 
	boolean result8 = kor>=90 || eng>=90;
	System.out.println("8"+result8);
	
	
	boolean result9 = !(kor>=80);
	System.out.println("9"+result9);
	
	
	//복합대입연산자
	// += ,-= ,/= ,*= , %=
	
	int num=10;
	num = num +10;
	num +=10;
	
	//삼항연산자
	int result10 = (15>3)?15:3;
	System.out.println(result10);
	
	//(조건식) ?참:거짓;
	
	int m=12;
	int n=125;
	
	int max = (m>n)?m:n;
	System.out.println(max);
	
	
	
	
	}
}
