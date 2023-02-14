package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String mode = br.readLine();
            switch (mode){
                case "pop_front":
                    if(deque.isEmpty()) { System.out.println("-1"); break;}
                    else System.out.println(deque.poll());
                    break;
                case "pop_back":
                    if(deque.isEmpty()){ System.out.println("-1"); break;}
                    else System.out.println(deque.pollLast());
                    break;
                case "size":
                    System.out.println(deque.size());
                    break;
                case "empty":
                    if(deque.isEmpty()) {System.out.println("1"); break;}
                    else System.out.println("0");
                    break;
                case "front":
                    if(deque.isEmpty()) {System.out.println("-1"); break;}
                    System.out.println(deque.peek());
                    break;
                case "back":
                    if(deque.isEmpty()) {System.out.println("-1"); break;}
                    System.out.println(deque.peekLast());
                    break;
                default:
                    if(mode.split(" ")[0].equals("push_front")) {
                        int num = Integer.parseInt(mode.substring(10).trim());
                        deque.addFirst(num);
                        break;
                    }else if(mode.split(" ")[0].equals("push_back")){
                        int num = Integer.parseInt(mode.substring(10).trim());
                        deque.addLast(num);
                        break;
                    }
            }
        }
    }
}
