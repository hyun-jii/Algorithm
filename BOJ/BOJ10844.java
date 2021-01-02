// 14704KB	136ms	Java 11	1091
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static final long MOD = 1000000000;
    public static long stairLength(int n) {
        long[][] dp = new long[n+1][10];

        for(int i=1; i<=9; i++) {
            dp[1][i] = 1;
        }
        for(int i=2; i<=n; i++) {
            for(int j=0; j<=9; j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][j+1]%MOD;
                }
                else if(j==9) {
                    dp[i][j] = dp[i-1][j-1]%MOD;
                }
                else {
                    dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%MOD;
                }
            }
        }

        long count = 0;
        for(int i=0; i<=9; i++) {
            count+=dp[n][i];
        }

        return count%MOD;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));

        int n = Integer.parseInt(br.readLine());
        System.out.println(stairLength(n));
    }
}


