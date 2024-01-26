package Solving;

import java.io.*;

public class baekjoon2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i =0; i<T; i++) {
            //층
            int k = Integer.parseInt(br.readLine());
            //호수
            int n = Integer.parseInt(br.readLine());
            int[] dp = new int[n+1];
            if(n ==0) {
                System.out.println(0);
                continue;
            }
            if(n==1) {
                System.out.println(1);
                continue;
            }
            for(int x= 0; x<n+1; x++) {
                dp[x] = x;
            }
            for(int x = 0; x<k; x++) {
                for(int y = 2; y<n+1; y++) {
                    dp[y] += dp[y-1];
                }
                                
            }
            
            System.out.println(dp[n]);
            //0층
            //0 1 2 3 4 5 6 7 8 9 10
            //1층
            //0 1 3 6 10 
            //1 ~ 3 더함
            //2층
            //0 1 4 10
        }
    }
}
