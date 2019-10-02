class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_count=0;          //p의 개수를 저장할 변수
        int y_count=0;          //y의 개수를 저장할 변수
        
        
        for(int i=0; i<s.length(); i++)
        {
            //문자열을 하나하나 잘라서 비교한다(substring 이용)
            if(s.substring(i,i+1).equals("p") || s.substring(i,i+1).equals("P"))
                p_count++;      //p나 P일 경우 개수 카운트
            
            if(s.substring(i,i+1).equals("y") || s.substring(i,i+1).equals("Y"))
                y_count++;      //y나 Y일 경우 개수 카운트
        }      
        
        //p_count와 y_count의 개수가 다르다면 false 저장
        if(p_count != y_count)
            answer = false;
        
        return answer;
    }
}