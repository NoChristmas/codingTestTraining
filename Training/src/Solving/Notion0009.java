package Solving;

import java.util.*;
import java.io.*;

public class Notion0009 {
    static boolean[][] visited;
    static int[][] line;
    static StringTokenizer st;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        line = new int[N+1][N+1];
        visited = new boolean[N+1][N+1];
        result = new int[N+1];
        for(int i = 0; i<N-1; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            line[A][B] = 1;
            line[B][A] = 1;    
        }
        DFS(1,N);
        
        for(int i = 1; i<N; i++) {
            System.out.println(result[i]);
        }
    }
    public static void DFS(int start, int end) {
        
        if(visited[start][end]) {
            result[start] = start;
            return;
        }

        visited[start][end] = true;

        for(int i = start; i<=end; i++) {
            DFS(start,end);
        }
    }
}
