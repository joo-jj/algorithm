package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        Stack<Character> stack = new Stack<>();
        Stack<Character> new_stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            String mode = br.readLine();
            if(mode.charAt(0)=='L'){
                if(stack.empty()) continue;
                new_stack.push(stack.pop());
            }
            else if(mode.charAt(0)=='D'){
                if(new_stack.empty()) continue;
                stack.push(new_stack.pop());
            }
            else if(mode.charAt(0)=='B'){
                if(stack.empty()) continue;
                stack.pop();
            }
            else{
                stack.push(mode.charAt(2));
            }

        }
        while(!stack.empty()){
            new_stack.push(stack.pop());
        }
        StringBuilder sb = new StringBuilder();
        while (!new_stack.empty()){
            sb.append(new_stack.pop());
        }
        System.out.println(sb.toString());
    }
}