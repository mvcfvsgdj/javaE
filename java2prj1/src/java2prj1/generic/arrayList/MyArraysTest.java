package java2prj1.generic.arrayList;

public class MyArraysTest {

	public static void main(String[] args) {

		MyArrayList list = new MyArrayList();
		list.add("1");
		list.add("2");
		list.add("3");

		for(int i=0 ; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.forEach(new MyConsumer() {
			
			@Override
			public void accept(Object c) {
				System.out.println("hi forEach"+ c );
				
			}
		});
	}

}
