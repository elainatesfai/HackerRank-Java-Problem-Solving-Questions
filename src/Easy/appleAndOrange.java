package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appleAndOrange {

	public static void main(String[] args) {
		
		List<Integer> apples = new ArrayList<Integer>(Arrays.asList(-2, 2, 1));
		List<Integer> oranges = new ArrayList<Integer>(Arrays.asList(5, -6));
		
		countApplesAndOranges(7, 11, 5, 15, apples, oranges);

	}
	
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    
//		Initialising count variables
		int applesCount = 0;
		int orangesCount = 0;
		
//		For each element in the apples list 
		for (int i=0; i<apples.size(); i++) {
			
//			if an apple lands in house's interval increment count
			if ((a + apples.get(i) >= s) && ((a + apples.get(i) <= t))) {
				applesCount++;
			}
		}
		
//		For each element in the oranges list
		for (int i=0; i<oranges.size(); i++) {
			
//			if an orange lands in the house's interval increment count
			if ((b + oranges.get(i) >= s) && ((b + oranges.get(i) <= t))) {
				orangesCount++;
			}
			
		}
		
		System.out.println(applesCount + "\n" + orangesCount);
    }

}
