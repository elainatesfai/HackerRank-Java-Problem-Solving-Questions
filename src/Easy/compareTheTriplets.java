package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class compareTheTriplets {

	public static void main(String[] args) {
		
		
		// Alice's Scores
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(67, 45, 78));
		// Bob's Scores
		List<Integer> b = new ArrayList<Integer>(Arrays.asList(54, 87, 76));
		
		compareTriplets(a,b);
		

	}
	
	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		// Initialise counts
		int alice = 0;
		int bob =0; 
		
		// Increments counts for alice and bob if higher
		for (int i=0; i<3; i++) {
			if (a.get(i) > b.get(i)) {
				alice++;
			}
			
			if (a.get(i) < b.get(i)) {
				bob++;
			}
		}

		// Create List for scores created of counts
		List<Integer> scores = new ArrayList<Integer>(Arrays.asList(alice, bob));
		return scores;

    }

}
