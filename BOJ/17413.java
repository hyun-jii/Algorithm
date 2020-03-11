import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public String print(Stack stack) {

        StringBuilder answer = new StringBuilder();

        while(!stack.empty()) {
            answer.append(stack.pop());
        }
        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main ob = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder answer = new StringBuilder();
        
        boolean tag = false;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {

            if(s.charAt(i) == '<') {
                answer.append(ob.print(stack));
                answer.append(s.charAt(i));
                tag = true;
            }
            else if(s.charAt(i) == '>') {
                answer.append(s.charAt(i));
                tag = false;
            }
            else if(tag) {
                answer.append(s.charAt(i));
            }
            else {
                if (s.charAt(i) == ' ') {
                    answer.append(ob.print(stack));
                    answer.append(" ");

                }
                else {
                    stack.push(s.charAt(i));
                }
            }
        }
        answer.append(ob.print(stack));
        System.out.println(answer);
    }
}
