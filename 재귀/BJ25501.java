package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ25501 {
    static int cnt = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            cnt = 0;
            String word = br.readLine();
            String[] arr = word.split("");
            System.out.println(isPalindrome(arr)+" "+cnt);
        }

    }

    private static int isPalindrome(String[] arr) {
        return recursion(arr, 0, arr.length-1);
    }

    private static int recursion(String[] arr, int l, int r){
        cnt++;
        if(l >= r) return 1;
        else if(!arr[l].equals(arr[r])) return 0;
        else return recursion(arr, l + 1, r - 1);
    }
}
