package BFSDFS;

import java.util.*;
import java.io.*;

public class baekjoon2606 {
    static int[][] edge;
    static boolean[] visited;
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());
        edge = new int[node+1][node+1];

        for(int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            edge[A][B] = edge[B][A] = 1;    
        }

        DFS(1);
        
    }

    public static void DFS(int start) {
        visited[start] = true;
        
    }
}
