import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set1 = new HashSet<>();
        int n=elements.length;
        //원형은 앞뒤 상관없이 연속으로 해야하므로 두배
        int [] extended = new int[n*2];

        for(int i=0; i<n*2; i++){
            extended[i] = elements[i%n];
        }
        for(int i=1;i<=n; i++){
            for(int j=0; j<n; j++){
                int sum=0;
                for(int k=0;k<i;k++){
                    sum+= extended[j+k];
                }
                set1.add(sum);
            }
        }
        return set1.size();
    }
}