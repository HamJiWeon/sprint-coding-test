class Solution {
    public String solution(String s) {
        String answer = "";
        int a = s.length()/2;
        if(s.length()%2==0) return String.valueOf(s.charAt(a-1)) + String.valueOf(s.charAt(a));
        return String.valueOf(s.charAt(a));
    }
}