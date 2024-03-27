package Solving;

import java.util.*;
import java.io.*;

public class baekjoon27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N == 0 || N == 1) {
            System.out.println(1);
            return;
        }
        long[] sum = new long[N+1];
        sum[0] = 0;
        sum[1] = 1;
        for(int i = 2; i<=N; i++) {
            sum[i] = sum[i-1]*i;
        }

        System.out.println(sum[N]);
    }
}
