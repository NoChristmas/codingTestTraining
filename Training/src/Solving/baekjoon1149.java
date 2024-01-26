package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1149 {
    static int R = 0;
    static int G = 1;
    static int B = 2;
    static int[][] cost;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        cost = new int[N][3];
        for(int i =0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<3; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 1; i<N; i++) {
            cost[i][R] += Math.min(cost[i-1][G],cost[i-1][B]);
            cost[i][G] += Math.min(cost[i-1][R],cost[i-1][B]);
            cost[i][B] += Math.min(cost[i-1][R],cost[i-1][G]);
        }

    }
}
