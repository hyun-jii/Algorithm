/*
테스트 1 〉	통과 (0.08ms, 52.4MB)
테스트 2 〉	통과 (0.07ms, 52.7MB)
테스트 3 〉	통과 (0.07ms, 51.7MB)
테스트 4 〉	통과 (0.07ms, 55.3MB)
테스트 5 〉	통과 (0.05ms, 52.8MB)
테스트 6 〉	통과 (0.02ms, 52.7MB)
테스트 7 〉	통과 (0.02ms, 52.8MB)
테스트 8 〉	통과 (0.09ms, 52.7MB)
테스트 9 〉	통과 (0.07ms, 53.9MB)
테스트 10 〉	통과 (0.34ms, 52.5MB)
테스트 11 〉	통과 (67.25ms, 84.1MB)
테스트 12 〉	통과 (0.31ms, 53.3MB)
테스트 13 〉	통과 (0.63ms, 52.3MB)
테스트 14 〉	통과 (0.91ms, 52.3MB)
테스트 15 〉	통과 (1.13ms, 53MB)
테스트 16 〉	통과 (1.62ms, 52.8MB)
테스트 17 〉	통과 (0.02ms, 52.8MB)
테스트 18 〉	통과 (3.32ms, 52.8MB)
테스트 19 〉	통과 (4.06ms, 53.3MB)
테스트 20 〉	통과 (4.43ms, 52.9MB)
*/
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int CACHE_HIT = 1;
        int CACHE_MISS = 5;
        
        int result = 0;
        List<String> list = new ArrayList<>();
        
        if(cacheSize == 0) {
            return cities.length * CACHE_MISS;
        }
        
        for(String city : cities) {
            city = city.toLowerCase();
            
            if(list.contains(city)) {
                list.remove(city);
                list.add(city);
                result += CACHE_HIT;
            }
            else {
                list.add(city);
                if(list.size() > cacheSize) {
                    list.remove(0);
                }
                result += CACHE_MISS;
            }
        }
        
        return result;
    }
}
