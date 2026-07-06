class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {brown, yellow};

        for(int i = 1; i <= yellow; i++){

            //필요한 갈색 개수=(노란색 가로×2)+(노란색 세로×2)+4

            if(yellow % i == 0){
                int h  = yellow / i; //노란색 길이

                //카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
                if(i >= h){
                    int brown1 = (i * 2) + (h * 2) + 4;

                    if (brown1 == brown) {
                        // 전체 카펫의 크기는 노란색 가로세로에 테두리(+2)를 더한 값입니다!
                        return new int[]{i + 2, h + 2};
                    }
                }
            }
        }
        return new int[]{};
    }
}