package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class aVeryBigSum {

	public static void main(String[] args) {
		
		List<Long> ar = new ArrayList<Long>(
			Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)
		);
		
		System.out.println(aVeryBigSum(ar));
		

	}
	
	public static long aVeryBigSum(List<Long> ar) {
	    // initialise value
		long value = 0;
		
		for (int i=0; i<ar.size(); i++) {
			// add with value of increment
			value += ar.get(i);
		}
	
		return value;
    }

}
