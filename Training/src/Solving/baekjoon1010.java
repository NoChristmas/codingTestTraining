package Solving;

import java.io.*;
import java.util.*;

public class baekjoon1010 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[][] fff = new int[30][30];
 
		// 2번 성질 (n == r, r == 0)
		for (int i = 0; i < 30; i++) {
			fff[i][i] = 1;
			fff[i][0] = 1;
		}
			
 
		for (int i = 2; i < 30; i++) {
			for (int j = 1; j < 30; j++) {
				// 1번 성질 
				fff[i][j] = fff[i - 1][j - 1] + fff[i - 1][j];
			}
		}

        StringTokenizer st;
        for(int i = 0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(fff[A][B]+"\n");
        }
        System.out.println(sb);
        
    }
}
