class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i=left; i<=right; i++){
            answer+= a(i)%2==0 ? i : -i;
        }
        return answer;
    }

    public int a(int n) {
        int b = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==0) b++;
        }
        return b;
    }
}