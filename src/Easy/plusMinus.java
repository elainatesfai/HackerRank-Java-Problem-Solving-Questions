package Easy;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class plusMinus {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(-4, 3, -9, 0, 4, 1));

		plusMinus(arr);
	}
	
	public static void plusMinus(List<Integer> arr) {
		
	    double n = arr.size();
	    
	    double plus = 0;
	    double minus = 0;
	    double zero = 0;

	    for (int i=0; i<arr.size(); i++) {
	    	if (arr.get(i) > 0) {
	    		plus++;
	    	}
	    	
	    	if (arr.get(i) < 0) {
	    		minus++;
	    	}
	    	
	    	if (arr.get(i) == 0) {
	    		zero++;
	    	}
	    	
	    }
	    
	    
	    DecimalFormat df = new DecimalFormat("0.000000");
	    
	    System.out.println(
    		df.format(plus/n) + "\n" +
			df.format(minus/n) + "\n" +
    		df.format(zero/n)
		);

    }

}
