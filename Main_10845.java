import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main_10845 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        int rear = 0;
        for (int i = 0; i < N; i++) {
            String action = br.readLine();
            switch (action){
                case "pop":
                    if(queue.isEmpty()){ System.out.println("-1"); break;}
                    else System.out.println(queue.poll());
                    break;
                case "size":
                    System.out.println(queue.size());
                    break;
                case "empty":
                    if(queue.isEmpty()) {System.out.println("1"); break;}
                    else System.out.println("0");
                    break;
                case "front":
                    if(queue.isEmpty()) {System.out.println("-1"); break;}
                    System.out.println(queue.peek());
                    break;
                case "back":
                    if(queue.isEmpty()) {System.out.println("-1"); break;}
                    System.out.println(rear);
                    break;
                default:
                    int num = Integer.parseInt(action.substring(5));
                    queue.add(num);
                    rear=num;
                    break;
            }
        }

    }
}
