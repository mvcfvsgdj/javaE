package java2prj1.generic.arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class 와일드문자로제한하기 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		print(list);
		print2(list);
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("on1e");
		list2.add("tw2o");
		list2.add("th3ree");
	//	print(list2); 오류발생
		print2(list2);
		
		
		ArrayList<String> list3 = new ArrayList<>();
		list3.add("on1e");
		list3.add("tw2o");
		list3.add("th3ree");
	
		for(int i=0; i<list3.size(); i++) {
			System.out.println(list3.get(i));
		}
		//소비하다 = 디파일러 컨슘 (입력반환이 없음)
		class aaa implements Consumer<String>{

			@Override
			public void accept(String t) {
			System.out.println(t);
				
			}
			
		}
		System.out.println("===컨슈머 출력===");
		list3.forEach(new aaa());
		
		//2.
		list3.forEach(new Consumer<>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
			
		});
		
		//구현할 매서드가 하나뿐인 인터페이스를 functional interface라 함
		// 람다식으로 표현가능
		System.out.println("===lamda===");
		list3.forEach(t -> System.out.println(t));
	}

	public static void print(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}
	// 메서드 인자에서 제네릭 제한하기
	// ? super String
	// ? extends String

	public static void print2(ArrayList<? super String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}
}
