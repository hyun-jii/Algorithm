class Solution {
  public String solution(int n) {
      String answer = "";
      String s = "수박";
      StringBuilder sb = new StringBuilder();
      int i=0;
      
      for(i=0; i<n; i++)
      {
          //홀수번쨰 자리에는 "수" 붙이기
          if(i%2 == 0)
          {
              sb.append(s.substring(0,1));
          }
          //짝수번째 자리에는 "박" 붙이기
          else if(i%2 != 0)
          {
              sb.append(s.substring(1,2));          
          }
      }
      
      //StringBuilder 타입을 String 타입으로 변환
      answer = sb.toString();

      return answer;
  }
}