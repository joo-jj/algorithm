package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
첫째 줄에 옮긴 횟수 K를 출력한다.
두 번째 줄부터 수행 과정을 출력한다.
두 번째 줄부터 K개의 줄에 걸쳐 두 정수 A B를 빈칸을 사이에 두고 출력하는데,
이는 A번째 탑의 가장 위에 있는 원판을 B번째 탑의 가장 위로 옮긴다는 뜻이다.
 */
public class BJ11729 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        sb.append((int)(Math.pow(2,N)-1)).append("\n");
        hanoi(1,2,3,N);
        System.out.println(sb);

    }

    static void hanoi(int start, int mid, int end, int N){
        if(N==1){
            sb.append(start+" "+end+"\n");
            return;
        }
        //1->2 (N-1)
        hanoi(start,end,mid,N-1);
        //1->3
        sb.append(start + " " + end+ "\n");
        //2->3 (N-1)
        hanoi(mid,start,end,N-1);
    }
}
