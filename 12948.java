class Solution {
  public String solution(String phone_number) {
      String answer = "";
      StringBuilder str = new StringBuilder(); 
      
      int length = phone_number.length();
      
      //���� 4�ڸ��� ������ * ǥ��
      for(int i=0; i< (length-4); i++)
      {
          str.append("*");
      }
      
      //���� 4�ڸ� ����
      String number = phone_number.substring(length-4);

      str.append(number);
  
      answer = str.toString();
      
      return answer;
  }
}