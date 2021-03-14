import java.util.Arrays;

class Solution {
  public int[] solution(int[] arr, int divisor) {
      
      int i=0;
      int j=0;
      int count=0;
      
      //배열의 크기를 구하기 위해 divisor 나누어지는 배열의 원소 카운트
      for(i=0; i<arr.length; i++) 
      {
          if(arr[i]%divisor == 0)
          {
             count++;
          }
      }
      
      //count가 0이라면, divisor로 나누어지는 배열의 원소가 한개도 없다면
      if(count == 0)
      {
          // 배열에 -1을 넣어 반환
          int[] answer = {-1};
          return answer;
      }
      
      //count 크기의 answer 배열 선언
      int[] answer = new int[count];

      //divisor로 나누어진 원소들을 answer 배열에 넣어준다
      for(i=0; i<arr.length; i++) 
      {
          if(arr[i]%divisor == 0)
          {
              answer[j] = arr[i];
              j++;
           }   
      }
          
      //answer배열ㅇ르 오름차순으로 정렬
      Arrays.sort(answer);
      

      return answer;
  }
}
