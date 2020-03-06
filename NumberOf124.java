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