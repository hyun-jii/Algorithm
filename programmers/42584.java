/*
테스트 1 〉	통과 (0.02ms, 52.5MB)
테스트 2 〉	통과 (0.03ms, 52.6MB)
테스트 3 〉	통과 (0.23ms, 52.7MB)
테스트 4 〉	통과 (0.22ms, 51.8MB)
테스트 5 〉	통과 (0.32ms, 53.1MB)
테스트 6 〉	통과 (0.02ms, 52MB)
테스트 7 〉	통과 (0.14ms, 52.1MB)
테스트 8 〉	통과 (0.21ms, 53MB)
테스트 9 〉	통과 (0.02ms, 53MB)
테스트 10 〉	통과 (0.28ms, 53.4MB)
효율성  테스트
테스트 1 〉	통과 (18.88ms, 74.7MB)
테스트 2 〉	통과 (15.84ms, 67.2MB)
테스트 3 〉	통과 (21.74ms, 73.8MB)
테스트 4 〉	통과 (17.23ms, 71.7MB)
테스트 5 〉	통과 (12.62ms, 62.2MB)
*/
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++) {
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
                answer[i] = j - i;
            }
        }
        
        return answer;
    }
}
