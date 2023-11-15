package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;



public class number2566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// st.nextToken();
		int[][] board = new int[9][9];

		int a = 0;
		int b = 0;
		int max = -1;
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if (max < board[i][j]) {
					max = board[i][j];
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.println(max);
		System.out.print(a + " " + b);

	}
}
