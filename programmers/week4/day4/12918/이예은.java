class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] c = s.toCharArray();
        for (char ch : c) {
            if(Character.isDigit(ch) && (s.length()==4||s.length()==6)) continue;
            else return false;
        }
        return answer;
    }
}