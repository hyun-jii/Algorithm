/*
테스트 1 〉	통과 (0.77ms, 53.8MB)
테스트 2 〉	통과 (0.90ms, 52.4MB)
테스트 3 〉	통과 (0.89ms, 52.3MB)
테스트 4 〉	통과 (0.81ms, 54.3MB)
테스트 5 〉	통과 (0.99ms, 52.6MB)
테스트 6 〉	통과 (0.94ms, 52.9MB)
테스트 7 〉	통과 (0.67ms, 52.1MB)
테스트 8 〉	통과 (0.57ms, 53MB)
테스트 9 〉	통과 (0.57ms, 51.9MB)
테스트 10 〉	통과 (0.72ms, 52.9MB)
테스트 11 〉	통과 (0.97ms, 53MB)
테스트 12 〉	통과 (0.56ms, 52.1MB)
테스트 13 〉	통과 (0.96ms, 53.1MB)
테스트 14 〉	통과 (0.93ms, 52.2MB)
테스트 15 〉	통과 (0.78ms, 52.5MB)
테스트 16 〉	통과 (0.44ms, 52.8MB)
*/
import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=0; i<citations.length; i++) {  
            if(citations.length - i >= citations[i]) {
                answer = citations[i];
            }
            else  {
                answer = Math.max(citations.length - i, answer);
            }
        }
        return answer;
    }
}
