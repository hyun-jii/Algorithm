/*
정확성  테스트
테스트 1 〉	통과 (0.03ms, 52.2MB)
테스트 2 〉	통과 (0.02ms, 52.3MB)
테스트 3 〉	통과 (0.02ms, 52.4MB)
테스트 4 〉	통과 (0.02ms, 52.8MB)
테스트 5 〉	통과 (0.04ms, 52.6MB)
테스트 6 〉	통과 (0.03ms, 52.5MB)
테스트 7 〉	통과 (0.02ms, 52.1MB)
테스트 8 〉	통과 (0.02ms, 51.9MB)
테스트 9 〉	통과 (0.03ms, 52.9MB)
테스트 10 〉	통과 (0.02ms, 52.2MB)
테스트 11 〉	통과 (0.02ms, 52.6MB)
효율성  테스트
테스트 1 〉	통과 (1.88ms, 56.1MB)
테스트 2 〉	통과 (1.88ms, 57MB)
*/

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {        
        for(int i=0; i<phone_book.length; i++) {
            for(int j=0; j<phone_book.length; j++) {
                if(phone_book[j].length() > phone_book[i].length()) {
                    String headNumber = phone_book[j].substring(0, phone_book[i].length());
                    if(headNumber.equals(phone_book[i])) {
                        return false;
                    }
                }
            }
        }        
        return true;
    }
}
