import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int l=0, r=people.length-1;
        while(true) {
            if(l==r) {
                answer++;
                break;
            }
            if(l>r) break;
            if(people[r]+people[l]>limit)  {
                answer++;
                r--;
            }
            else {
                answer++;
                l++;
                r--;
            }
        }

        return answer;
    }
}