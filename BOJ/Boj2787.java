// 14532KB	144ms  
// 재귀로 풀면 시간초과  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2748 {

    public static long fibonacci(int n) {
        long[] dp = new long[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long result = fibonacci(n);
        System.out.println(result);
    }
}
