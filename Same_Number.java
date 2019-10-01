import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int j=0;
        int count=0;
        
        //배열의 크기를 구하기 위한 반복문
         for(int i=0; i<arr.length; i++)
         {    
			 //i의 인덱스가 배열의 마지막 인덱스라면 반복문 탈출
             if(i == arr.length-1)
				 break;

             //배열의 원소들을 비교하여 서로 다른값인 경우만 count 증가
             if(arr[i] != arr[i+1])
                 count++;
         }
                
        //answer배열을 count+1만큼 선언 -> 값이 다른경우만 count했기 때문에 마지막 원소가 안들어감 
        int[] answer= new int[count+1];
        
        //배열의 원소를 비교하여 answer배열에 서로 다른 값만 넣어줌 
        for(int i=0; i<arr.length; i++)
         {   
			 if(i == arr.length-1)
				 break;

            //앞뒤배열이 같으면 continue 
            if(arr[i] == arr[i+1])
                continue;
            //서로 다르면 answer 배열에 넣어준다 
             if(arr[i] != arr[i+1])
             {
                 //answer배열의 인덱스를 j로 설정하여 따로 증가시킨다.
                 answer[j]=arr[i];
                 j++; 
             }		 
         }
        //다른 경우만 answer배열에 넣어줬으므로, 마지막 값이 들어가지 않으므로
        //마지막 배열에 값을 넣어준다.
         answer[j]=arr[arr.length-1];
                
        return answer;
	}
}