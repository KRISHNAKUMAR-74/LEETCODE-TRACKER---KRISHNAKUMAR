// Last updated: 11/08/2026, 14:49:47
class Solution {
    public int commonFactors(int a, int b) {
        int count = 0;
        
        int minVal = Math.min(a, b);
        
        for (int i = 1; i <= minVal; i++) {
            
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        
        return count;
    }
}