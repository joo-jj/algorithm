package 재귀;

import java.io.IOException;
import java.util.Scanner;

public class BJ24060 {
    static int N, K ,cnt=0, result=-1;
    static int[] tmp;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] A = new int[N];
        K = sc.nextInt();
        tmp = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        merge_sort(A,0,A.length-1);
        System.out.println(result);
    }

    private static void merge(int[] A, int p, int q, int r) {
        int i = p;
        int j = q+1;
        int t = 0;
        while (i <= q && j <= r) {
            if (A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else tmp[t++] = A[j++];
        }
        while (i <= q)
            tmp[t++] = A[i++];
        while (j <= r)
            tmp[t++] = A[j++];
        i = p;
        t = 0;
        while (i <= r) {
            cnt++;
            if (cnt == K) {
                result = tmp[t];
                break;
            }
            A[i++] = tmp[t++];
        }
    }

    private static void merge_sort(int[] A, int p, int r) {
        if (p < r)  {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }
}
