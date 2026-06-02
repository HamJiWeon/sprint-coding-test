class Solution {
    boolean solution(String s) {
        int p=0, y=0;
        String str = s.toLowerCase();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='p') p++;
            else if(str.charAt(i)=='y') y++;
        }
        if(p==y) return true;
        else return false;
    }
}