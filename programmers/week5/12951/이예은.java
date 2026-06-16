class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();

        String[] str = s.split(" ", -1);
        for(String a : str) {
            if(a.isEmpty()) {
                answer += " ";
                continue;
            }

            char c = a.charAt(0);
            if(Character.isDigit(c)) {
                answer += a +" ";
                continue;
            }
            answer += String.valueOf(c).toUpperCase() + a.substring(1) + " ";
        }
        return str[str.length-1].isEmpty() ? answer.substring(0, s.length()) : answer.trim();
    }
}