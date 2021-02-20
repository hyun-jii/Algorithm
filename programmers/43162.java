/*
테스트 1 〉	통과 (0.03ms, 51.7MB)
테스트 2 〉	통과 (0.03ms, 52.1MB)
테스트 3 〉	통과 (0.05ms, 52.6MB)
테스트 4 〉	통과 (0.04ms, 52.3MB)
테스트 5 〉	통과 (0.02ms, 52.3MB)
테스트 6 〉	통과 (0.11ms, 52.5MB)
테스트 7 〉	통과 (0.04ms, 53.1MB)
테스트 8 〉	통과 (0.09ms, 52.3MB)
테스트 9 〉	통과 (0.06ms, 52.6MB)
테스트 10 〉	통과 (0.06ms, 52.3MB)
테스트 11 〉	통과 (0.35ms, 52.6MB)
테스트 12 〉	통과 (0.32ms, 53.4MB)
테스트 13 〉	통과 (0.14ms, 52.7MB)
*/
class Solution {
   public int solution(int n, int[][] computers) {
    int answer = 0;
    boolean[] checked = new boolean[n];

    for (int i = 0; i < n; i++) {
      if (!checked[i]) {
        dfs(computers, i, checked);
        answer++;
      }
    }

    return answer;
  }

  boolean[] dfs(int[][] computers, int i, boolean[] checked) {
    checked[i] = true;

    for (int j = 0; j < computers.length; j++) {
      if (i != j && computers[i][j] == 1 && checked[j] == false) {
        checked = dfs(computers, j, checked);
      }
    }
    return checked;
  }
}
