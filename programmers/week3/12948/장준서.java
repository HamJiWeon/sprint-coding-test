class Solution {
    public String solution(String phone_number) {
        String answer = "";

        String star = "";
        for(int i = 0; i < phone_number.length()-4; i++){
            star += "*";
        }

        String number4 = phone_number.substring(phone_number.length()-4);
        answer = star + number4;
        return answer;
    }

}
