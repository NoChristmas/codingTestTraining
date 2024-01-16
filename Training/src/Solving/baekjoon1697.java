package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1697 {
    static int[] dx = {-1,1,2};
    static boolean[] visited;
    static int[] arr;
    static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        
        if(start == target) {
            System.out.println(0);
            return;
        }
        visited = new boolean[((int) Math.pow(10,5))+1];
        arr = new int[(int) Math.pow(10,5)+1];
        
        visited[start] = true;
        arr[start] = 0;
        q.add(start);
        
        while(!q.isEmpty()) {
            int A = q.poll();
            int na = 0;
            for(int i = 0; i<3; i++) {
                if(i<=1) {
                    na = A + dx[i];
                } else {
                    na = A * dx[i];
                } 
                if(na<0 || na>=((int)Math.pow(10,5))+1) {
                    continue;
                }
                if(visited[na]) {
                    continue;
                }
                visited[na]= true;
                arr[na] = arr[A]+1;
                q.add(na);
            }
        }
        System.out.println(arr[target]);
    }
}
