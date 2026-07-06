class Solution {
    public int[] m;
    public int solution(int n) {
        m = new int[n+1];
        return F(n);
    }

    public int F(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;

        if(m[n]!=0) return m[n];

        m[n] = (F(n-1) + F(n-2))%1234567;
        return m[n];
    }
}