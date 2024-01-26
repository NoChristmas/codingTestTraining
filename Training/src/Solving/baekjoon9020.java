package Solving;

import java.util.*;
import java.io.*;

public class baekjoon9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[100];
        visited[0] = visited[1] = true;
        for(int i = 2; i<=Math.sqrt(visited.length); i++) {
            if(visited[i]) continue;
            for(int j = i*i; j<visited.length; j += i) {
                visited[j] = true;
            }
        }
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++) {
            int num = Integer.parseInt(br.readLine());
            int prenum = num/2;
            int postnum = num/2;
            while(true) {
                if(!visited[prenum] && !visited[postnum]) {
                    System.out.println(prenum + " " + postnum);
                    break;
                }
                prenum--;
                postnum++;
            }
        }
    }
}
