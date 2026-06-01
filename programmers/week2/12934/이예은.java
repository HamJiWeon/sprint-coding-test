import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        double d = Math.sqrt(n);
        char[] c = String.valueOf(d).toCharArray();
        if(c[c.length-1]=='0') return (long)Math.pow(d+1, 2);
        else return answer=-1;
    }
}