class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");

        int num1 = Integer.parseInt(arr[0]);
        int max = num1;
        int min = num1;

        for(int i = 1; i < arr.length; i++) {
            int num2 = Integer.parseInt(arr[i]);

            max = Math.max(max, num2);
            min = Math.min(min, num2);
        }

        return min + " " + max;
    }
}