package Solving;

import java.util.*;
import java.io.*;

class Node implements Comparable<Node> {
    int end,weight;
    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node n) {
        return this.weight - n.weight;
    }
}

public class baekjoon1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int node = Integer.parseInt(br.readLine());
        int line =  Integer.parseInt(br.readLine());
        
        boolean[] visited = new boolean[node+1];
        List<Node>[] list = new List[node+1];
        int[] result = new int[node+1];

        for(int i = 1; i<=node; i++) {
            result[i] = Integer.MAX_VALUE/2;
            list[i] = new ArrayList<>();
        }
        
        for(int i = 0; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            list[A].add(new Node(B,cost));
        }
        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int endResult = Integer.parseInt(st.nextToken());

        //다익스트라
        PriorityQueue<Node> pq = new PriorityQueue<>();
        result[start] = 0;
        pq.add(new Node(start,0));
        while(!pq.isEmpty()) {
            Node now = pq.poll();
            if(visited[now.end]) continue;
            visited[now.end] = true;
            for(int i =0; i < list[now.end].size(); i++) {
                Node next = list[now.end].get(i);
                if(now.weight + next.weight < result[next.end]) {
                    result[next.end] = now.weight + next.weight;
                    pq.add(new Node(next.end, result[next.end]));
                }
            }
        }
        
        System.out.println(result[endResult]);

    }
}

