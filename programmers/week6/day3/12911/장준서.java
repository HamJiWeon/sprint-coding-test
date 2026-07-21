class Solution {
  public int solution(int n) {
    int answer = 0;
    int nBinary = Integer.bitCount(n);
    int nextN = 0;
    double positiveInfinity = Double.POSITIVE_INFINITY;

    for(int i = 1; i<positiveInfinity; i++){
      nextN = n + i;

      int nextNBinary = Integer.bitCount(nextN);
      if(nextNBinary == nBinary){
        break;
      }


    }return nextN;

  }
}