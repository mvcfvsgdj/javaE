package java2.interfaceEx.cook.myarrays;

import java.util.Comparator;

interface MyComparable {
	public int compareTo(Object other);

}

public class MyArrays {

	public static void sort(Object[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				MyComparable m = (MyComparable) arr[i];
				if (m.compareTo(arr[j])>0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}
	}
	
	/*
	 * 
	 *  interface Comparator{
	 *  public int compare(Object o1 , Object o2);
	 *  
	 *  }
	 */
	public static void sort(Object[] arr , Comparator c ){
		for (int i=0;i<arr.length-1; i++) {
			for(int j=i+1 ; j<arr.length; j++) {
				//교환
				if( c.compare(arr[i], arr[j])>0) {
					
					Object tmp;
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
	}
}