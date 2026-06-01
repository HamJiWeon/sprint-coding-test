import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        int size = String.valueOf(n).length();
        int[] arr = new int[size];
        int i = 0;
        while(n > 0) {
            arr[i] = (int)(n % 10);
            n = n / 10;
            i++;
        }
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str = "";
        for(int j = 0; j < arr.length; j++) {
            str += arr[j];
        }
        answer = Long.parseLong(str);
        return answer;
    }
}