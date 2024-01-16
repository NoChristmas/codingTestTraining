package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2667 {
    static boolean[][] visited;
    static char[][] home;
    static int[][] arr;
    static int N, cnt;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();        
        N = Integer.parseInt(br.readLine());
        home = new char[N][N];
        visited = new boolean[N][N];
        arr = new int[N][N];
        for(int i =0; i<N; i++) {
            home[i] = br.readLine().toCharArray();
            for(int j =0; j<N; j++) {
                if(home[i][j] == '1') {
                    arr[i][j] =1;
                }
            }
        }
        cnt =0;
        for(int i = 0; i<N; i++) {
            for(int j =0; j<N; j++) {
                if(!visited[i][j] && arr[i][j] == 1) {
                    cnt++;
                    BFS(i,j);
                }
            }
        }
        System.out.println(cnt);
        
        int temp = 1;
        int tempCnt = 0;
        int[] result = new int[cnt+1];
        while(temp <= cnt) {
            tempCnt =0;
            for(int i =0; i<N; i++) {
                for(int j =0; j<N; j++) {
                    if(arr[i][j] == temp) {
                        tempCnt++;
                    }
                }
            }
            result[temp] = tempCnt;
            temp++;
        }
        if(cnt > 0) {
            Arrays.sort(result);
            for(int i = 1; i<result.length; i++) {
                System.out.println(result[i]);
            }
        } 
    }

    public static void BFS(int b, int a) {
        arr[b][a] = cnt;
        q.add(new int[]{b,a});
        visited[b][a] = true;
        while(!q.isEmpty()) {
            int[] t = q.poll();
            int y = t[0];
            int x = t[1];
            for(int i = 0; i<4; i++) {
                int ny = y+dy[i];
                int nx = x+dx[i];
                if(ny < 0 || nx <0 || ny>=N || nx>=N) {
                    continue;
                }
                if(visited[ny][nx] || home[ny][nx] == '0') {
                    continue;
                }
                visited[ny][nx] = true;
                arr[ny][nx] = cnt;
                q.add(new int[]{ny,nx});
            }
        }
    }
}
