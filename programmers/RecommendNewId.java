/*
테스트 1 〉	통과 (0.58ms, 52.6MB)
테스트 2 〉	통과 (13.22ms, 52.6MB)
테스트 3 〉	통과 (13.52ms, 53.2MB)
테스트 4 〉	통과 (0.70ms, 52.7MB)
테스트 5 〉	통과 (0.69ms, 52.4MB)
테스트 6 〉	통과 (0.64ms, 52.2MB)
테스트 7 〉	통과 (0.66ms, 53MB)
테스트 8 〉	통과 (0.72ms, 53.2MB)
테스트 9 〉	통과 (13.66ms, 54.5MB)
테스트 10 〉	통과 (0.57ms, 52.9MB)
테스트 11 〉	통과 (0.73ms, 52.6MB)
테스트 12 〉	통과 (0.96ms, 52.4MB)
테스트 13 〉	통과 (14.45ms, 52.5MB)
테스트 14 〉	통과 (0.66ms, 52.1MB)
테스트 15 〉	통과 (0.81ms, 52.3MB)
테스트 16 〉	통과 (1.23ms, 52.7MB)
테스트 17 〉	통과 (2.59ms, 52.8MB)
테스트 18 〉	통과 (3.38ms, 53.9MB)
테스트 19 〉	통과 (4.38ms, 52.8MB)
테스트 20 〉	통과 (5.02ms, 52.3MB)
테스트 21 〉	통과 (3.83ms, 52.4MB)
테스트 22 〉	통과 (18.22ms, 53.5MB)
테스트 23 〉	통과 (15.98ms, 52.5MB)
테스트 24 〉	통과 (4.11ms, 53.2MB)
테스트 25 〉	통과 (3.73ms, 51.8MB)
테스트 26 〉	통과 (3.87ms, 52.4MB)
*/

class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        answer = new_id.toLowerCase();
        answer = answer.replaceAll("[^a-z0-9-_.\\s]", "");
        answer = answer.replaceAll("\\.+", ".");
        answer = answer.replaceAll("^\\.|\\.$", "");
        if(answer.isEmpty()) {
            answer = "a";
        }
        if(answer.length() >= 16) {
            answer = answer.substring(0,15);
            answer = answer.replaceAll("^\\.|\\.$", "");
        }
        if(answer.length() <= 2) {
            char lastChar = answer.charAt(answer.length()-1);
            while(answer.length() <= 2) {
                answer += lastChar;
            }
        }
        
        return answer;
    }
}
