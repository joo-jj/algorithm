package 재귀;

import java.io.*;

public class BJ2247 {
    static int N;
    static String[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());
        arr = new String[N][N];
        star(0,0,N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == null) arr[i][j] = " ";
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();

    }

    static void star(int x, int y,int N){
        if(N==1){
            arr[x][y] = "*";
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(!(i==1 && j==1))
                    star(x+i*N/3,y+j*N/3, N/3);
            }
        }
    }
}
