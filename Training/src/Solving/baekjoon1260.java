package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1260 {
    static boolean[] visited;
    static int node, line, start;
    static int[][] edge;
    static Queue<Integer> q = new LinkedList<>();
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        visited = new boolean[node+1];
        edge = new int[node+1][node+1];
        for(int i = 0 ; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            edge[A][B] = edge[B][A] = 1;
        }
        
        DFS(start);
        visited = new boolean[node+1];
        sb.append("\n");
        BFS(start);
        System.out.println(sb);
    }

    public static void DFS(int start) {
        sb.append(start+" ");
        visited[start] = true;

        for(int i = 1; i<=node; i ++) {
            if(edge[start][i] == 1 && !visited[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int start) {
        q.add(start);
        
        visited[start] = true;
        while(!q.isEmpty()) {
            int curNode = q.poll();
            sb.append(curNode+" ");
            for(int i = 1; i<=node; i++) {
                if(edge[curNode][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

}