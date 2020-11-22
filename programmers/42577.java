/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 51.8MB)
테스트 2 〉	통과 (0.02ms, 52.9MB)
테스트 3 〉	통과 (0.02ms, 52.2MB)
테스트 4 〉	통과 (0.03ms, 52.5MB)
테스트 5 〉	통과 (0.02ms, 52.9MB)
테스트 6 〉	통과 (0.03ms, 51.8MB)
테스트 7 〉	통과 (0.02ms, 53.7MB)
테스트 8 〉	통과 (0.02ms, 53.1MB)
테스트 9 〉	통과 (0.02ms, 52.1MB)
테스트 10 〉	통과 (0.02ms, 52MB)
테스트 11 〉	통과 (0.02ms, 52.2MB)
효율성  테스트
테스트 1 〉	통과 (1.50ms, 56.8MB)
테스트 2 〉	통과 (1.38ms, 57.5MB)
*/

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        for(int i=0; i<phone_book.length; i++) {
            String number = phone_book[i];
            for(int j=0; j<phone_book.length; j++) {
                if(phone_book[j].length() > number.length()) {
                    if(phone_book[j].startsWith(number)) {
                        return false;
                    }
                }
            }
        }        
        return true;
    }
}
