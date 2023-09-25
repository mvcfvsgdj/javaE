package java2.interfaceEx.cook.myarrays;

import java2.interfaceEx.cook.myarrays.cast.hanburger;
import java2.interfaceEx.cook.myarrays.cast.setMenu;

public class order {
	public static void main(String[] args) {
		hanburger h = new setMenu();

		String order1 = h.햄버거();
		System.out.println("손님 1: " + order1);
		
		setMenu s = (setMenu) h;
		String order2 = s.셋트메뉴();
		System.out.println("손님 2: " + order2);

	}
}
