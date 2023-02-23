package 재귀;

import java.io.IOException;
import java.util.Scanner;

/*
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
같은수를 여러번 골라도 된다
 */
public class BJ15651 {
    static int N,M;
    static int[] arr;
    static boolean isUsed[];
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[10];
        isUsed = new  boolean[10];
        choice(0);
        System.out.println(sb);

    }

    static void choice(int k){
       if(k==M){
           for (int i = 0; i < M; i++) {
               sb.append(arr[i]).append(" ");
           }
           sb.append("\n");
           return;
       }
        for (int i = 1; i <=N; i++) {
                arr[k]=i;
                choice(k+1);
        }
    }
}
