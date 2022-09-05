import java.util.*;

class Solution {
    public int solution(String s) {
        List<String> list = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine");
        
        for(int i=0; i<list.size(); i++) {
               s =  s.replace(list.get(i), Integer.toString(i));
        }
    
        return Integer.parseInt(s);
    }
}
