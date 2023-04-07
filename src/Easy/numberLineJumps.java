package Easy;

public class numberLineJumps {

	public static void main(String[] args) {
		
//		Should return "NO":
		
	//		System.out.println(kangaroo(0, 2, 5, 3));
	//		System.out.println(kangaroo(3, 3, 4, 1));
		
//		Should return "YES"
			System.out.println(kangaroo(3, 2, 5, 1));
//			System.out.println(kangaroo(0, 3, 4, 2));

	}
	
	public static String kangaroo(int x1, int v1, int x2, int v2) {
	    
//		checks if rate1 is bigger than rate2
//		also if difference between position2 and position1 is divisible by the difference of rate1 minus rate2
//		This checks if they meet at the same jump
		
		if ((v1>v2) && (x2-x1)%(v1-v2) == 0) {
			
			int jumps = (x2 - x1) / (v1 - v2);
			System.out.println(jumps);
			
			return "YES";
		}
		
	    return "NO";
		
	    
    }

}
