/*
테스트 1 〉	통과 (1.15ms, 52.1MB)
테스트 2 〉	통과 (12.69ms, 53.8MB)
테스트 3 〉	통과 (0.13ms, 53.6MB)
테스트 4 〉	통과 (9.56ms, 54.8MB)
테스트 5 〉	통과 (31.00ms, 59.3MB)
테스트 6 〉	통과 (18.90ms, 54.4MB)
테스트 7 〉	통과 (1.88ms, 54.1MB)
테스트 8 〉	통과 (0.57ms, 53.9MB)
테스트 9 〉	통과 (4.80ms, 53.4MB)
테스트 10 〉	통과 (0.71ms, 52.8MB)
테스트 11 〉	통과 (0.14ms, 51.9MB)
테스트 12 〉	통과 (1.19ms, 53MB)
테스트 13 〉	통과 (4.22ms, 52.3MB)
테스트 14 〉	통과 (0.10ms, 52MB)
*/

import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        Queue<Integer> list = new LinkedList<>();
        int max = 0;
        
        for(int truck : truck_weights) {
            while(true) {
            if(list.isEmpty()) {
                list.offer(truck);
                max += truck;
                time++;
                break;
            }
            else if(list.size() == bridge_length) {
                max -= list.poll();
            }
            else {
                if((max + truck) > weight) {
                    list.add(0);
                    time++;
                }
                else {
                    list.add(truck);
                    max += truck;
                    time++;
                    break;
                }    
            }            
        }    
        }

        return time + bridge_length;
    }
}
