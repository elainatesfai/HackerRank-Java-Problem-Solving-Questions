package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		List<List<Integer>> arr = new ArrayList<List<Integer>>(
			Arrays.asList(
					Arrays.asList(11, 2, 4), 
					Arrays.asList(4, 5, 6),
					Arrays.asList(10, 8, -12))
			);
		
		System.out.println(diagonalDifference(arr));
	}
	
public static int diagonalDifference(List<List<Integer>> arr) {
	
//        initialise variables
        int primary = 0;
        int secondary = 0;
        
        for (int i=0; i<arr.size(); i++) {
            for (int j=0; j<arr.get(1).size(); j++) {
                
                if (i == j) {
                    primary += arr.get(i).get(j);
                }
                
                if (i == (arr.size()-1)-j) {
                    secondary += arr.get(i).get(j);
                }
                
            }
        }

        // making sure remains positive
        int difference = primary - secondary;
        if (difference < 0) {
            difference *= -1;
        }
        return difference;
    }

}
