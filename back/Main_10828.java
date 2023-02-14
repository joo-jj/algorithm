package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main_10828 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++) {
            String mode = br.readLine();
            switch (mode){
                case "pop":
                    if(stack.empty())
                        System.out.println("-1");
                    else{
                        System.out.println(stack.peek());
                        stack.pop();
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.empty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "top":
                    if(stack.empty())
                        System.out.println("-1");
                    else {
                        System.out.println(stack.peek());
                    }
                    break;
                default:
                    int num = Integer.parseInt(mode.substring(5));
                    stack.push(num);
                    break;
            }
        }
    }
}
