package prj2;

import com.acorn.MG;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[ ] result = MG.getYak(25);
	
		for(int i = 0 ; i<result.length ; i++) {
			System.out.println(result[i]);
		}
	}

}
