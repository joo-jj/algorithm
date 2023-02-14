package 재귀;

import java.util.Scanner;

/*
이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 */
public class BJ10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res = pivo(N);
        System.out.println(res);
    }

    public static int pivo(int N){
        if(N == 0) return 0;
        else if(N == 1) return 1;
        else return pivo(N-1)+pivo(N-2);
    }
}