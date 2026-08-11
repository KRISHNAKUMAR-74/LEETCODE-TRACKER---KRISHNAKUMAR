// Last updated: 11/08/2026, 14:49:33
 class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        
        if (k <= numOnes) {
            return k;
        }
        
        
        int sum = numOnes;
        k -= numOnes;
        
        
        if (k <= numZeros) {
            return sum;
        }
        
        
        k -= numZeros;
        
        
        return sum - k;
    }
}
        
