import java.math.*;
class Solution {
    public long solution(int n) {
        BigInteger answer = BigInteger.ONE;

        for(int i=1; i<n; i++) {
            if((n-i)%2==0) answer = answer.add(c(i+(n-i)/2, (n-i)/2));
        }

        for(int i=1; i<n; i++) {
            if(2*i==n) answer = answer.add(BigInteger.ONE);
        }

        return answer.remainder(BigInteger.valueOf(1234567)).longValue();
    }

    public BigInteger c(int n, int r) {
        BigInteger N=BigInteger.ONE, R=BigInteger.ONE, NR=BigInteger.ONE;
        for(int i=1; i<=n; i++) {
            N = N.multiply(BigInteger.valueOf(i));
        }
        for(int i=1; i<=r; i++) {
            R = R.multiply(BigInteger.valueOf(i));
        }
        for(int i=1; i<=n-r; i++) {
            NR = NR.multiply(BigInteger.valueOf(i));
        }
        return N.divide(R.multiply(NR));
    }

}