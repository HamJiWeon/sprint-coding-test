import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

class Solution {

  public int[] solution(int[] progresses, int[] speeds) {
    int[] answer = {};

    Stack<Integer> stack1 = new Stack<>();//작업 할당
    Stack<Integer> stack2 = new Stack<>();//완료 안된 작업 임시 저장
    ArrayList<Integer> speed = new ArrayList<>();// 작업 역순 변환 + 스피드 저장
    ArrayList<Integer> counter = new ArrayList<>();//리턴 값 저장

    for (Integer i : progresses) {
      speed.add(i); //리스트 한 번 재홯용. 배열 역순 변화
    }
    Collections.reverse(speed);

    for (Integer i : speed) {
      stack1.push(i); //작업 역순으로 스택1에 할당
    }

    speed.clear(); //스피드옹 리스트 초기화
    for (Integer i : speeds) {
      speed.add(i); //스피드를 리스트로 관리
    }

    int startIndex = 0;

    while (!stack1.isEmpty() || !stack2.isEmpty()) {

      while (!stack2.isEmpty()) {
        stack1.push(stack2.pop());
      }

      int count = 0;
      int index = startIndex;

      while (!stack1.isEmpty()) {
        int i1 = stack1.pop() + speed.get(index);
        index++;

        if (i1 >= 100 && stack2.isEmpty()) {
          count++;
          startIndex++;

        } else {
          stack2.push(i1);
        }
      }
      if (count > 0) {
        counter.add(count);
      }

    }

    answer = counter.stream().mapToInt(Integer::intValue).toArray();
//    answer = counter.stream() -> 참고용 람다식
//        .mapToInt(i -> i.intValue())
//        .toArray();


    return answer;
  }
}