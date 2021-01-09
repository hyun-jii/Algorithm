/*
테스트 1 〉	통과 (0.50ms, 53.3MB)
테스트 2 〉	통과 (0.39ms, 52.4MB)
테스트 3 〉	통과 (0.40ms, 53.3MB)
테스트 4 〉	통과 (0.45ms, 54.2MB)
테스트 5 〉	통과 (0.44ms, 53.1MB)
테스트 6 〉	통과 (0.55ms, 52.9MB)
테스트 7 〉	통과 (0.46ms, 52.4MB)
테스트 8 〉	통과 (0.37ms, 53.1MB)
테스트 9 〉	통과 (0.49ms, 52.2MB)
테스트 10 〉	통과 (0.50ms, 53.2MB)
테스트 11 〉	통과 (0.34ms, 52MB)
테스트 12 〉	통과 (0.46ms, 53.6MB)
테스트 13 〉	통과 (0.47ms, 52.5MB)
테스트 14 〉	통과 (0.44ms, 52.4MB)
테스트 15 〉	통과 (0.47ms, 52MB)
테스트 16 〉	통과 (0.46ms, 52.9MB)
테스트 17 〉	통과 (0.52ms, 53.1MB)
테스트 18 〉	통과 (0.52ms, 53MB)
테스트 19 〉	통과 (0.49ms, 52.1MB)
테스트 20 〉	통과 (0.44ms, 53MB)
테스트 21 〉	통과 (0.55ms, 52.9MB)
테스트 22 〉	통과 (0.57ms, 52.5MB)
테스트 23 〉	통과 (0.47ms, 52.1MB)
테스트 24 〉	통과 (1.00ms, 52MB)
테스트 25 〉	통과 (1.43ms, 52.5MB)
테스트 26 〉	통과 (1.32ms, 53.6MB)
테스트 27 〉	통과 (1.62ms, 52.5MB)
테스트 28 〉	통과 (0.43ms, 52.3MB)
테스트 29 〉	통과 (0.44ms, 51.8MB)
테스트 30 〉	통과 (0.33ms, 52.8MB)
테스트 31 〉	통과 (0.47ms, 52.3MB)
테스트 32 〉	통과 (0.43ms, 54.1MB)
효율성  테스트
테스트 1 〉	통과 (156.85ms, 65.4MB)
테스트 2 〉	통과 (72.94ms, 63MB)
테스트 3 〉	통과 (279.28ms, 66.4MB)
테스트 4 〉	통과 (249.54ms, 66.2MB)
테스트 5 〉	통과 (202.83ms, 65.3MB)
테스트 6 〉	통과 (129.00ms, 65.5MB)
테스트 7 〉	통과 (253.03ms, 65.4MB)
테스트 8 〉	통과 (148.74ms, 65.8MB)
*/
import java.util.*;

class Solution {
    public int solution(int[] food_times, long k) {
        int n = food_times.length;
        int[] sortFood = food_times.clone();
        Arrays.sort(sortFood);
        
        int food = n;
        int idx = 0, num = 0;
        long time = 0;
        while (time + food <= k) {
            time += food;
            num++;
            for (int i = idx; i < n; i++) {
                if(sortFood[i] != num) {
                    break;
                }
                idx++;
                food--;
            }
            if (food == 0) {
                return -1;
            }
        }

        long count = k - time + 1;
        for (int i = 0; i < n; i++) {
            if (food_times[i] - num > 0) {
                count--;
                if (count == 0) {
                    return i+1;
                }
            }
        }
        return -1;
    }
}
