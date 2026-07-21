import java.math.*;
class Solution {
    public int solution(int[] arr) {
        int sum=1;

        int a=arr[0];
        for(int i=1; i<arr.length; i++) {
            a = lcm(a, arr[i]);
        }
        return a;
    }

    public int lcm(int a, int b) {
        for(int i=Math.max(a,b); i>0; i--) {
            if(a%i==0 && b%i==0) return i*(a/i)*(b/i);
        }
        return a*b;
    }
}