// Last updated: 11/08/2026, 14:49:30
class Solution {
    public int sumOfMultiples(int n) {
        int totalSum = 0;
        
        for (int i = 1; i <= n; i++) {
            
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                totalSum += i;
            }
        }
        
        return totalSum;
    }
}