/*
테스트 1 〉	통과 (0.09ms, 52.1MB)
테스트 2 〉	통과 (0.07ms, 53MB)
테스트 3 〉	통과 (0.07ms, 52.8MB)
테스트 4 〉	통과 (0.09ms, 52.2MB)
테스트 5 〉	통과 (0.05ms, 52.3MB)
테스트 6 〉	통과 (0.06ms, 53.4MB)
테스트 7 〉	통과 (0.08ms, 52.8MB)
테스트 8 〉	통과 (0.08ms, 52.1MB)
테스트 9 〉	통과 (0.05ms, 52.2MB)
테스트 10 〉	통과 (0.05ms, 51.9MB)
테스트 11 〉	통과 (0.04ms, 52.2MB)
테스트 12 〉	통과 (0.86ms, 52.8MB)
테스트 13 〉	통과 (0.08ms, 52.1MB)
테스트 14 〉	통과 (0.06ms, 52.4MB)
테스트 15 〉	통과 (0.06ms, 51.9MB)
테스트 16 〉	통과 (0.05ms, 53.1MB)
테스트 17 〉	통과 (0.09ms, 53.2MB)
테스트 18 〉	통과 (0.06ms, 52.4MB)
테스트 19 〉	통과 (0.05ms, 52.9MB)
테스트 20 〉	통과 (0.05ms, 52.1MB)
테스트 21 〉	통과 (0.08ms, 53MB)
테스트 22 〉	통과 (0.05ms, 52.5MB)
테스트 23 〉	통과 (0.06ms, 52MB)
테스트 24 〉	통과 (0.07ms, 52MB)
테스트 25 〉	통과 (0.08ms, 51.7MB)
테스트 26 〉	통과 (0.11ms, 52.7MB)
테스트 27 〉	통과 (0.04ms, 52.2MB)
테스트 28 〉	통과 (0.07ms, 52.7MB)
*/
import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothesMap = new HashMap<String, Integer>();

        for(int i =0; i<clothes.length; i++){
            clothesMap.put(clothes[i][1], clothesMap.getOrDefault(clothes[i][1], 0)+1);
        }

        Set<String> keySet = clothesMap.keySet();
        
        for(String key : keySet) {
        	answer *= clothesMap.get(key)+1; 
        }
        return answer-1;
    }
}
