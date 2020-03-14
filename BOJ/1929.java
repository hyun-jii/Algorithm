import java.util.Scanner;

public class Main {

    public String primeNumber(int m, int n) {

        boolean[] temp = new boolean[n+1];
        StringBuilder sb = new StringBuilder();

        for(int i=2; i<=n; i++) {
            
            if(temp[i] == false) {
                if(i >= m) {
                    sb.append(i).append("\n");
                }
                for(int j= 2*i; j<=n; j+=i) {
                    temp[j] = true;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Main ob = new Main();
        System.out.println(ob.primeNumber(a, b));
    }
}
