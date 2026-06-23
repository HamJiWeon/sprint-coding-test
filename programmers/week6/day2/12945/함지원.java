class Solution {
    private int[] memo;

    public int solution(int n) {
        memo = new int[n + 1];
        return dfs(n);
    }

    public int dfs(int n) {
        if (n <= 2) return 1;
        if (memo[n] != 0) return memo[n];

        return memo[n] = (dfs(n - 1) + dfs(n - 2)) % 1234567;
    }
}