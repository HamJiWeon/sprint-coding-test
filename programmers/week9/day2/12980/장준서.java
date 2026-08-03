import java.util.*;

public class Solution {

  public int solution(int n) {

    String b = Integer.toBinaryString(n);

    int bCount = 0;

    for (char c : b.toCharArray()) {
      if (c == '1') {
        bCount += 1;
      }
    }

    return bCount;
  }
}