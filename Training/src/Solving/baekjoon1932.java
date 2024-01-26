package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] node = new int[T][T];
        int[][] dp = new int[T][T];
        for(int i = 0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<=i; j++) {
                node[i][j] = Integer.parseInt(st.nextToken());
            } 
        }

        if(T == 1) {
            System.out.println(node[0][0]);
            return;
        }
        if(T == 2) {
            System.out.println(Math.max(node[0][0]+node[1][0], node[0][0]+node[1][1]));
            return;
        }

        dp[0][0] = node[0][0];
        dp[1][0] = dp[0][0] + node[1][0];
        dp[1][1] = dp[0][0] + node[1][1];
        
        //dp[2][0] = dp[1][0] + node[2][0];
        //dp[2][1] = max(node[1][0],node[1][1]) + node[2][1];
        //dp[2][2] = dp[1][1] + node[2][2];
        
        //dp[3][0] = dp[2][0] + node[3][0];
        //dp[3][1] = max(dp[2][0]+node[3][1], dp[2][1]+node[3][1]);
        //dp[3][2] = max(dp[2][1]+node[3][2], dp[2][2]+node[3][2]);
        //dp[3][3] = dp[2][2] +node[3][3];
        
        
        //점화식
        //dp[n] += dp[n-1] + Math.max(node[n],node[n+1])
        //y x
        for(int i = 2; i<T; i++) {
            for(int j = 0; j<T; j++) {
                if(j == 0) {
                    dp[i][j] = dp[i-1][j] + node[i][j];
                    continue;
                }
                if(j == T-1) {
                    dp[i][j] = dp[i-1][j-1] + node[i][j];
                    continue;
                }
                dp[i][j] = Math.max(dp[i-1][j-1]+node[i][j],dp[i-1][j]+node[i][j]);
            }
        }
        int num =0;
        /*
        for(int i =0; i<T; i++) {
            num = Math.max(dp[T-1][i],num);
        }
        */
        for(int i =0; i<T; i++) {
            for(int j = 0; j<T; j++) {
                if(dp[i][j] == 0) continue;
                System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(num);
    }
}
