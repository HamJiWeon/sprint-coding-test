
//결론 yello랑 brwon은 알고있는 수이다.
//전체 타일수를 구한다. yellow + brwon = allT
//allT의 약수를 찾고 약수가 나눈 값보다 크거나, 같은 경우를 리턴.
//+ 최적화 break 추가로 불필요한 반복을 차단.

class Solution {

  public int[] solution(int brown, int yellow) {
    int[] answer = {};

    int allT = brown + yellow;
    int[] wh = new int[2];
    for (int w = 1; w < allT; w++) {
      int h = 0;
      if (allT % w == 0) {
        h = allT / w;
      }

      if (w >= h && (w - 2) * (h - 2) == yellow) {
        wh[0] = w;
        wh[1] = h;
        break;
      }
    }
    return wh;
  }
}

// 가로 길이 = w , 세로길이=
// w >= h
//
//노란 타일 = yellow = (w-2 ) * (h-2)
// 전체 타일 = allT = w*h
//갈색 타일 = brown = allT - yellow
//구하고자 하는 것: 가로 세로를 담는 배열.
//-> 결국 전체 값을 구해서 약수를 찾고,
// 약수가 나눈 값과 같거나, 약수가 나눈 값보다 큰 경우만을 리턴.
// 반대로 약수가 나눈 값보다 낮은 경우를 리턴하지 않는 것도 가능.
//
//결론 yello랑 brwon은 알고있는 수이다.
//전체 타일수를 구한다. yellow + brwon = allT
//allT의 약수를 찾고 약수가 나눈 값보다 크거나, 같은 경우를 리턴.
