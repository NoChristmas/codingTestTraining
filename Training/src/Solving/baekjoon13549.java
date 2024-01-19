package Solving;

import java.util.*;
import java.io.*;

public class baekjoon13549 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        if(start == target) {
            System.out.println(0);
            return;
        }

        int[] res = new int[100_000+1];
        boolean[] visited = new boolean[100_000+1];
        
        PriorityQueue<Edge1> pq = new PriorityQueue<>();
        pq.add(new Edge1(start,0));
        visited[start] = true;
        
        while(!pq.isEmpty()) {
            Edge1 now  = pq.poll();
            visited[now.node] = true;
            
            if(now.node == target) {
                res[target] = now.time;
                break;
            }
            if(now.node*2 < 100_000+1 && !visited[now.node*2]) {
                pq.add(new Edge1(now.node*2,now.time));
            }
            if(now.node-1 >= 0 && !visited[now.node-1]) {
                pq.add(new Edge1(now.node-1,now.time+1));
            }
            if(now.node+1 < 100_000+1 && !visited[now.node+1]) {
                pq.add(new Edge1(now.node+1,now.time+1));
            }
        }
        System.out.println(res[target]);
    }

    public static class Edge1 implements Comparable<Edge1> {
        int node;
        int time;
        public Edge1(int node, int time) {
            this.node = node;
            this.time = time;
        }
        @Override
        public int compareTo(Edge1 o) {
            return this.time - o.time;
        }
    }
}
