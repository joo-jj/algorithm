package 재귀;

import java.io.IOException;
import java.util.Scanner;

/**
 * N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
 *
 * N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 */
public class BJ9663 {
    static int N;
    static int[] arr;
    static int count = 0;
    static boolean[] isUsed1 = new boolean[40];
    static boolean[] isUsed2 = new boolean[40];
    static boolean[] isUsed3 = new boolean[40];
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N];
        nQueen(0);
        System.out.println(count);

    }

    static void nQueen(int k){
       if(k==N){
           count++;
           return;
       }
        for (int i = 0; i <N; i++) {
            if (isUsed1[i] || isUsed2[i+k] || isUsed3[k-i+N-1])
                continue;
            isUsed1[i] = true;
            isUsed2[i+k] = true;
            isUsed3[k-i+N-1] = true;
            nQueen(k+1);
            isUsed1[i] = false;
            isUsed2[i+k] = false;
            isUsed3[k-i+N-1] = false;
        }
    }
}
