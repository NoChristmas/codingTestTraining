package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2468 {
    static int N, res, realResult;
    static boolean[][] visited;
    static int[][] arr;
    static int[][] san;
    static int[] dx = {1,-1,0,0};
    static int[] dy = {0,0,-1,1};
    static Queue<int[]> q;;
    static StringTokenizer st;
    static BufferedReader br;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<N; j++) {
                int num = Integer.parseInt(st.nextToken());
                arr[i][j] = num;
            }
        }
        //원본 끝

        realResult = -1;
        for(int i =0; i<=100; i++) { //물이 없을 수도 있음...
            visited = new boolean[N][N];
            res = 0;
            setting(i);
            for(int j = 0; j<N; j++) {
                for(int k = 0; k<N; k++) {
                    if(san[j][k] != -1 && !visited[j][k]) {
                        res++;
                        BFS(j,k);
                    }
                }
            }
            realResult = Math.max(res,realResult);
        }
        System.out.println(realResult);
    }

    public static void setting(int height) {
        san = arr;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(san[i][j] <= height) {
                    san[i][j] = -1;
                }
            }
        }
    }

    public static void BFS(int b, int a) {
        q = new LinkedList<>();
        q.add(new int[]{b,a});
        visited[b][a] = true;
        while(!q.isEmpty()) {
            int[] t = q.poll();
            int y = t[0];
            int x = t[1];
            for(int i = 0; i<4; i++) {
                int ny = dy[i]+y;
                int nx = dx[i]+x;
                if(ny < 0 || nx <0 || ny>=N || nx>=N || visited[ny][nx] || san[ny][nx] == -1) {
                    continue;
                }
                q.add(new int[]{ny,nx});
                visited[ny][nx] = true;
            }
        }
    }
}
