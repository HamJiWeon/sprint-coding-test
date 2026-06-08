class Calculator{
    public int calculate(int [] a, int [] b){
        int sum =0;
        //배열 길이가 같으니 하나의 반복문으로 계산
        for(int i =0; i<a.length; i++){
            sum+= a[i] * b[i];
        }
        return sum;
    }
}

class Solution{
    public int solution(int [] a, int [] b){
        Calculator calculator = new Calculator();

        int answer = calculator.calculate(a,b);

        return answer;
    }
}