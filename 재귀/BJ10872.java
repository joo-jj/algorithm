package 재귀;

import java.util.Scanner;

// 0보다 크거나 같은 정수 N이 주어진다. 이때, N!을 출력하는 프로그램을 작성하시오.
public class BJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int res = factorial(N);
        System.out.println(res);
    }

    public static int factorial(int N){
        if(N == 1 || N==0) return 1;
        else return N*factorial(N-1);
    }
}