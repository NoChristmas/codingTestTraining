package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int[] arr = new int[T+1];
        int[] dp = new int[T+1];
        for(int i = 1; i<T+1; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(T == 1) {
            System.out.println(arr[T]);
            return;
        } 
        if(T == 2) {
            System.out.println(arr[T-1] + arr[T]);
            return;
        }
        dp[0] = 0;
        dp[1] = arr[1];
        dp[2] = arr[1]+arr[2];
        for(int i = 3; i<T+1; i++) {
           dp[i] += Math.max(dp[i-2], dp[i-3]+arr[i-1])+arr[i]; 
        }
        
        System.out.println(dp[T]);

       
    }
}
