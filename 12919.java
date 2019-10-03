class Solution {
  public String solution(String[] seoul) {
      String answer="";
      //문자열 붙이기 위해 StringBuffer기반 인스턴스 생성
      StringBuffer st = new StringBuffer("김서방은 ");
      //Kim의 위치를 저장할 변수
      int index=0;
      //반복문을 위한 변수
      int i=0;
      //index 정수형 타입을 String으로 변환하기 위한 변수
      String s="";
      
      //Kim 의 위치를 찾아 index에 저장
      for(i=0; i<seoul.length; i++)
      {
          if(seoul[i].equals("Kim"))
              index=i;
      }
      //index를 String으로 변환
      s = Integer.toString(index);
      //문자열 붙이기
      st.append(s);
      st.append("에 있다");
      
      //StringBuffer를 String으로 변환
      answer = st.toString();

      return answer;
  }
}