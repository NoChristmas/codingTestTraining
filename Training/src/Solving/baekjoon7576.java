package Solving;

import java.util.*;
import java.io.*;

public class baekjoon7576 {
    static Queue<int[]> q = new LinkedList<>();
    static int[][] edge;
    static int X,Y;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        
        edge = new int[Y][X];
        for(int i = 0; i<Y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<X; j++) {
                edge[i][j] = Integer.parseInt(st.nextToken());
                if(edge[i][j] == 1) {
                    q.add(new int[]{i,j});
                }
            }
        }

        while(!q.isEmpty()) {
            int[] t = q.poll();
            int y = t[0];
            int x = t[1];
            for(int i = 0; i<4; i++) {
                int ny = y+dy[i];
                int nx = x+dx[i];
                if(ny <0 || nx <0 || ny>=Y || nx >=X) continue;
                
                if(edge[ny][nx] == 0) {
                    edge[ny][nx] += edge[y][x] +1;
                    q.add(new int[]{ny,nx});
                }
                
            }
        }
        int max = 0;
        for(int i = 0; i<Y; i++) {
            for(int j = 0; j<X; j++) {
                if(edge[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max,edge[i][j]);
            }
        }

        System.out.println(max-1);
          
    }
}