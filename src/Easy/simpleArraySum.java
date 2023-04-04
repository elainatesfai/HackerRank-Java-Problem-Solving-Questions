package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class simpleArraySum {

	public static void main(String[] args) {
		
		// assign a list the value of [1, 2, 3]
		List<Integer> ar = new ArrayList<Integer>(
			Arrays.asList(1,2,3)
		);
	
		System.out.println(simpleArraySum(ar));

	}
	
	 public static int simpleArraySum(List<Integer> ar) {
		 // initialising the value 
        int value = 0;
        
        
        for (int i=0; i<ar.size(); i++) {
        	// incrementing value with value of every item in list
            value += ar.get(i);
        }
        return value;
    }


}
