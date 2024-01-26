package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        if(N ==1) {
            System.out.println(3);
            return;
        }
        dp[0] = 1;
        dp[1] = 3;
        //dp[2] = 3+3+1; //7
        //dp[3] = 7+7+3; // 17
        //dp[4] = 17+17+7; // 41
        for(int i = 2; i<N+1; i++) {
            dp[i] = (dp[i-1]*2) + dp[i-2];
            dp[i] %= 9901;
        }
        System.out.println(dp[N]);

    }
}
