import java.util.Calendar;
import java.util.Scanner;
public class Year {

        public String solution(int a, int b) {
            String answer = "";
            Calendar ca = Calendar.getInstance();

            ca.set(2016,a-1,b);

            int day = ca.get(ca.DAY_OF_WEEK);

            switch (day)
            {
                case 1:
                    answer = "SUN";
                    break;
                case 2:
                    answer = "MON";
                    break;
                case 3:
                    answer = "TUE";
                    break;
                case 4:
                    answer ="WED";
                    break;
                case 5:
                    answer = "THU";
                    break;
                case 6:
                    answer = "FRI";
                    break;
                case 7:
                    answer = "SAT";
                    break;
            }

            return answer;
        }

        public static void main(String[] args)
        {
            Year ob = new Year();
            Scanner sc = new Scanner(System.in);

            int a,b;

            a=sc.nextInt();
            b=sc.nextInt();

            String day =ob.solution(a,b);

            System.out.println(day);
        }

}
