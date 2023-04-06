package Easy;

import java.util.Collections;

public class timeConversion {

	public static void main(String[] args) {
		
		String s1 = "12:01:00PM";
		String s2 = "12:01:00AM";
		String s3 = "07:05:45PM";
		String s4 = "07:05:45AM";
		
		System.out.println(timeConversion(s1));

	}
	
	public static String timeConversion(String s) {
//		Initialising variables
		String hour = s.substring(0, 2);
		
//		Checking if suffix is AM
		if (s.endsWith("AM")) {
			
//			Only if 12AM change hour to 00
			if (Integer.valueOf(hour) == 12) {
				hour = "00";
			}
		}
		
//		Checking if suffix is PM
		else {
			
//			Only if hour is not 12PM add 12 to hour
			if (Integer.valueOf(hour) != 12) {
				hour = String.valueOf(Integer.valueOf(hour) + 12);
			}
			
//			Otherwise hour stays the same
		}
		
		return  hour + s.substring(2,8);
    }

}
