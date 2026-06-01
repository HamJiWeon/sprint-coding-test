class Solution {
    //나머지가 1이 되는 수 찾기
    public int solution(int n) {
        int answer = n;
        for(int i = 2; i<n; i++){
            if(n%i == 1){
                if(i<answer){
                    answer = i;
                }
            }

        }
        return answer;
    }
}