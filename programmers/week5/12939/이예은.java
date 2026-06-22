import java.util.*;
class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int max = Arrays.stream(str).mapToInt(Integer::parseInt).max().getAsInt();
        int min = Arrays.stream(str).mapToInt(Integer::parseInt).min().getAsInt();
        return String.valueOf(min)+" "+String.valueOf(max);
    }
}