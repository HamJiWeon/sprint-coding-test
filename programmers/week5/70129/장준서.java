class Solution {
    public int[] solution(String s) {

        int zeroCount = 0;
        int conversionCount = 0;
        while(!s.equals("1")){
            String newS = "";
            for(char c : s.toCharArray()){
                if(c == '0'){
                    zeroCount++;
                }else {
                    newS += c;
                }
            }
            s = Integer.toBinaryString(newS.length());
            conversionCount++;
        }
        return new int[] {conversionCount, zeroCount};
    }
}