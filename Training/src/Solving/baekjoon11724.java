package Solving;

import java.util.*;
import java.io.*;

public class baekjoon11724 {
    static int node,line,res;
    static int[][] edge;
    static boolean[] visited;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node =Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        edge = new int[node+1][node+1];
        visited = new boolean[node+1];
        
        for(int i =0; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            edge[A][B] = edge[B][A] = 1;
        }

        BFS();
    }

    public static void BFS(){
        for(int start = 1; start<=node; start++) {
            if(!visited[start]) {
                visited[start] = true;
                res++;
                q.add(start);
            }
            while(!q.isEmpty()) {
                int curNode = q.poll();
                for(int end = 1; end<=node; end++) {
                    if(edge[curNode][end] == 1 && !visited[end]) {
                        visited[end] = true;
                        q.add(end);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
