class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String str : arr) {
            max = Math.max(Integer.parseInt(str), max);
            min = Math.min(Integer.parseInt(str), min);
        }

        return String.valueOf(min) + " " + String.valueOf(max);
    }
}