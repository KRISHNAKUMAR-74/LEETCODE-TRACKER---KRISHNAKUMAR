// Last updated: 11/08/2026, 14:50:28
class Solution {
    public int tribonacci(int n) {
        int n1=0,n2=1,n3=1,n4=0,i;
        if(n==0||n==1) return n;
         if(n==2) return 1 ;
        
        for(i=3;i<=n;i++){
            n4= n1+n2+n3;
            n1=n2;
            n2=n3;
            n3=n4;
        }
        return n4;
    }
}