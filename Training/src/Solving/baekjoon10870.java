package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 0) {
            System.out.println(0);
            return;
        }
        if(N==1) {
            System.out.println(1);
            return;
        }

        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i<=N; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }

        System.out.println(dp[N]);
    }
}
