import java.util.Arrays;
class Solution {
    public String solution(String s) {

        int[] intArray = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                //Integer::parseInt => s -> Integer.parseInt(s)
                //parseInt 문자열을 읽고 int로 변환
                .toArray();

        int min = Arrays.stream(intArray).min().getAsInt();
        int max = Arrays.stream(intArray).max().getAsInt();

        String answer = min + " " + max;

        return answer;
    }
}