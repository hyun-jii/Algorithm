/*
테스트 1 〉	통과 (2.29ms, 53.1MB)
테스트 2 〉	통과 (2.46ms, 52.1MB)
테스트 3 〉	통과 (2.72ms, 52.5MB)
테스트 4 〉	통과 (2.96ms, 52.2MB)
테스트 5 〉	통과 (3.30ms, 52.6MB)
테스트 6 〉	통과 (4.95ms, 52.6MB)
테스트 7 〉	통과 (5.59ms, 52.2MB)
테스트 8 〉	통과 (22.26ms, 57.6MB)
테스트 9 〉	통과 (13.50ms, 56.5MB)
테스트 10 〉	통과 (14.96ms, 57.7MB)
테스트 11 〉	통과 (7.82ms, 53.6MB)
테스트 12 〉	통과 (9.43ms, 53MB)
테스트 13 〉	통과 (20.09ms, 55.9MB)
테스트 14 〉	통과 (15.03ms, 54.2MB)
테스트 15 〉	통과 (16.31ms, 55.3MB)
테스트 16 〉	통과 (7.39ms, 54.8MB)
테스트 17 〉	통과 (5.56ms, 57.1MB)
테스트 18 〉	통과 (5.31ms, 54.2MB)
테스트 19 〉	통과 (3.01ms, 52.8MB)
테스트 20 〉	통과 (8.73ms, 56.2MB)
*/
// 처음에 문제 잘못 이해해서 거지같다..다시풀예정

import java.util.*;

class Solution {
    static Map<String, Integer> courseMenu = new HashMap<>();
    
    public String[] solution(String[] orders, int[] course) {
        
        for(int i=0; i<orders.length; i++) {
            String[] menu = new String[orders[i].length()];
            for(int j=0; j<orders[i].length(); j++) {
                menu[j] = orders[i].substring(j,j+1);
            }
            
            boolean[] visited = new boolean[menu.length];      
            for(int r = 0; r < course.length ; r++) {
                Arrays.sort(menu);
                comb(menu, visited, 0, course[r]);
            }
        }
        
        List<String> list = new ArrayList<>();
        for(int i=0; i<course.length; i++) {
            int max = 0;
            for(String key : courseMenu.keySet()) {
                if(key.length() == course[i]) {
                    max = Math.max(max, courseMenu.get(key));
                }
            }
            for(String key : courseMenu.keySet()) {
                if(key.length() == course[i] && courseMenu.get(key) == max && max > 1) {
                    list.add(key);
                }
            }
        }
        String[] answer = new String[list.size()];
        int size = 0;
        for(String i : list) {
            answer[size++] = i;
        }
        Arrays.sort(answer);
        
        return answer;
    }
    
    public static void comb(String[] arr, boolean[] visited, int depth, int r) {
        if(r == 0) {
            String result = "";
            for(int i=0; i<arr.length; i++) {
                if(visited[i] == true) {
                    result += arr[i];
                }
            }
            courseMenu.put(result, courseMenu.getOrDefault(result, 0) +1);
            return;
        }
        if(depth == arr.length) {
            return;
        } else {
            visited[depth] = true;
            comb(arr, visited, depth + 1, r - 1);
 
            visited[depth] = false;
            comb(arr, visited, depth + 1, r);
        }
    }
}
