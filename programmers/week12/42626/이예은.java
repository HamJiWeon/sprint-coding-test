import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[speeds.length];
        for(int i=0; i<speeds.length; i++) {
            arr[i] = (int) Math.ceil((100-progresses[i])/(double)speeds[i]);
        }


        List<Integer> list = new ArrayList<>();

        int a=0, b=1, c=1;
        while(true) {
            if(a>arr.length-1 || b>arr.length-1) break;

            if(arr[a]<arr[b]) {
                list.add(c);
                a=b;
                b=a+1;
                c=1;
            }
            else {
                b++;
                c++;
            }
        }

        list.add(c);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}