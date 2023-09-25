package java2.interfaceEx.cook.myarrays.cast;

public class 캐스팅연습 {
public static void main(String[] args) {
	
	Score s = new Score("홍길동", 100 , 90);
	System.out.println(s);

	//upcasting
	//Object o = s;  //상속관계에서 부모형으로 다루는 것 *참조형 변수 ,부모형으로 참조축소
	

	//downcasting
	//Score s2 = (Score)o;
	print(s);
	
}
	public static void print(Object obj) { //object 형으로 업캐스팅
		
		
	}
}
