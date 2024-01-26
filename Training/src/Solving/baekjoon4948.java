package Solving;

import java.util.*;
import java.io.*;

public class baekjoon4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) return;
            int cnt = 0;
            boolean[] visited = new boolean[2*N + 1];
            visited[0] = visited[1] = true;
            
            for(int i = N+1; i<=2*N; i++) {
                if(i == 2) {
                    cnt++;
                    continue;
                }
                for(int j = 2; j<=Math.sqrt(2*N); j++) {
                    if(i%j == 0) {
                        visited[i] = true;
                        break;
                    }
                }
                if(!visited[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }
}
