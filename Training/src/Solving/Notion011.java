package Solving;

import java.util.*;
import java.io.*;

public class Notion011 {
    static int[][] arr;
    static boolean[][] visited;
    static int cnt;
    static int maxSquare;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        arr = new int[A][B];
        visited = new boolean[A][B];

        for(int i = 0; i<A; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<B; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cnt = 0;
        maxSquare = 0;
        int cntSquare = 0;
        for(int i = 0; i<A; i++) {
            for(int j = 0; j<B; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;
                    cntSquare++;
                    DFS(i,j);
                    maxSquare = Math.max(cnt, maxSquare);
                }
            }
        }
        System.out.println(cntSquare);
        System.out.println(maxSquare);
    }
    
    static void DFS(int X, int Y) {
        if(X < 0 || Y < 0 || X >= arr.length || Y >= arr[0].length || visited[X][Y] || arr[X][Y] == 0) {
            return;
        }
        visited[X][Y] = true;
        cnt++;
        DFS(X+1,Y);
        DFS(X,Y+1);
        DFS(X-1,Y);
        DFS(X,Y-1);
        
        
    }
}
