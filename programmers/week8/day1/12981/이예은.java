import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        List<String> arr = new ArrayList<>();
        for(int i=0; i<words.length; i++) {
            if(arr.contains(words[i])) return new int[]{(i%n)+1, (i/n)+1};
            arr.add(words[i]);

            char c=words[i].charAt(words[i].length()-1);
            if(i+1!=words.length && words[i+1].charAt(0)!=c) return new int[]{((i+1)%n)+1, ((i+1)/n)+1};
        }
        return new int[]{0, 0};
    }
}