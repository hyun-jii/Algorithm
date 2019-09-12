class Solution {
    public String solution(String s) {
        String answer = "";

        //문자열의 길이가 홀수라면
        if(s.length()%2 != 0)
        {
            //가운데 글자의 인덱스를 구한다
            int index = s.length()/2;
            //문자열의 해당 인덱스 부분만 자른다
            answer = s.substring(index,index+1);
            System.out.println(answer);
        }
        //문자열의 길이가 짝수라면
        if(s.length()%2 == 0)
        {
            //가운데 글자의 인덱스를 구한다
            int index = s.length()/2;
            //문자열의 해당 인덱스 부분만 자른다. 짝수는 두글자
            answer = s.substring(index-1,index+1);
            System.out.println(answer);
        }

        return answer;
    }

}