class Solution {
    public int solution(int n) {
        int answer=0; // 이거 없어도 되는데 푸시 실패해서 걍 넣엇음요
        for(int i=1; i<n; i++){
            if(n%i==1) return i;
        }
        return 0;
    }
}