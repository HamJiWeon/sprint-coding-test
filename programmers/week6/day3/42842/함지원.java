class Solution {
    public int[] solution(int brown, int yellow) {

        int total = brown + yellow;
        int weight = 0;

        for (int height = 3; height <= Math.sqrt(total); height++) {
            if (total % height == 0) weight = total / height;

            if ((weight - 2) * (height - 2) == yellow) return new int[]{weight, height};
        }

        return new int[]{0, 0};
    }
}