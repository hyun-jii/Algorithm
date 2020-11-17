/*
테스트 1 〉	통과 (0.68ms, 52.9MB)
테스트 2 〉	통과 (1.20ms, 53MB)
테스트 3 〉	통과 (0.74ms, 53.9MB)
테스트 4 〉	통과 (0.43ms, 52.3MB)
테스트 5 〉	통과 (0.55ms, 52.1MB)
테스트 6 〉	통과 (0.75ms, 52.9MB)
테스트 7 〉	통과 (0.49ms, 52.9MB)
테스트 8 〉	통과 (0.91ms, 52.1MB)
테스트 9 〉	통과 (0.57ms, 52.8MB)
테스트 10 〉	통과 (0.75ms, 52.3MB)
테스트 11 〉	통과 (0.96ms, 52MB)
테스트 12 〉	통과 (0.60ms, 51.9MB)
테스트 13 〉	통과 (0.84ms, 52.5MB)
테스트 14 〉	통과 (0.55ms, 51.8MB)
테스트 15 〉	통과 (0.58ms, 53.2MB)
테스트 16 〉	통과 (0.71ms, 52.7MB)
테스트 17 〉	통과 (1.01ms, 51.9MB)
테스트 18 〉	통과 (0.59ms, 52.6MB)
테스트 19 〉	통과 (0.95ms, 52.5MB)
테스트 20 〉	통과 (0.67ms, 53MB)
*/
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int order = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int doc : priorities) {
            q.add(doc);
        }
    
        while(!q.isEmpty()) {
            for(int i=0; i<priorities.length; i++) {
                if(priorities[i] == q.peek()) {
                    order++;
                    q.poll();
                    if(i == location) {
                        return order;
                    }
                }
            }    
        }
        return order;
    }
}
