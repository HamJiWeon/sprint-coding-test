class Solution {
    public int solution(int[] arr) {
        int answer = arr[0]; //[2]

        for (int i = 1; i < arr.length; i++) {
            int currentNum = arr[i]; //[6]
            int step = answer; //[2]

            //(2%6)!=0
            while (answer % currentNum != 0) {
                answer += step;
            }
        }

        return answer;
    }
}