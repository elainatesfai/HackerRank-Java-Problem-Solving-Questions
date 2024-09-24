package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subarrayDivision {
	
	public static void main(String[] args) {
		//	Initialise sample input 1 variables
		List<Integer> s1 = new ArrayList<Integer>(Arrays.asList(2, 2, 1, 3, 2)); // Chocolate bar
		int d1 = 4; // Birthday
		int m1 = 2; // Birth month
		
		// Call the birthday function and print its output
		System.out.println("Sample Input 1: " + birthday(s1, d1, m1));
		
		// Initialise sample input 2 variables
		List<Integer> s2 = new ArrayList<Integer>(Arrays.asList(1, 2, 1, 3, 2)); // Chocolate bar
		int d2 = 3; // Birthday
		int m2 = 2; // Birth month
		
		// Call the birthday function and print its output
		System.out.println("Sample Input 2: " + birthday(s2, d2, m2));
		
		// Initialise sample input 3 variables
		List<Integer> s3 = new ArrayList<Integer>(Arrays.asList(4)); // Chocolate bar
		int d3 = 4; // Birthday
		int m3 = 1; // Birth month
		
		// Call the birthday function and print its output
		System.out.println("Sample Input 3: " + birthday(s3, d3, m3));

	}
	
	public static int birthday(List<Integer> s, int d, int m) {
	    // If the length of the chocolate bar list is equal to m, handle it separately
	    if (s.size() == m) {
	        int dCount = 0;
	        for (int i = 0; i < m; i++) {
	            dCount += s.get(i);
	        }
	        if (dCount == d) {
	            return 1;
	        }
	        return 0;
	    }
	    
	    // Initialise count variable
	    int count = 0;
	    
	    // Loop through the entire chocolate bar list
	    for (int i = 0; i <= s.size() - m; i++) {
	        // Initialise the day count
	        int dCount = 0;
	        
	        // Loop through the number of month squares
	        for (int j = i; j < i + m; j++) {
	            dCount += s.get(j);
	        }
	        
	        // Increment count if dCount equates to birthday
	        if (dCount == d) {
	            count++;
	        }
	    }
	    
	    // Return count variable
	    return count;
	}

}
