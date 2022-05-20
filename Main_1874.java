import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        int num =1;
        boolean isAble = true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if(isAble) {
                if (num <= arr[i]) {
                    while (num <= arr[i]) {
                        stack.push(num++);
                        sb.append("+\n");
                    }
                }
                if (stack.isEmpty()) isAble = false;
                else {
                    while (stack.peek() >= arr[i]) {
                        stack.pop();
                        sb.append("-\n");
                        if (stack.isEmpty()) break;
                    }
                }
            }
        }
        if(isAble){
            System.out.println(sb.toString());
        }else{
            System.out.println("NO");
        }
    }
}
