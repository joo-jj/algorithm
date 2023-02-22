package 재귀;

import java.io.IOException;
import java.util.Scanner;

/*
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다 15650
 */
public class BJ15650 {
    static int N,M;
    static int[] arr;
    static boolean isUsed[];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[10];
        isUsed = new  boolean[10];
        choice(0,1);

    }

    static void choice(int k,int start){
       if(k==M){
           for (int i = 0; i < M; i++) {
               System.out.print(arr[i]+" ");
           }
           System.out.println();
           return;
       }
        for (int i = start; i <=N; i++) {
            if(!isUsed[i]){
                arr[k]=i;
                isUsed[i]=true;
                choice(k+1,i);
                isUsed[i]=false;
            }
        }
    }
}
