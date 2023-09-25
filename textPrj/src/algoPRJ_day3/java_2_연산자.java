package algoPRJ_day3;

public class java_2_연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산을 수행하면 연산의 결과가 발생한다.
		//단항연산자  ++n, n++
		//이항연산자 a+b , * . - , / , % (나머지)
		//삼항연산자 (조건)? 참 : 거짓
		
		//대입연산자
		int num=10;//
		System.out.println(num);
		//부호연산자 + ,-
		num = -num ; //num*-1
		System.out.println(num);
		
		
		//산술연산자 + - * / %
		
		int a=90 , b=80;
		int sum=a+b;
		int sub=a-b;
		int multi = a*b;
		double devide = a/(double)b;  //(소수 이하의 값을 저장하기 위해서는 실수연산이 이루어질수 있도록 해야함)
						   //(둘 둥 하나룰 실수형으로 형변환시킴 )
		int remain = a%b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(multi);
		System.out.println(devide);
		System.out.println(remain);
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
