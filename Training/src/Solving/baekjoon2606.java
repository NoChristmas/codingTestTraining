package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2606 {
    static boolean[] visited;
    static int[][] edge;
    static int node,line, cnt;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        visited = new boolean[node+1];
        edge = new int[node+1][node+1];

        for(int i = 0; i<line; i++) {  
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            edge[A][B] = edge[B][A] = 1;
        }
        cnt = 0;
        BFS(1);
        System.out.println(cnt);
    }

    public static void BFS(int start) {
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()) {
            int curNode = q.poll(); 
            
            for(int i =1; i<=node; i++) {
                if(edge[curNode][i] == 1 && !visited[i]) {
                    cnt++;
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}