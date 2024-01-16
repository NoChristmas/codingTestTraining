package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10026 {
    static char[][] ch;
    static int[][] arr;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int N, temp, res;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        
        ch = new char[N][N];
        arr = new int[N][N];
        visited = new boolean[N][N];
        for(int i = 0; i<N; i++) {
            ch[i] = br.readLine().toCharArray();
            for(int j=0; j<N; j++) {
                if(ch[i][j] == 'R') { //Red
                    arr[i][j] = 1;
                } else if(ch[i][j] == 'G') { //Green
                    arr[i][j] = 2;
                } else { //Blue
                    arr[i][j] = 3;
                }
            }
        }
        res = 0;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(!visited[i][j]) {
                    res++;
                    BFS(i,j);
                }
            }
        }
        System.out.print(res+ " ");
        visited = new boolean[N][N];
        for(int i = 0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(ch[i][j] == 'R' || ch[i][j] == 'G' ) { //Red Or Grren
                    arr[i][j] = 1;
                } else { //Blue
                    arr[i][j] = 2;
                }
            }
        }
        res = 0;
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                if(!visited[i][j]) {
                    res++;
                    BFS(i,j);
                }
            }
        }
        System.out.println(res);
    }
    public static void BFS(int b, int a) {
        visited[b][a] = true;
        int temp = arr[b][a];
        q.add(new int[]{b,a});
        while(!q.isEmpty()) {
            int[] t = q.poll();
            int y = t[0];
            int x = t[1];
            for(int i =0; i<4; i++) {
                int ny = dy[i]+y;
                int nx = dx[i]+x;
                if(ny<0 || nx<0 || ny>=N || nx>=N || visited[ny][nx]) {
                    continue;
                }
                if(arr[ny][nx] == temp) {
                    q.add(new int[]{ny,nx});
                    visited[ny][nx] = true;
                }
            }
        }
    }
}
