import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();

        // for(int q: priorities){
        //     queue.add(q); //인덱스를 넣어야하기에 x
        //}

        /*
            priorities[0] = 2
            priorities[1] = 1
            priorities[2] = 3
            priorities[3] = 2
        */
        for (int i = 0; i < priorities.length; i++) {  //프로세스 -1
            queue.add(i);
            // System.out.println(queue);
        }

        while (!queue.isEmpty()) { //큐가 빌때 동안
            //이때 큐가, [0,1,2,3] ->poll->[1,2,3]
            int now = queue.poll(); //now = 0 ->1 ->2

            boolean rank = false;

            for (int index : queue) { //index[1,2,3,4] -> [2,3,4] -> [3,4]
                //인덱스 위치에 있는 값이, 현재 값보다 높으면 true
                if (priorities[index] > priorities[now]) {
                    //prirorities[2, 1, 3, 2]
                    //priorities[1] > prirorities[0]
                    //1>2 ->false
                    //priorities[2]>priorities[0]
                    //3>2 ->true
                    //priorities[2]>priorities[1]
                    //3>1
                    //prirorities[3]>prirorities[2]
                    //2>3
                    rank = true;
                    break;
                }
            }

            if (rank) {
                queue.add(now); //[1,2,3,0] ->[2,3,0,1]
            } else {
                //현재 rank0 = false
                //answer++;
                answer++;

                if (now == location) {
                    //now = 0 == location = 2
                    //now = 2 == location
                    //false
                    return answer;
                }
            }
        }

        return answer;
    }
}