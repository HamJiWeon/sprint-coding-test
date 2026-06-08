class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = (int)'p';
        int P= (int) 'P';
        int y = (int)'y';
        int Y= (int) 'Y';

        int pCount = 0;
        int yCount = 0;

        for(char c : s.toCharArray()){
            if((int) c == p || (int) c ==P) {
                pCount ++;
            }else if ((int) c == y || (int) c == Y){
                yCount++;
            }else{return answer;
            }
        }
        if(pCount == yCount){
            return answer;
        }else if(pCount == 0 || yCount ==0){
            return answer;
        }else{
            answer = false;
        }

        System.out.println("Hello Java");
        return answer;
    }
}