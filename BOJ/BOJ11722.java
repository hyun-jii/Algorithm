import java.util.Scanner;
 
public class Main {
    static int[] s =new int[1001];
    static int[] dp =new int[1001];
    static int n;
     
    static int search(int i) {
        if (dp[i] ==0) {
            dp[i] =1;
            for (int k = i; k < n; k++) {
                if ((k < n) && (s[k] < s[i])) {
                    dp[i] = Math.max(dp[i], search(k) +1);
                }
            }
        }
        return dp[i];
    }
     
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();
        for (int i =0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int max =0;
        for (int i =0; i <n; i++) {
            max = Math.max(max, search(i));
        }
    }
}
