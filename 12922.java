class Solution {
  public String solution(int n) {
      String answer = "";
      String s = "����";
      StringBuilder sb = new StringBuilder();
      int i=0;
      
      for(i=0; i<n; i++)
      {
          //Ȧ������ �ڸ����� "��" ���̱�
          if(i%2 == 0)
          {
              sb.append(s.substring(0,1));
          }
          //¦����° �ڸ����� "��" ���̱�
          else if(i%2 != 0)
          {
              sb.append(s.substring(1,2));          
          }
      }
      
      //StringBuilder Ÿ���� String Ÿ������ ��ȯ
      answer = sb.toString();

      return answer;
  }
}