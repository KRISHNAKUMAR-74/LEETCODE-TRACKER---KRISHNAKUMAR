// Last updated: 11/08/2026, 14:50:16
class Solution {
    public int[] runningSum(int[] nums) {
        int n= nums.length;
        int i=0,j;
        int arr[]=new int[n];
        arr[i]=nums[i];
        for(i=0;i<n;i++){
         for(j=i+1;j<n;j++){
            arr[j] = arr[i]+nums[j];
         }  
            
        }
      return arr;

    }
}