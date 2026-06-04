class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] array = Arrays.stream(arr)
                .filter(a -> a % divisor == 0)
                .sorted()
                .toArray();

        if(array.length==0) {
            int[] i = {-1};
            return i;
        }
        else return array;
  }
}
  