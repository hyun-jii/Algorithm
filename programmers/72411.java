import java.util.*;

class Solution {
    static Map<String, Integer> courseMenu = new HashMap<>();
    static List<String> list = new ArrayList<>();
    
    public String[] solution(String[] orders, int[] course) {
        
        for(int i=0; i<orders.length; i++) {
            String[] menu = new String[orders[i].length()];
            for(int j=0; j<orders[i].length(); j++) {
                menu[j] = orders[i].substring(j,j+1);
            }
            
            boolean[] visited = new boolean[menu.length];
            
            for(int r = 0; r < course.length ; r++) {
                comb(menu, visited, 0, course[r]);
            }
        }
        
        String[] answer = {};
        
        for(String i : list) {
            System.out.println(i);
        }
        
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
            map.put(result, map.getOrDefault(result, 0) +1);
            
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
