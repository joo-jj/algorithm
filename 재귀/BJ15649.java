package 재귀;

import java.io.IOException;
import java.util.Scanner;

/*
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열 15649
 */
public class BJ15649 {
    static int N,M;
    static int[] arr;
    static boolean isUsed[];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[10];
        isUsed = new  boolean[10];
        choice(0);

    }

    static void choice(int k){
       if(k==M){
           for (int i = 0; i < M; i++) {
               System.out.print(arr[i]+" ");
           }
           System.out.println();
           return;
       }
        for (int i = 1; i <=N; i++) {
            if(!isUsed[i]){
                arr[k]=i;
                isUsed[i]=true;
                choice(k+1);
                isUsed[i]=false;
            }
        }
    }
}
