class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int count = 1;
        int yellowLength = yellow;
        
        if(yellow == 1) {
            answer[0] = 3;
            answer[1] = 3;
            return answer;
        }
        
        while(yellow >= count) {
            if(brown == ((yellow+2)*2) + (count*2)) {
                answer[0] = yellow + 2;
                answer[1] = count + 2;
                break;
            }
            if(yellow%2 != 0) {
                yellow = yellow/3;
            }
            else {
                yellow = yellow/2;            
            }
            count = yellowLength / yellow;
        }
        return answer;
    }
}
