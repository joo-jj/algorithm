package back;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_9093 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            String[] word = input.split(" ");
            StringBuilder sb= new StringBuilder();

            for (String s :word ) {
                StringBuilder w = new StringBuilder(s);
                sb.append(w.reverse());
                sb.append(' ');
            }
            sb.deleteCharAt(sb.length()-1);
            System.out.println(sb);
        }
    }
}
