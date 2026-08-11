// Last updated: 11/08/2026, 14:50:51
import java.util.*;

class Solution {
    private int[] prefixSums;
    private int total;
    private Random rand;

    public Solution(int[] w) {
        prefixSums = new int[w.length];
        rand = new Random();
        prefixSums[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + w[i];
        }
        total = prefixSums[w.length - 1];
    }

    public int pickIndex() {
        int target = rand.nextInt(total) + 1; // random number in [1, total]
        int left = 0, right = prefixSums.length - 1;
        
        // Binary search for the smallest prefix >= target
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (prefixSums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
