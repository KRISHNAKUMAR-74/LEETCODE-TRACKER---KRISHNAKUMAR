// Last updated: 11/08/2026, 14:49:38
class Solution {
    public int passThePillow(int n, int time) {
        int Cycle = time/(n-1);
        int rs = time%(n-1);
        return Cycle%2==0? rs+1 : n-rs;
    }
}