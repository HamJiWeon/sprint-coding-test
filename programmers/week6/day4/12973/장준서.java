class Solution {

  public int solution(String s) {

    Stack<Character> stack = new Stack<>();
    //stack 생성

          for (Character c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {//스태틱 비어있는지 + 맨위 값이 c와 같은지 비교.
              stack.pop();
            } else {
              stack.push(c); //<- 1차 시행은 !stack.isEmpty()가 false 바로 stack.push(c)실행.
            }
          }
          if (stack.isEmpty()){// 스태틱 값 유무 확인
            return 1;
          }return 0;
        }
      }