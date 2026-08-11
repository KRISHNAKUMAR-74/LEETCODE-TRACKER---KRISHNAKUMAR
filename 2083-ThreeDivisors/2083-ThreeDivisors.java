// Last updated: 11/08/2026, 14:50:01
class Solution {
    public boolean isThree(int n) {
        
        if (n < 4) return false;

        
        int root = (int) Math.sqrt(n);

    
        if (root * root != n) return false;

        
        return isPrime(root);
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}