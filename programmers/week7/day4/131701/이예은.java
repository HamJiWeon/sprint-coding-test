import java.util.*;
class Solution {
    public int solution(int[] elements) {
        int[] element = new int[elements.length*2];
        for(int i=0; i<element.length; i++) {
            element[i] = elements[i%elements.length];
        }

        List<Integer> arr = new ArrayList<>();
        for(int i:elements){
            arr.add(i);
        }

        for(int i=1; i<elements.length; i++) {
            int l=0, r=l+i;
            for(int j=0; j<elements.length; j++) {
                int sum=0;
                for(int k=l; k<=r; k++) {
                    sum+=element[k];
                }
                arr.add(sum);
                l++;
                r++;
            }
        }
        return (int) arr.stream().distinct().count();
    }
}