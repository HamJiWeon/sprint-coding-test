import java.util.*;
class Solution {
    public int solution(int[] p, int location) {
        Queue<int[]> q = new LinkedList<>();
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<p.length; i++) {
            q.add(new int[] {p[i], i});
        }

        while(!q.isEmpty()) {
            int[] a = q.poll();
            boolean b = false;
            for(int[] i:q) {
                if(a[0]<i[0]) {
                    b=true;
                    q.add(a);
                    break;
                }
            }
            if(!b) arr.add(a[1]);
        }

        return arr.indexOf(location) +1;
    }
}