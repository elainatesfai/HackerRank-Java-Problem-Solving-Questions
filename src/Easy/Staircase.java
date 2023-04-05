package Easy;

import java.util.Collections;

public class Staircase {

	public static void main(String[] args) {
		

		staircase(4);

	}
	
	public static void staircase(int n) {
//		Iteratively incrementing i in each loop
		for (int i=1; i<=n; i++) {
			
//			Printing out the spaces which is n-i combined with the # which is i
			System.out.println(
				String.join("", Collections.nCopies(n-i," ")) +
				String.join("", Collections.nCopies(i,"#"))
			);

		}
    }

}
