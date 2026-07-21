import java.util.HashSet;
import java.util.Set;

class Solution {
  public int solution(int[] elements) {

    int length = elements.length;
    int[] doubledArr = new int[length*2];

    Set<Integer> setSum = new HashSet<>();

    for(int i = 0; i<length*2; i++){
      doubledArr[i] = elements[i % length];
    }

    for(int i = 0; i < length; i++){
      int sum = 0;
      for(int j = 0; j < length; j++){
        sum += doubledArr[i+j];
        setSum.add(sum);
      }

    }


    return setSum.size();
  }
}