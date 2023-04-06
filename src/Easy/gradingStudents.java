package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class gradingStudents {

	public static void main(String[] args) {
		
		List<Integer> grades1 = new ArrayList<Integer>(Arrays.asList(73, 67, 38, 33));
		List<Integer> grades2 = new ArrayList<Integer>(Arrays.asList(84, 29, 57));
		
		System.out.println(gradingStudents(grades2));

	}
	
	public static List<Integer> gradingStudents(List<Integer> grades) {
		
//		Initialise rounded List		
		List<Integer> rounded = new ArrayList<Integer>();
	   
//		Iteratively going through each element in grades list
		for (int i=0; i<grades.size(); i++) {
			
//			if grades less than 38, DONT ROUND
			if (grades.get(i) < 38) {
				rounded.add(grades.get(i));
			}
			
//			Else, there is a chance to ROUND
			else {
				
//				Only if the difference between the next multiple of 5 is less than 3
				if ((5-(grades.get(i)%5)) < 3) {
					rounded.add(grades.get(i)+(5-(grades.get(i)%5)));
				}
				
//				Else, DONT ROUND
				else {
					rounded.add(grades.get(i));
				}
			}
		}
		
		return rounded;

    }

}
