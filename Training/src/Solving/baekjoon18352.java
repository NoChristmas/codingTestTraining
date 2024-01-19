package Solving;

import java.util.*;
import java.io.*;

public class baekjoon18352 {
    static class Edge2 implements Comparable<Edge2>{
        int end, weight;
        public Edge2(int end, int weight) {
            this.end = end;
            this.weight =weight;
        }
        @Override
        public int compareTo(Edge2 e) {
            return this.weight - e.weight;
        }
    } 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[node+1];
        int[] res = new int[node+1];
        List<Edge2>[] list = new List[node+1];
        
        for(int i =1; i<=node; i++) {
            res[i] = Integer.MAX_VALUE;
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            list[A].add(new Edge2(B,1));
        }

        PriorityQueue<Edge2> pq = new PriorityQueue<>();
        pq.add(new Edge2(start,0));
        res[start] = 0;
        while(!pq.isEmpty()) {
            Edge2 now = pq.poll();
            if(visited[now.end]) {
                continue;
            }
            visited[now.end] = true;
            for(int i =0; i<list[now.end].size(); i++) {
                Edge2 next = list[now.end].get(i);
                if(!visited[next.end] && now.weight + 1 < res[next.end]) {
                    res[next.end] = now.weight +1;
                    pq.add(new Edge2(next.end, res[next.end]));
                }
            }
        }
        int cnt = 0;
        for(int i =1; i<res.length; i++) {
            if(res[i] == target) {
                cnt++;
                System.out.println(i);
            }
        }
        if(cnt == 0) {
            System.out.println(-1);
        }
    }
}