/*
테스트 1 〉	통과 (0.02ms, 52.7MB)
테스트 2 〉	통과 (0.03ms, 52.8MB)
테스트 3 〉	통과 (0.03ms, 52.1MB)
테스트 4 〉	통과 (0.03ms, 53.2MB)
테스트 5 〉	통과 (0.03ms, 53.1MB)
테스트 6 〉	통과 (0.03ms, 52.2MB)
테스트 7 〉	통과 (0.03ms, 52.5MB)
테스트 8 〉	통과 (0.03ms, 51.7MB)
테스트 9 〉	통과 (0.03ms, 51.9MB)
테스트 10 〉	통과 (0.03ms, 52.4MB)
테스트 11 〉	통과 (0.03ms, 53.1MB)
테스트 12 〉	통과 (0.03ms, 53.2MB)
테스트 13 〉	통과 (0.05ms, 52.4MB)
테스트 14 〉	통과 (0.05ms, 52.9MB)
*/
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++) {
            boolean flag = true;
            int temp = -1;
            for(int j=0; j<skill_trees[i].length(); j++) {
                char s = skill_trees[i].charAt(j);
                int index = skill.indexOf(s);
                
                if(index >= 0) {
                    if(index < temp || index-1 != temp) {
                        flag=false;
                        break;
                    }
                    temp = index;    
                }
            }
            if(flag) {
                answer++;
            }
        }
        return answer;
    }
}
