// Last updated: 11/08/2026, 14:49:18
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum =0;

        for(int num : nums){
            int range = digitRange(num);
            if(range>maxRange){
                maxRange = range;
            }
        }
        for(int num:nums){
            if(digitRange(num) == maxRange){
                sum += num;
            }
        }
        return sum;
    }
    private int digitRange(int num){
        int min =9;
        int max =0;

        while(num>0){
            int digit = num%10;
            min = Math.min(min, digit);
            max = Math.max(max,digit);
            num /= 10;
        }
        return max-min;
    }
}