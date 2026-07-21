class Solution {
  public int solution(int n) {
    int answer = 0;

    int[] arr = new int[n+1];

    int arrLength = arr.length;

    arr[0] = 0;
    arr[1] = 1;

    for(int i = 2; i < arrLength; i++){
      arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
    }
    System.out.print(arr[n]);

    return answer = arr[n];
  }
}
/*
class Solution {
    int[] memo;

    public int solution(int n) {
        memo = new int[n + 1];
        return dfs(n);
    }

    private int dfs(int current) {
        if (current == 0) return 0;
        if (current == 1) return 1;

        if (memo[current] != 0) {
            return memo[current];
        }

        return memo[current] = (dfs(current - 1) + dfs(current - 2)) % 1234567;
    }
}
 */

