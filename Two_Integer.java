class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      
      //a와 b가 같다면
      if(a==b)
          answer=a;     //answer에 a 저장
      
      //b가 a보다 크다면
      if(a<b)
      {
          //a부터 b까지 반복하여 누적 합을 구하여 저장
          for(int i=a; i<=b; i++)
              answer+=i;
      }
      //a가 b보다 크다면
      if(a>b)
      {
          //b부터 a까지 반복하여 누적 합을 구하여 저장
          for(int i=b; i<=a; i++)
              answer+=i;
      }

      return answer;
  }
}