/*
테스트 1 〉	통과 (3.48ms, 52.9MB)
테스트 2 〉	통과 (3.09ms, 52.8MB)
테스트 3 〉	통과 (3.07ms, 53.1MB)
테스트 4 〉	통과 (3.31ms, 52.7MB)
테스트 5 〉	통과 (3.16ms, 53.1MB)
테스트 6 〉	통과 (8.49ms, 52.9MB)
테스트 7 〉	통과 (12.88ms, 52.5MB)
테스트 8 〉	통과 (6.21ms, 52.5MB)
테스트 9 〉	통과 (10.86ms, 55.1MB)
*/
import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int result = numbers[i] + numbers[j];
                if(!answer.contains(result)) {
                    answer.add(result);
                }
            }
        }
        return answer.stream().sorted().mapToInt(i->i).toArray();
    }
}
