package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divisibleSumPairs {

    public static void main(String[] args) {
        // Initialise Example Variables
        int n = 6;
        int k = 3;
        List<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 3, 2, 6, 1, 2));

        // Test Example Variables
        System.out.println(divisibleSumPairs(n, k, ar));

    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Initialise Variables
        int pairs = 0;

        // Looping Through Potential Pairs
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Check if Potential Pairs Meet Criteria
                if ((i < j) && ((ar.get(i) + ar.get(j)) % k == 0)) {

                    // Increment If They Do
                    pairs++;
                }
            }
        }

        // Return Pairs Found
        return pairs;
    }

}
