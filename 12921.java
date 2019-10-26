public class PrimeNumber {


    public int solution(int n)
    {
        int answer = 2;
        int count = 0;

        for(int i=4; i<=n; i++)
        {
            for(int j=2; j<i; j++)
            {
                System.out.println("i =" + i + "j= " + j);
                if(i%j == 0) {
                    break;
                }
            }
        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args)
    {
        PrimeNumber ob = new PrimeNumber();

        int n = ob.solution(10);
    }
}
