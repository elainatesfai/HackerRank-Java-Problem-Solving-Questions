package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class miniMaxSum {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(396285104, 573261094, 759641832, 819230764, 364801279));
		miniMaxSum(arr);

	}
	
	public static void miniMaxSum(List<Integer> arr) {
//		Initialising the variables
		long mini = 0;
		long max = 0;
		
//		Sorting the list
		Collections.sort(arr);	
		System.out.println(arr.size());
		
//		Addign for the mini and max variables
		for (int i=0; i<arr.size(); i++) {
			if (i<arr.size()-1) {
				mini += arr.get(i);
			}
			
			if (i>0) {
				max += arr.get(i);
			}
		}
		
		System.out.println (mini + " " + max );

    }

}
