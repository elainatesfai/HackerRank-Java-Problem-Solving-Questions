package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class birthdayCakeCandles {

	public static void main(String[] args) {
		
		List<Integer> candles = new ArrayList<Integer>(Arrays.asList(4, 4, 1, 3));
		System.out.println(birthdayCakeCandles(candles));
	}
	
	public static int birthdayCakeCandles(List<Integer> candles) {
//		Initialising variables
		int count = 0;
		
//		Sorting candles and identifying tallest element
		Collections.sort(candles);
		int tallest = candles.get(candles.size()-1);
	    
//		incrementing if element in candles is same as tallest
		for (int i=0; i<candles.size(); i++) {
			if (candles.get(i) == tallest) {
				count++;
			}
		}
		
		return count;
    }


}
