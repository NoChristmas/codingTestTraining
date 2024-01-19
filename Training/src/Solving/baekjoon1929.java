package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[end+1];
        visited[0] = true;
        visited[1] = true;
        
        for(int i = start; i<=end; i++) {
            if(i == 2 || i==3) {
                System.out.println(i);
                continue;
            }

            for(int j = 2; j<=(int) Math.sqrt(i); j++) {
                if(i%j == 0) {
                    visited[i] = true;
                    break;
                }
            }
            if(!visited[i]) {
                System.out.println(i);
            }
        }
    }
}
