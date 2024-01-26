package Solving;

import java.io.*;
import java.util.*;

public class baekjoon11657 {
    public static class Bus {
        int start, end, weight;
        public Bus(int start, int end, int weight) {
            this.start = start;
            this.end = end;
            this.weight = weight;
        }
    }
    static Bus[] arr;
    static int[] dist; 
    static int node,line;
    static int max = Integer.MAX_VALUE/2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        
        dist = new int[node+1];
        Arrays.fill(dist,max);
        arr = new Bus[line+1];
        for(int i =0; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            arr[i] = new Bus(A,B,C);
        }
    }

    public static boolean bellmanFord() {
        dist[1] = 0;
        for(int i = 1; i<node; i++) {
            for(int j = 0; j<line; j++) {
                Bus bus = arr[j];
                if(dist[bus.start] != max && dist[bus.end] > dist[bus.start] + bus.weight) {
                    dist[bus.end] = dist[bus.start] + bus.weight;
                }
            }
        }
        //cycle 확인
        for(int i = 0; i<line; i++) {
            Bus bus = arr[i];
            if(dist[bus.start] != max && dist[bus.end] > dist[bus.start] + dist[bus.end]) return false;
        }
        
        return true;
    }
}
