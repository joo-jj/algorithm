package back;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test5 {

	static int[][] board;
	static int[] dr = {1,1,0,-1};
	static int[] dc = {0,1,1,1};
	static int[] check = {-1,5};
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		board = new int[19][19];
		for(int i=0; i<19; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine()," ");
			for(int j=0; j<19; j++ ) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		search();
		in.close();
	}
	public static void search() {
		int win=0;
		for(int i=0; i<19; i++) {
			for(int j=1; j<19; j++) {
				int x =i;
				int y =j;
				if(board[i][j] != 0) {
					int color = board[x][y];
					here: for(int k=0; k<4; k++) {
						x=i;
						y=j;
						for(int d=0; d<4; d++) {
							x += dr[k];
							y += dc[k];
							if(x>=0 && x<19 && y>=0 && y<19) {
								if(board[x][y] == color ) continue;
								else continue here;
							}else continue here;
						}
						chk: for(int m=0; m<check.length; m++) {
							int nx = i+check[m]*dr[k];
							int ny = j+check[m]*dc[k];
							if(nx >=0 && nx<19 && ny>=0 && ny<19) {
								if(board[nx][ny] != color) continue chk;
								continue here;
							}
						}
						win = 1;
						System.out.printf("%d\n", color);
						System.out.printf("%d %d", i+1, j+1);
						break;
					}
				}
			}
		}if(win != 1) System.out.println(0);
	}
}