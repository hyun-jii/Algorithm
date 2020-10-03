/*
테스트 1 〉	통과 (0.05ms, 52.3MB)
테스트 2 〉	통과 (0.12ms, 52.6MB)
테스트 3 〉	통과 (0.09ms, 52.4MB)
테스트 4 〉	통과 (0.41ms, 52.5MB)
테스트 5 〉	통과 (0.31ms, 52.6MB)
테스트 6 〉	통과 (7.69ms, 62.8MB)
테스트 7 〉	통과 (29.00ms, 72.8MB)
테스트 8 〉	통과 (165.77ms, 344MB)
테스트 9 〉	통과 (35.38ms, 69.9MB)
테스트 10 〉	통과 (1576.63ms, 394MB)
테스트 11 〉	통과 (0.05ms, 52.7MB)
테스트 12 〉	통과 (0.05ms, 53.2MB)
*/
public class P42883 {
    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        // 반복문을 위한 고정 길이
        int fixLength = number.length() - k;
        int max = number.charAt(0);
        // 구해야 하는 자리 수
        int cipher = number.length() - k;
        int length = number.length() - cipher;

        for(int j=0; j<fixLength; j++) {

            // 문자열의 길이가 남은 자리수와 같다면, 그대로 문자열에 모두 붙이기
            if(number.length() == cipher) {
                for(int i=0; i<number.length(); i++) {
                    answer.append(number.charAt(i)-48);
                }
                return answer.toString();
            }

            // 최대값 구하기
            for(int i=0; i<=length; i++) {
                // 반복문 도중 최대값이 9가 나왔다면 break
                if(max == 9) {
                    break;
                }
                if(number.charAt(i) > max) {
                    max = number.charAt(i)-48;
                }
            }
            answer.append(max-48);

            // 주어진 숫자순서대로 최대숫자를 만들어야하므로, max값 앞의 숫자들은 필요가 없음, 그러므로 잘라버린다.
            int index = number.indexOf(max);
            number = number.substring(index+1);

            max = 0;
            // max값이 위에서 append 되었으므로, 구해야하는 자리수가 하나 줄어든다. 4자리를 구해야했는데 1자리를 구했으면 남은 자리는 3자리
            cipher--;
            length = number.length() - cipher;
        }
        return answer.toString();
    }
}
