class Solution {
    public String solution(String phone_number) {
        String answer = "";
        //뒤에서 4자리를 뺌
        int maskingLength = phone_number.length() - 4;

        answer += "*".repeat(maskingLength);

        answer += phone_number.substring(maskingLength);

        return answer;
    }
}