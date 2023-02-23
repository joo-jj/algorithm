package 재귀;

import java.io.IOException;
import java.util.Scanner;

public class BJ15652 {
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
        choice(0,1);
        System.out.println(sb);

    }

    static void choice(int k,int start){
       if(k==M){
           for (int i = 0; i < M; i++) {
               sb.append(arr[i]).append(" ");
           }
           sb.append("\n");
           return;
       }
        for (int i = start; i <=N; i++) {
                arr[k]=i;
                choice(k+1,i);
        }
    }
}
