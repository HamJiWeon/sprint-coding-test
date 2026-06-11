class Solution {
    public String solution(int n) {

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++ ){
            sb.append("수").append("박");//과거의 실수도 기록하는 성장형 인재(희망)
        }
        String str = sb.toString();
        String answer = str.substring(0, n);
        return answer;
    }
}