package Solving;

import java.util.*;
import java.io.*;

public class Notion0004 {
    static int[][] line;
    static boolean[][] visited;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        
        line = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];
        result = new int[N+1];

        for(int i = 0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            line[A][B] = line[B][A] = 1;
        }
        dfs(1);
    }
    public static void dfs(int index) {
    
    }

}
