class Solution {

  public int[] solution(int n, String[] words) {

    int count1 = 0;
    int count2 = 0;

    for (int i = 1; i < words.length; i++) {
      if (words[i].charAt(0)
          != words[i - 1].charAt(words[i - 1].length() - 1)) {
        count1 = i;
        break;
      }
    }

    for (int i = 1; i < words.length; i++) {
      for (int j = 0; j < i; j++) {
        if (words[i].equals(words[j])) {
          count2 = i;
          break;
        }
      }
      if (count2 != 0)
        break;
    }

    int value = (count1 != 0 && count2 != 0)
        ? Math.min(count1, count2) : Math.max(count1, count2);

    int num = 0;
    int turn = 0;

    if (value != 0) {
      num = value % n + 1;
      turn = value / n + 1;
    }

    int[] answer = {num, turn};

    return answer;
  }
}