package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2178 {
    static boolean[][] visited;
    static int[][] arr;
    static int Y, X;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static Queue<int[]> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        
        visited = new boolean[Y][X];
        arr = new int[Y][X];
        
        for(int i = 0; i<Y; i++) {
            String temp = br.readLine();
            for(int j = 0; j<X; j++) {
                arr[i][j] = temp.charAt(j) - '0';
            }
        }
        visited[0][0] = true;
        BFS(0,0);
        System.out.println(arr[Y-1][X-1]);
    }

    public static void BFS(int y, int x) {
        q.add(new int[]{y,x});
        while(!q.isEmpty()) {
            int[] t = q.poll();
            y = t[0];
            x = t[1];
            for(int i = 0; i<4; i++) {
                int ny = y+dy[i];
                int nx = x+dx[i];
                if(ny >= Y || nx >=X || ny<0 || nx <0 || visited[ny][nx] || arr[ny][nx] == 0) {
                    continue;
                }
                q.add(new int[]{ny,nx});
                visited[ny][nx] = true;
                arr[ny][nx] = arr[y][x] + 1;
            }
        }
    }
}
