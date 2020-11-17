/*
테스트 1 〉	통과 (0.02ms, 53.2MB)
테스트 2 〉	통과 (0.01ms, 52.9MB)
테스트 3 〉	통과 (0.04ms, 52.1MB)
테스트 4 〉	통과 (0.01ms, 52MB)
테스트 5 〉	통과 (0.01ms, 52.4MB)
테스트 6 〉	통과 (0.02ms, 52.1MB)
테스트 7 〉	통과 (0.04ms, 52.5MB)
테스트 8 〉	통과 (0.04ms, 51.6MB)
테스트 9 〉	통과 (0.04ms, 51.8MB)
테스트 10 〉	통과 (0.05ms, 51.5MB)
테스트 11 〉	통과 (0.02ms, 52.9MB)
테스트 12 〉	통과 (0.01ms, 52.5MB)
테스트 13 〉	통과 (0.02ms, 52.2MB)
*/

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<=yellow; i++) {
            if(yellow%i == 0) {
                // 가로길이 * 2
                int width = (yellow/i + 2)*2;
                // yellow 세로길이 * 2
                int height = i*2;
                if(width + height == brown) {
                    answer[0] = yellow/i + 2;
                    answer[1] = i+2;
                     break;
                }
            }
        }   
        return answer;
    }
}
