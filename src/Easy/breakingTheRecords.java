package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class breakingTheRecords {

	public static void main(String[] args) {
		
		List<Integer> scores1 = new ArrayList<Integer>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));
		List<Integer> scores2 = new ArrayList<Integer>(Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42));
		
		System.out.println(breakingRecords(scores2));

	}
	
	public static List<Integer> breakingRecords(List<Integer> scores) {
//	    Initialise variables
		int highest = scores.get(0);
		int lowest = scores.get(0);
		int hCount = 0;
		int lCount = 0;
		
//		incrementing each element in scores
		for (int i = 0; i < scores.size(); i++) {
			
//			if current is bigger than highest, increment and change highest
			if (scores.get(i) > highest ) {
				highest = scores.get(i);
				hCount++;
			}
			
//			i current is lower than lowest, increment and change lowest
			if (scores.get(i) < lowest ) {
				lowest = scores.get(i);
				lCount++;
			}
			
		}
		
//		create variable that stores the hCount and lCount
		List<Integer> records = new ArrayList<Integer>(Arrays.asList(hCount, lCount));
		return records;
    }

}
