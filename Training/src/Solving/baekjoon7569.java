package Solving;

import java.util.*;
import java.io.*;

public class baekjoon7569 {
    static int[][][] arr;
    static Queue<int[]> q = new LinkedList<>();
    static int Y,X,Z,temp;
    static int[] dz = {0,0,0,0,1,-1};
    static int[] dy = {0,0,1,-1,0,0};
    static int[] dx = {1,-1,0,0,0,0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        Z = Integer.parseInt(st.nextToken());
        arr = new int[Z][Y][X];
        for(int i = 0; i<Z; i++) {
            for(int j = 0; j<Y; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k<X; k++) {
                    arr[i][j][k] = Integer.parseInt(st.nextToken());
                    if(arr[i][j][k] == 1) q.add(new int[]{i,j,k});
                }
            }
        }
        BFS();
        System.out.println();
        for(int i = 0; i<Z; i++) {
            for(int j = 0; j<Y; j++) {
                for(int k = 0;k<X; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
        }

        int max = 0;
        for(int i = 0; i<Z; i++) {
            for(int j = 0; j<Y; j++) {
                for(int k = 0;k<X; k++) {
                    if(arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    if(arr[i][j][k] >=1) {
                        max = Math.max(max,arr[i][j][k]);
                    }

                }
            }
        }
        System.out.println(max-1);
    }
    public static void BFS() {
        while(!q.isEmpty()) {
            int[] t= q.poll();
            int z = t[0];
            int y = t[1];
            int x = t[2];
            
            for(int i =0; i<6; i++) {
                int nz = z + dz[i];
                int ny = y + dy[i];
                int nx = x + dx[i];
                if(nz<0 || ny<0 || nx<0 || nz >=Z || ny>=Y || nx>=X) {
                    continue;
                }
                if(arr[nz][ny][nx] == 0) {
                    arr[nz][ny][nx] = arr[z][y][x] +1;
                    q.add(new int[]{nz,ny,nx});    
                }
            }
        }


    }
}
