class Solution {
    public int[] solution(int[] answers) {
        
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        //수포자 1,2,3 맞은 개수 카운트
        int count1=0, count2=0, count3=0;
        int j=0,k=0,z=0;
        
        for(int i=0; i<answers.length; i++)
        {
            //1번 수포자의 답 채점
            if(j == 5)     //찍는 방식이 5번 단위로 반복되는 규칙
                j=0;
            if(answers[i] == su1[j])     
                count1++;   
            j++;     
            
            //2번 수포자의 답 채점
            if(k==8)      //찍는 방식이 8번 단위로 반복
                k=0;
            
            if(answers[i] == su2[k]) 
                count2++;
            k++;
            
            //3번 수포자의 채점
            if(z==10)     //찍는 방식이 10번 단위로 반복
                z=0;
            
            if(answers[i]==su3[z])
                count3++;
            z++;     
        } // end for()
       
        //1번, 2번, 3번 수포자중 제일 많이 맞은 개수
        int max = Math.max(Math.max(count1,count2),count3);
        
        int count=0;
        //가장 많이 맞은 사람이 몇명인지 카운트(배열의 크기 선언 위해서)
        if(max==count1)
            count++;
        if(max==count2)
            count++;
        if(max==count3)
            count++;
        //answer 배열 count만큼 크기 선언
        int[] answer = new int[count];
        
        int i=0;
        //count1이 최대값, 즉 수포자 1이 가장 많이 맞았다면
        if(max==count1)
        {
            answer[i]=1;  //배열에 1을 넣어준다.
            i++;          //가장 많이 맞은 사람이 여러명일 수 있으므로, 배열에 넣어준 뒤 i값 증가
        }
        //수포자 2가 가장많이 맞았다면
        if(max==count2)
        {
            answer[i]=2;
            i++;
        }
        //수포자 3이 가장 많이 맞았다면
        if(max==count3)
           answer[i]=3; 
  
        return answer;
    }
}