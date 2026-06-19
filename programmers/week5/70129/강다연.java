class Solution {
    public int[] solution(String s) {
        int countY = 0;
        int loop = 0;
        while(!s.equals("1")){
            int countN = 0;
            for(int i =0; i< s.length(); i++){
                if(s.charAt(i) == '0'){
                    countY++;
                }else{
                    countN++;
                }

            }
            s = Integer.toBinaryString(countN);
            loop++;
        }
        return new int[]{loop,countY};
    }
}