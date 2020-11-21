import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int result = 0;
        int time = 0;
        int index = 0;
        
        PriorityQueue<int[]> q = new PriorityQueue<>(((o1, o2) -> o1[1] - o2[1]));
        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));
        
        while(index < jobs.length || !q.isEmpty()){
            while(index < jobs.length && jobs[index][0] <= time){
                q.offer(jobs[index++]);
            }

            if(q.isEmpty()){
                time = jobs[index][0];
            }else {
                int[] job = q.poll();
                result += time + job[1] - job[0];
                time += job[1];
            }
        }

        return result/jobs.length;
    }
}
