import java.util.*;

class Solution {

  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    Queue<Integer> bridge = new LinkedList<>();
    //선입선출 다리

    for (int i = 0; i < bridge_length; i++) {
      bridge.add(0); // 다리 길이 만큼 0으로 채우기.
    }

    int time = 0; //시간
    int currentWeight = 0; //현제 다리위 트럭 무게
    int truckNb = 0; //truck_weights에 인덱스 번호

    while (truckNb < truck_weights.length) {
      time++;
      currentWeight -= bridge.poll(); //브릿지 맨 앞에 트럭을 현제 무게에서 빼기.

      if (currentWeight + truck_weights[truckNb] <= weight) {
        //다리 위 무게+대기 중인 트럭 한대 무게가 weight이하면 반복.

        bridge.add(truck_weights[truckNb]);//다리에 트럭 올림.
        currentWeight += truck_weights[truckNb];//현제 무게 트럭 더함
        truckNb++; // 대기중인 트럭 번호 한칸 미루기
      } else {
        bridge.add(0);//트럭 무게가 weight 초과면 빈칸 0을 할당해서 앞으로 밀기.
      }
    }

    return time + bridge_length;
    //마지막 트럭이 다리에 올라가면 반복문이 멈춤
    //그래서 마지막 트럭이 다리에 올라가 신점을 기준으로 마지막 트럭이 다리를 건너가는 시간
    // 다리의 길이를 더해줘서 리턴
  }
}