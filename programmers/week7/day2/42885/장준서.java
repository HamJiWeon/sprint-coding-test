import java.util.Arrays;
class Solution {
  public int solution(int[] people, int limit) {
    int count = 0;

    Arrays.sort(people);
    int length = people.length;

    int j = length - 1;
    //-1 안해서 에러남 (클로드가 도와줌 ㅠ.ㅠ 인덱스 0번 부터 시작하니까..)

    for(int i = 0; i<length; i++){
      count++;
      int sum = people[i] + people[j];
      if(sum > limit) i--;
      j--;
      length--;
    }
    return count;
  }
}
