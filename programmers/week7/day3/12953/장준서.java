class Solution {
  public int solution(int[] arr) {

    int frontValue = arr[0];//초기 값 & 누적.

    for(int i = 1; i < arr.length; i++){
      int Gcd = gcd(frontValue, arr[i]);
      frontValue = (frontValue * arr[i]) / Gcd;
    }

    return frontValue;
  }

  public int gcd(int a, int b){
    while(b != 0 ){
      int r = a % b;
      a = b;
      b = r;
    }
    return a;
  }
}


//1. 0번 인덱스 1번인덱스의 최대공약수를 구함.
//큰수를 낮은 수로 나누고 그 나머지를 작은 수로 계속 나눠
// 나머지가 0이 되는 수가 최대공약수.
//2. 0,1 인덱스의 값을 곱하고 최대공약수로 나눈다. -> LCM1
//LCM1과 2번 인덱스의 최대 공약수를 구함
//LCM1과 2번 인덱스 값을 곱하고 이를 최대공약수로 나눔 -> LCM2
//배열 끝까지 반복.


//로직
//1. 배열 정리 sort로 오름차순 정리. <- 필요없음. 1차 시행 후 알아서 B가 앞으로 옴. 개신박.
//2 1번 인덱스랑 0번 인댁스랑 를 %로 나눠서 나머지를 임시 변수에 할당
// 나머지를 다시 0번 인덱스로 나눔 나머지가 0이 될때 까지 반복.
//이후 1번인덱스 값 *0번 인덱스 값을 마지막에 나온 최대 공약수로 나눈다.
//이를 인댁스 끝까지 반복
//(revers로 뒤집어서 뒤에서부터 계산 할까 했지만 하나마나인거 같아서 그냥 진행 )
