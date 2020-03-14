import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj17087 {

    public static int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] loc = new int[num];

        for(int i=0; i<num; i++) {
            loc[i] = Integer.parseInt(st.nextToken()) - a;
        }

        int result = loc[0];

        for(int i=1; i<num; i++) {
            result = gcd(result,loc[i]);
        }

        System.out.println(Math.abs(result));
    }
}
