class Solution {
    public int[] solution(int[] answers) {
        
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        //������ 1,2,3 ���� ���� ī��Ʈ
        int count1=0, count2=0, count3=0;
        int j=0,k=0,z=0;
        
        for(int i=0; i<answers.length; i++)
        {
            //1�� �������� �� ä��
            if(j == 5)     //��� ����� 5�� ������ �ݺ��Ǵ� ��Ģ
                j=0;
            if(answers[i] == su1[j])     
                count1++;   
            j++;     
            
            //2�� �������� �� ä��
            if(k==8)      //��� ����� 8�� ������ �ݺ�
                k=0;
            
            if(answers[i] == su2[k]) 
                count2++;
            k++;
            
            //3�� �������� ä��
            if(z==10)     //��� ����� 10�� ������ �ݺ�
                z=0;
            
            if(answers[i]==su3[z])
                count3++;
            z++;     
        } // end for()
       
        //1��, 2��, 3�� �������� ���� ���� ���� ����
        int max = Math.max(Math.max(count1,count2),count3);
        
        int count=0;
        //���� ���� ���� ����� ������� ī��Ʈ(�迭�� ũ�� ���� ���ؼ�)
        if(max==count1)
            count++;
        if(max==count2)
            count++;
        if(max==count3)
            count++;
        //answer �迭 count��ŭ ũ�� ����
        int[] answer = new int[count];
        
        int i=0;
        //count1�� �ִ밪, �� ������ 1�� ���� ���� �¾Ҵٸ�
        if(max==count1)
        {
            answer[i]=1;  //�迭�� 1�� �־��ش�.
            i++;          //���� ���� ���� ����� �������� �� �����Ƿ�, �迭�� �־��� �� i�� ����
        }
        //������ 2�� ���帹�� �¾Ҵٸ�
        if(max==count2)
        {
            answer[i]=2;
            i++;
        }
        //������ 3�� ���� ���� �¾Ҵٸ�
        if(max==count3)
           answer[i]=3; 
  
        return answer;
    }
}