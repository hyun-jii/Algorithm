// 평균 속도 0.2ms 평균 메모리 68MB  
import java.util.*;

class Solution {
    public Queue<Integer> solution(int[] progresses, int[] speeds) {
        Queue<Integer> leftDays = new LinkedList<>();
        Queue<Integer> result = new LinkedList<>();
    
        for(int i=0; i<progresses.length; i++) {
            int left = 100 - progresses[i];   
            int leftDay = left / speeds[i];
            
            if(left%speeds[i] != 0) {
                leftDay++;
            }
            leftDays.add(leftDay);
        }

        int count = 1;
        int deploy = leftDays.remove();
        
        while(!leftDays.isEmpty()) {
            if(deploy >= leftDays.element()) {
                count++;
                leftDays.remove();
            }
            else if(deploy < leftDays.element()) {
                result.add(count);
                count = 1;
                deploy = leftDays.remove();
            }
            
            if(leftDays.isEmpty()) {
                result.add(count);
            }           
        }     
        return result;
    }
}
