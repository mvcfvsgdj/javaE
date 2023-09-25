package java2.interfaceEx.cook.myarrays;

import java.util.Arrays;
import java.util.Comparator;

public class ScoreTest2 {

	public static void main(String[] args) {
		Score[] list = new Score[4];
		
		list[0]= new Score(100,90);
		list[1]= new Score(80,99);
		list[2]= new Score(99,87);
		list[3]= new Score(70,60);
	
		//객체배열 출력
		
		for(Score score:list) {
			
			System.out.println(score);
		}
		
	//	Arrays.sort(list);
		MyArrays.sort(list);
		
	/*	
		//국어 점수가 낮은순으로 정렬 직접정렬 , 선택정렬
		for(int i=0 ; i<list.length-1; i++) { //i=0
			for(int j=i+1 ; j<list.length; j++) { //j=1 ,2 , 3
				if(list[i].kor>list[j].kor) {
					Score tmp;
					tmp=list[i];
					list[i]=list[j];
					list[j]=tmp;
					
				}
				
			}
		}
		*/
		
		MyArrays.sort(list , new Comparator() {
			@Override
			public int compare(Object o1,Object o2) {
				
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				
				return s1.kor-s2.eng;
				
			}
			
		});
		class ComparatorImp implements Comparator {

			@Override
			public int compare(Object o1, Object o2) {
				Score s1 = (Score) o1;
				Score s2 = (Score) o2;
				
				return s1.kor-s2.eng;
			}
			
		}
		
		MyArrays.sort(list , new ComparatorImp());
		
		System.out.println("-----");
for(Score score:list) {
			
			System.out.println(score);
		}
		
	}
}
