import java.util.Vector;
import java.util.Collections;

class Solution {
  public String solution(String s) {
      String answer = "";
      
      Vector<String> v = new Vector<String>();
      
      //입력받은 문자열 하나하나 잘라서 데이터 요소로 넣기
      for(int i=0; i<s.length(); i++)
      {
          v.add(s.substring(i,i+1));
      }
      
      // 내림차순 정렬
      Collections.sort(v, Collections.reverseOrder());
      
      for(String str : v)
      {
          answer += str;
      }
      
      return answer;
  }
}