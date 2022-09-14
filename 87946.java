class Solution {
    
    boolean[] visited;
    int answer = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        int depth = 0;
        
        dfs(dungeons, depth, k);
           
        return answer;
    }
    
    public void dfs(int[][] dungeons, int depth, int k) {     
        for(int i=0; i<dungeons.length; i++) {
            if(!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                dfs(dungeons, depth + 1, k - dungeons[i][1]);     
                visited[i] = false;
            }
        }
        answer = Math.max(depth, answer);
    }
}
