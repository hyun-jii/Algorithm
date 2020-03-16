import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11399 {

    public static int atm(int[] time, int n) {

        int result = 0;
        Arrays.sort(time);

        for(int i=0; i<time.length; i++) {
            result += time[i]*n;
            n--;
        }
        return result;
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int[] time = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(atm(time, n));
    }
}
