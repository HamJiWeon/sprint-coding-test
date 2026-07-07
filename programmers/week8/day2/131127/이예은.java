import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for(int i=0; i<discount.length; i++) {
            List<String> arr = new ArrayList<>();
            for(int j=i; j<i+10; j++) {
                if(j<discount.length) arr.add(discount[j]);
            }

            boolean b = true;
            for(int j=0; j<want.length; j++) {
                String s = want[j];
                int c = (int) arr.stream().filter(a -> a.equals(s)).count();
                if(c!=number[j]) {
                    b=false;
                    break;
                }
            }

            if(b) answer++;
        }

        return answer;
    }
}