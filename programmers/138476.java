import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();

        // 같은 크기의 귤 분류
        for(int size : tangerine) {
            map.put(size, map.getOrDefault(size, 0) + 1);
        }

        // value 값으로 내림차순 정렬
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        int answer = 0;
        for(int key : keySet) {
            if(k - (map.get(key)) <= 0) {
                answer++;
                break;
            }
            k -= map.get(key);
            answer++;
        }

        return answer;
    }
}
