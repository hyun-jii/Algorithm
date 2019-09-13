
import java.util.Map;
import java.util.HashMap;

class Runner {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        //HashMap 인스턴스 생성
        Map<String,Integer> map = new HashMap<>();

        //participant(참가자) 배열을 map에 넣는다.
        for(String p : participant)
        {
            //value 값이 null이라면
            //participant배열을 key, value로 매핑하지 않았기 때문에 처음에 value 값은 무조건 null 이다
            if(map.get(p) == null)
                map.put(p, 1);     //참가자 이름을 key로 value값을 1로 한다.

                //value 값이 null이 아니라면
                //즉, 동명이인이 존재하는 것. 위에서 leo라는 이름이 value값 1로 매핑되었는데
                //leo라는 이름이 또 등장하여 value값을 가져오면 null이 아니고 1이다.
                //key는 중복될 수 없기 때문이다
            else
            {
                //이름이 중복인 경우 value값에 1을 더하여 구분한다.
                int value = map.get(p) + 1;
                map.put(p,value);
            }
        }

        //completion(완주자) 배열을 map에 넣는다.
        for(String c : completion)
        {
            //participant(참가자) 배열을 위에서 이미 매핑하였기 때문에
            //value의 값은 1또는 1이상의 수를 가지고 있다.
            //그러므로 value 값을 -1하여 매핑
            //참가자중에 완주한 사람은 value값이 0이 되도록 하여 구분
            int value = map.get(c) -1;
            map.put(c, value);
        }

        //value 값이 1인 경우 완주하지 못한 경우이므로, 이를 반환
        for(String runner : map.keySet())
        {
            if(map.get(runner)==1)
                answer = runner;
        }

        return answer;
    }
}