package algoPRJ_day3;

public class java_1_변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//변수 : 메모리블럭, 기억장소(공간) , 기억장소를 식별하기 위한 이름.

		// 변수선ㅇ너
		// 자료형 변수이름

		int a; // 4byte 기억공간 기억장소를 확보함 , 정수형으로 해석

		// 자료형

		// 크기 + 해석방법
		// 자료형(공간의 크기와 공간의 내용을 해석하는 방법 )
		/*
		 * int : 정수형 , 4byte 예시) int a; (+- 약21억) overflow
		 * 
		 * byte: 1byte (8bit , 1bit sign -128+127) short: 2byte (16bit) -32768 ~ 32767
		 * int : 4byte (32bit) -2147483648 ~ 2147583647 
		 * long : 8byte (64bit)  9223372036854775807L ; // 922 3372 0368 5477 5807 L   (약922경)
		 *
		 * char : 문자형 :문자하나를 저장할 수 있는 공간 , 2byte 
		 * 
		 * double : 실수형데이터를 저장할수있는공간 :8byte
		 * 예시 ) char ch='a'; //한문자 '' 표현
		 * 예시 ) char ch2='한';
		 *
		 * double : 실수형데이터를 저장 할수 있는공간 :8byte
		 * 			소수이하 15자리 표현
		 * 
		 * float : 4byte 소수이하 7자리 표현
		 *
		 * boolean: 논리형 (true=1 , false=0 )값
		 * 예시 ) boolean flag=true;
		 * 
		 *
		 */
		//리터럴 :값 자체 , 10 , 10.3 , 'a', "hello" ,true
		//상수 영역에 저장된다 .
		//크기를 가짐
		//정수형 값 int형 저장
		//실수형값  double형 저장
		
		int  iNum=334; // ok 334란 값이 상수영역에 저장되는 것
					   //    iNum 기억장소에 저장되는 것 ok

		// long iLong = 2200000000; (오류발생)
					// 22억 값 상수 영역에 저장을 못함.
					// 
		long iLong = 2200000000L;
					//long형 리터럴값을 표현해야 함 숫자 L =long형 리터럴 표현
	
		double d= 2.3; //23.3 실수형 리터럴이 double 형으로 상수영역 저장
					 // d 변수에 저장 
		//float f = 23.3 ; // 23.3 상수영역에 저장가능
						// double 형의 값이 float변수에 저장될때 문제발생
		
		//float d = 23.3f ; // 상수영역에 float형 값으로 저장될수 있도록 표현
						//숫자f 표시해야 float형 상수로 저장됨
		
		
		char ch='a'; //한 문자를 저장하기 위한 공간을 확보할때 사용하는 자료형
					 // '' 한문자 표현
					 // 2byte 사용
		char ch2='한';
	
		//문자열은 문자 여러개=문자집합
		
		//"i hate java" 
		//
		char[] str = {'i',' ','l','i','k','e',' ','j','a','v','a'};
		char[] str2 = new char[11];
		str2[0]='i';
		str2[1]=' ';
		str2[2]='l';
		str2[3]='i';
		str2[4]='k';
		str2[5]='e';
		str2[6]=' ';
		str2[7]='j';
		str2[8]='a';
		str2[9]='v';
		str2[10]='a';

		System.out.println("문자열출력");
		System.out.print(str2[0]);
		System.out.print(str2[1]);
		System.out.print(str2[2]);
		System.out.print(str2[3]);
		System.out.print(str2[4]);
		System.out.print(str2[5]);
		System.out.print(str2[6]);
		System.out.print(str2[7]);
		System.out.print(str2[8]);
		System.out.print(str2[9]);
		System.out.println(str2[10]);

		String str3="l like java";
		System.out.println(str3);
		
		char result = str3.charAt(2);
		System.out.println(result);
		
		//논리값 저장할수있는 자료형 boolean true,false
		
		boolean flag= true; //(1byte)
		
		if(flag ==true) {
			System.out.println("조건참");	
		}
		if(flag) {
			System.out.println("조건참");	
		}else {
			System.out.println("조건거짓");
		}
		
		
	}
}
