class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 6 || s.length() == 4){
            for(char c : s.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
        }else{return false;}

        return answer;
    }
}