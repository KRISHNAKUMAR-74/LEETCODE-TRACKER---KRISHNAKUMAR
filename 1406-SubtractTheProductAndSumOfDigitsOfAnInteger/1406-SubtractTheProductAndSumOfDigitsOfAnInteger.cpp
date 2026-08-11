// Last updated: 11/08/2026, 14:50:22
class Solution {
public:
    int subtractProductAndSum(int n) {
          int temp=n;
    int sum=0,product=1;
    while(temp>0)
    {
        int num=temp%10;
        sum+=num;
        product*=num;
        temp/=10;
    }
    return product-sum;
}
};