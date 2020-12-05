/*
테스트 1 〉	통과 (0.71ms, 55.5MB)
테스트 2 〉	통과 (0.68ms, 53.2MB)
테스트 3 〉	통과 (0.71ms, 52MB)
테스트 4 〉	통과 (0.63ms, 52MB)
테스트 5 〉	통과 (0.80ms, 51.9MB)
테스트 6 〉	통과 (0.72ms, 52.3MB)
*/
import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> descending = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> ascending = new PriorityQueue<>();
        
        for(int i=0; i<operations.length; i++) {
            String[] array = operations[i].split(" ");
            int number = Integer.parseInt(array[1]);
            if(array[0].equals("I")) {
                descending.add(number);
                ascending.add(number);
            }
            else {
                if(descending.isEmpty() || ascending.isEmpty()) {
                    continue;
                }
                if(number == 1) {
                    int max = descending.peek();
                    descending.remove(max);
                    ascending.remove(max);
                }
                else {
                    int min = ascending.peek();
                    descending.remove(min);
                    ascending.remove(min);
                }    
            }
        }
        
        if(descending.isEmpty() || ascending.isEmpty()) {
            return answer;
        }
        else {
            answer[0] = descending.peek();
            answer[1] = ascending.peek();
        }
        
        return answer;
    }
}
