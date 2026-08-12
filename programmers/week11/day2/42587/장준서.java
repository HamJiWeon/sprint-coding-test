import java.util.*;

class Solution {

  public int solution(int[] priorities, int location) {

    ArrayList<int[]> prioritiesLs = new ArrayList<>();
    int[][] prioritiesArr = new int[priorities.length][2];

    for (int i = 0; i < priorities.length; i++) {
      prioritiesLs.add(new int[]{i, priorities[i]});
    }

//    for (int i = 0; i < priorities.length; i++) {
//    prioritiesArr[i] = new int[]{i, priorities[i]};
//    }
//    prioritiesLs.addAll(Arrays.asList(prioritiesArr));

    int count = 0;

    while (prioritiesLs.size() > 0) {
      int locationValue = -1;
      int[] current = prioritiesLs.get(0);
      boolean plug = false;

      for (int i = 0; i < prioritiesLs.size(); i++) {

        if (prioritiesLs.get(i)[1] > current[1]) {
          plug = true;
          break;
        }
      }
      if (plug) {
        prioritiesLs.add(prioritiesLs.remove(0));
      } else {
        locationValue = prioritiesLs.get(0)[0];
        prioritiesLs.remove(0);
        count++;
      }

      if (locationValue == location) {
        return count;
      }

    }
    return count;
  }

}