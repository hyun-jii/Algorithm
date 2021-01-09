/*
테스트 1 〉	통과 (0.04ms, 52.9MB)
테스트 2 〉	통과 (0.06ms, 51.9MB)
테스트 3 〉	통과 (0.04ms, 52.6MB)
테스트 4 〉	통과 (0.04ms, 52.8MB)
테스트 5 〉	통과 (0.05ms, 52.5MB)
테스트 6 〉	통과 (0.03ms, 52.7MB)
테스트 7 〉	통과 (0.05ms, 52MB)
테스트 8 〉	통과 (0.06ms, 52.2MB)
테스트 9 〉	통과 (0.05ms, 52.8MB)
테스트 10 〉	통과 (0.03ms, 52.3MB)
테스트 11 〉	통과 (0.05ms, 52.1MB)
테스트 12 〉	통과 (0.04ms, 52.4MB)
테스트 13 〉	통과 (0.04ms, 52.7MB)
테스트 14 〉	통과 (0.04ms, 52.5MB)
효율성  테스트
테스트 1 〉	통과 (0.03ms, 52.3MB)
테스트 2 〉	통과 (0.04ms, 52.1MB)
테스트 3 〉	통과 (0.06ms, 52MB)
테스트 4 〉	통과 (0.04ms, 52.3MB)
테스트 5 〉	통과 (0.05ms, 53MB)
테스트 6 〉	통과 (0.04ms, 51.7MB)
*/
class Solution {
  public String solution(int n) {
      
      StringBuilder sb = new StringBuilder();
      
      String[] answer = {"1","2","4"};
      
      while(n > 0)
      {
          n--;
          sb.append(answer[n%3]);
          n = n/3;
      }
      sb.reverse();
      
      return sb.toString();
  }
}
