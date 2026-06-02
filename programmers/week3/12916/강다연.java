class Solution {
    boolean solution(String s) {
        //문자열 내 p와 y의 개수
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        int oCount = 0;
        String arr []  = s.split("");
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equalsIgnoreCase("P")){
                pCount++;
            }else if(arr[i].equalsIgnoreCase("Y")){
                yCount++;
            }else{
                oCount++;
            }
        }

        if(pCount == yCount){
            return answer;
        }
        if(pCount != yCount){
            answer = false;
        }else{
            return answer;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}