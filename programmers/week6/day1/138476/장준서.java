import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int c : tangerine){
            if(map.containsKey(c)){
                map.put(c,(map.get(c)+1));
            }else {map.put(c,1);}
        }
        List<Integer> values = new ArrayList<>(map.values());
        Collections.sort(values, Collections.reverseOrder());

        int count = 0;
        for(int c : values){
            count += c;
            answer ++;

            if(count >= k) break;

        }

        return answer;
    }
}