class Solution {
  public String solution(String[] seoul) {
      String answer="";
      //���ڿ� ���̱� ���� StringBuffer��� �ν��Ͻ� ����
      StringBuffer st = new StringBuffer("�輭���� ");
      //Kim�� ��ġ�� ������ ����
      int index=0;
      //�ݺ����� ���� ����
      int i=0;
      //index ������ Ÿ���� String���� ��ȯ�ϱ� ���� ����
      String s="";
      
      //Kim �� ��ġ�� ã�� index�� ����
      for(i=0; i<seoul.length; i++)
      {
          if(seoul[i].equals("Kim"))
              index=i;
      }
      //index�� String���� ��ȯ
      s = Integer.toString(index);
      //���ڿ� ���̱�
      st.append(s);
      st.append("�� �ִ�");
      
      //StringBuffer�� String���� ��ȯ
      answer = st.toString();

      return answer;
  }
}