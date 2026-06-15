class Solution {
    public long solution(int price, int money, int count) {
        long a= 0;
        for(int i=1; i<=count; i++){
            a+=price*i;
        }

        return a - money > 0 ? a-money : 0;
    }
}