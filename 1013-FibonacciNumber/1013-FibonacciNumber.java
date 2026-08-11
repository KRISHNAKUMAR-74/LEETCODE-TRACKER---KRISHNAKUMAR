// Last updated: 11/08/2026, 14:50:44
class Solution {
    public int fib(int n) {
    int n1=0,n2=1,n3=0,i;
    if(n==0) return 0;
    else if(n==1) return 1;
    else 
    for(i=1;i<n;i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;

    }
    return n3;
    }
}