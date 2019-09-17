import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //commands 배열에 각 원소들의 값을 저장
        for(int i=0; i<commands.length; i++)
        {
            //배열에 인덱스는 0부터 시작하므로 -1
            int left = commands[i][0]-1;
            int right = commands[i][1]-1;
            int key = commands[i][2]-1;
            
            //배열을 복사할 임시 temp 배열 선언
            int[] temp = new int[right-left+1];
         
            //배열 복사
            for(int j=0; j<temp.length;j++)
                temp[j] = array[left++];
            
            //복사한 배열 정렬
            Arrays.sort(temp);
            
            //정렬한 배열에서 key 위치의 값 저장
            answer[i] = temp[key];
        }
        return answer;
    }
}