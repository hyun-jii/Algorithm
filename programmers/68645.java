/*
테스트 1 〉	통과 (0.02ms, 53.5MB)
테스트 2 〉	통과 (0.02ms, 51.6MB)
테스트 3 〉	통과 (0.02ms, 52.2MB)
테스트 4 〉	통과 (0.47ms, 55.4MB)
테스트 5 〉	통과 (0.51ms, 54MB)
테스트 6 〉	통과 (0.51ms, 53.4MB)
테스트 7 〉	통과 (42.27ms, 113MB)
테스트 8 〉	통과 (39.32ms, 115MB)
테스트 9 〉	통과 (43.69ms, 114MB)
*/
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] snail = new int[n][n];
        
        int x = -1;
        int y = 0;
        int number = 1;
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                if(i%3 == 0) {
                    x++;
                }
                else if(i%3 == 1) {
                    y++;
                }
                else{
                    x--;
                    y--;
                }
                snail[x][y] = number++;    
            }
        }
        
        int index = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                answer[index++] = snail[i][j];
            }
        }
        
        return answer;
    }
}
