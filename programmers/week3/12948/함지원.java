class Solution {
    public String solution(String phone_number) {
        StringBuilder answer = new StringBuilder();

        answer.append("*".repeat(phone_number.length() - 4))
                .append(phone_number, phone_number.length() - 4, phone_number.length());

        return answer.toString();
    }
}