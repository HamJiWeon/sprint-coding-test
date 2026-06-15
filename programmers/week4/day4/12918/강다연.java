class Solution {

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        //예외처리
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}