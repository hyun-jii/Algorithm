class Solution {
  public String solution(String phone_number) {
      String answer = "";
      StringBuilder str = new StringBuilder(); 
      
      int length = phone_number.length();
      
      //뒤의 4자리를 제외한 * 표시
      for(int i=0; i< (length-4); i++)
      {
          str.append("*");
      }
      
      //뒤의 4자리 추출
      String number = phone_number.substring(length-4);

      str.append(number);
  
      answer = str.toString();
      
      return answer;
  }
}