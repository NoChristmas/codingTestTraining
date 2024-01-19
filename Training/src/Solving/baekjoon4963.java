package Solving;

import java.io.*;
import java.util.*;

public class baekjoon4963 {
    static int X,Y,cnt;
    static Queue<int[]> q;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dy = {0,0,1,-1,1,1,-1,-1};
    static int[] dx = {1,-1,0,0,1,-1,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Integer> list = new LinkedList<>();
        while(true) {
            st = new StringTokenizer(br.readLine());
            X = Integer.parseInt(st.nextToken());
            Y = Integer.parseInt(st.nextToken());
            if(Y == 0 && X == 0) {
                break;
            }
            cnt = 0;
            q = new LinkedList<>();
            arr = new int[Y][X];
            visited = new boolean[Y][X];
            
            for(int i =0; i<Y; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j=0; j<X; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i =0; i<Y; i++) {
                for(int j=0; j<X; j++) {
                    if(arr[i][j] == 1 && !visited[i][j]) {
                        visited[i][j] = true;
                        cnt++;
                        q.add(new int[]{i,j});
                        BFS();
                    }
                }
            }
            System.out.println(cnt);
            
        }
    }
    
    public static void BFS() {
        while(!q.isEmpty()) {
            int[] t = q.poll();
            int y = t[0];
            int x = t[1];
            for(int i =0; i<8; i++) {
                int ny = dy[i] + y;
                int nx = dx[i] + x;
                if(ny>=0 && nx >= 0 && ny<Y && nx<X && !visited[ny][nx] && arr[ny][nx] == 1) {
                    visited[ny][nx] = true;
                    q.add(new int[]{ny,nx});
                }
            }
        }
    }
}
