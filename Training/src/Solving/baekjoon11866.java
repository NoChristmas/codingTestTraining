package Solving;

import java.util.*;
import java.io.*;

public class baekjoon11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 1; i<=N; i++) {
            q.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!q.isEmpty()) {
            for(int i = 0; i< K-1; i++) {
                q.offer(q.poll());
            }
            System.out.println(q.poll());
        }
        
    }
}
