public class Kakao2020 {

    public int solution(String s)
    {
        int result = s.length();
        // 중복되는 알파벳 카운트
        int count = 1;

        // 단위마다 잘라서 넣을 배열 선언
        String[] array;
        // 압축한 문자열을 저장할 변수
        StringBuilder temp = new StringBuilder();
        int m = 0;

        // k 단위 만큼 문자열 자르기
        for(int k=1; k< s.length(); k++) {

            // 배열의 크기 지정
            if(s.length()%k == 0) {
                array = new String[s.length()/k];
            }
            else {
                array = new String[(s.length()/k) + 1];
            }

            // 배열에 담기
            for (int i = 0; i < s.length(); i+=k) {

                if(k+i > s.length()-1) {
                    array[m] = s.substring(i);
                    m++;
                }
                else {
                    array[m] = s.substring(i, k+i);
                    m++;
                }
            }

            // 배열의 문자열을 비교
            for (int j = 0; j < array.length-1; j++) {

                boolean equals = array[j].equals(array[j + 1]);

                // 문자열이 같을 경우
                if (equals) {
                    count++;
                }
                // 문자열이 다르거나 배열의 마지막 인덱스 비교일 경우
                if (!equals || ((j + 1) == (array.length - 1))) {

                    if (count > 1) {
                        temp.append(Integer.toString(count));
                        temp.append(array[j]);
                    } else {
                        temp.append(array[j]);
                    }

                    if (j + 1 == array.length - 1 && !equals) {
                        temp.append(array[j+1]);
                    }
                    count = 1;
                }
            }
            // 문자열의 최소 길이 비교
            if(result >= temp.length()){
                result = temp.length();
            }
            temp.delete(0,temp.length());
            m = 0;
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "aabbaccc";

        Kakao2020 ob = new Kakao2020();

        int result=ob.solution(s);

        System.out.println("최종결과 : " + result);


    }
}
