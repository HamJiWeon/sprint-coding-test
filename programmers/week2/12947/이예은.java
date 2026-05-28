class Solution {
    public boolean solution(int x) {
        int sum = 0;
        char[] c = String.valueOf(x).toCharArray();
        for(int i=0; i<c.length; i++){
            sum+=c[i]-'0';
        }
        if(x%sum==0) return true;
        else return false;
    }
}