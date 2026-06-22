class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        boolean strFirst = true;

        for (String str : s.split("")) {

            if (str.equals(" ")) {
                sb.append(str);
                strFirst = true;
            }
            else {
                if (strFirst) {
                    sb.append(str.toUpperCase());
                    strFirst = false;
                } else {
                    sb.append(str.toLowerCase());
                }
            }
        }

        return sb.toString();
    }
}