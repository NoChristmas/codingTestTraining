package Solving;

import java.util.*;
import java.io.*;

public class baekjoon14502 {
    static int[][] arr;
    static int Y,X, res;
    static int[] dy = {1,-1,0,0};
    static int[] dx = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Y = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());
        arr = new int[Y][X];
        res = 0;
        for(int i = 0; i<Y; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<X; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        DFS(0);
        System.out.println(res);
    }
    
    public static void DFS(int wallCnt) {
        if(wallCnt >= 3) {
            //벽 3개 쌓았으므로 바이러스 퍼뜨리는 BFS 시작
            BFS();
            return;
        }
        //DFS를 세우는 모든 경우의 수이며 3일때 다음 BFS 시작
        for(int i = 0; i<Y; i++) {
            for(int j =0; j<X; j++) {
                if(arr[i][j] == 0) {
                    arr[i][j] = 1;
                    DFS(wallCnt+1);
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void BFS() {
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i<Y; i++) {
            for(int j = 0; j<X; j++) {
                if(arr[i][j] == 2) {
                    q.add(new int[]{i,j});
                }
            }
        }
        int[][] arr_c = new int[Y][X];
        for(int i =0; i<Y; i++) {
            arr_c[i] = Arrays.copyOfRange(arr[i],0,X);
        }
        while(!q.isEmpty()) {
            int[] t = q.poll();
            int y = t[0];
            int x = t[1];
            for(int i = 0; i<4; i++) {
                int ny = y+dy[i];
                int nx = x+dx[i];
                if(ny>=0 && nx>=0 & ny<Y & nx<X && arr_c[ny][nx] == 0) {
                    q.add(new int[]{ny,nx});
                    arr_c[ny][nx] = 2;
                }
            }
        }
        
        int temp = 0;
        for(int i =0; i<Y;i++) {
            for(int j =0; j<X; j++) {
                if(arr_c[i][j] == 0) {
                    temp++;
                }
            }
        }
        res = Math.max(temp,res);
    } 
}
