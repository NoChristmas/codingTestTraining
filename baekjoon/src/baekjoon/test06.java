package baekjoon;

import java.util.*;
import java.io.*;

public class test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int[][][] dp = new int[101][101][1001];
        for(int k = 0; k<=1000; k++) {
            for(int i = 0; i<=100; i++) {
                for(int j = 0; j<=100; j++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        int result = recursion(A,B,C,dp);
        System.out.println(result);
    }

    public static int recursion(int a, int b, int c, int[][][] memo) {
        if(memo[a][b][c] != -1) return memo[a][b][c];
        if(a <= 0 || b <= 0) return 1;
        if(c == 0) return 0;

        int winA = recursion(a+1, b-1, c-1, memo);
        int winB = recursion(a-1, b+1, c-1, memo);
        int draw = recursion(a, b, c-1, memo);

        memo[a][b][c] = winA+winB+draw;
        return memo[a][b][c];
    }

}