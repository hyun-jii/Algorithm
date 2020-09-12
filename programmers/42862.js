/*
테스트 1 〉	통과 (0.11ms, 30MB)
테스트 2 〉	통과 (0.11ms, 30MB)
테스트 3 〉	통과 (0.11ms, 29.8MB)
테스트 4 〉	통과 (0.09ms, 30.1MB)
테스트 5 〉	통과 (0.10ms, 30MB)
테스트 6 〉	통과 (0.09ms, 30.1MB)
테스트 7 〉	통과 (0.11ms, 30MB)
테스트 8 〉	통과 (0.09ms, 30MB)
테스트 9 〉	통과 (0.09ms, 30MB)
테스트 10 〉	통과 (0.11ms, 30MB)
테스트 11 〉	통과 (0.10ms, 30MB)
테스트 12 〉	통과 (0.06ms, 30MB)
*/
function solution(n, lost, reserve) {
    var result = n-lost.length;
    var repetition = [];
    
    for(var i=0; i<lost.length; i++) {
        if(reserve.includes(lost[i])) {
            repetition.push(lost[i]);
        }
    }
        
    for(var i=0; i<lost.length; i++) {
        if(reserve.includes(lost[i])) {
            result++;   
        }
        else if(reserve.includes(lost[i]-1) && !repetition.includes(lost[i]-1)) {
            result++;
            repetition.push(lost[i]-1);
        }
        else if(reserve.includes(lost[i]+1) && !repetition.includes(lost[i]+1)) {
            if(reserve.includes(lost[i]+1)) {
                result++;
                repetition.push(lost[i]+1);
            }
        }
    }
    return result;
}
