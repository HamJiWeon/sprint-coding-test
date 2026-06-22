class Solution {
    public int[] solution(String s) {
        int a=0, i=0;

        while(!s.equals("1")) {
            String b="";
            char[] c = s.toCharArray();
            for(char ch: c) {
                if(ch=='0') {
                    a++;
                    continue;
                }
                b+=ch;
            }

            int q=b.length();
            b="";
            while(q/2>0) {
                b+=q%2;
                q/=2;
            }
            b=q%2+b;
            s=b;
            i++;
        }

        return new int[]{i, a};
    }
}