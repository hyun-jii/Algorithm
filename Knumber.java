import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //commands �迭�� �� ���ҵ��� ���� ����
        for(int i=0; i<commands.length; i++)
        {
            //�迭�� �ε����� 0���� �����ϹǷ� -1
            int left = commands[i][0]-1;
            int right = commands[i][1]-1;
            int key = commands[i][2]-1;
            
            //�迭�� ������ �ӽ� temp �迭 ����
            int[] temp = new int[right-left+1];
         
            //�迭 ����
            for(int j=0; j<temp.length;j++)
                temp[j] = array[left++];
            
            //������ �迭 ����
            Arrays.sort(temp);
            
            //������ �迭���� key ��ġ�� �� ����
            answer[i] = temp[key];
        }
        return answer;
    }
}