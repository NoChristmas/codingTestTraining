package Solving;

import java.util.*;
import java.io.*;

public class Notion0002 {
    static int[][] arr;
    static boolean[][] visited;
    static int maxValue = 0;
    static int area = 0;
    static int cnt = 0;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int Y = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
       
        arr = new int[Y][X];
        visited = new boolean[Y][X];
        
        for(int i = 0; i<Y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<X; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());        
            }
        }
        
        for(int i = 0; i<Y; i++) {
            for(int j = 0; j<X; j++) {
                if(arr[i][j] == 1 && !visited[i][j]) {
                    cnt = 0;
                    dfs(i,j);
                    area++;
                    maxValue = Math.max(cnt, maxValue);
                }
            }
        }
        System.out.println(area);
        System.out.println(maxValue);
    }

    public static void dfs(int Y, int X) {
        if(Y < 0 || X < 0 || Y >= visited.length || X >= visited[Y].length || visited[Y][X] || arr[Y][X] == 0 ) {
            return;
        }
        visited[Y][X] = true;
        cnt++;

        dfs(Y+1, X);
        dfs(Y, X+1);
        dfs(Y-1, X);
        dfs(Y, X-1);
    }
}
