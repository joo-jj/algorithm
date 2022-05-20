import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_9012 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 1; i <= T; i++) {
            String input = br.readLine();
            System.out.println(solve(input));
        }
    }

    public static String solve(String input) {
        Stack<Character> stack = new Stack<>();
        for (int j = 0; j < input.length(); j++) {
            char c = input.charAt(j);

            if (c == '(') stack.push(c);
            else if (stack.isEmpty()) return "NO";
            else stack.pop();
        }

        if(stack.isEmpty()) return "YES";
        else return "NO";
    }
}
