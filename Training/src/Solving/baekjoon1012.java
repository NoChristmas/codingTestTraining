package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1012 {
    static int[][] arr;
    static boolean[][] visited;
    static Queue<int[]> q = new LinkedList<>();
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int result = 0;
        for(int i = 0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            arr = new int[Y][X];
            visited = new boolean[Y][X];
            
            for(int j = 0; j<K; j++) {
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                arr[B][A] = 1;
            }
            result = 0;
            for(int j =0; j<Y; j++) {
                for(int k =0; k<X; k++) {
                    if(arr[j][k] == 1 && !visited[j][k]) {
                        q.add(new int[]{j,k});
                        visited[j][k] = true;
                        result++;
                        while(!q.isEmpty()) {
                            int[] t = q.poll();
                            int y = t[0];
                            int x = t[1];
                            for(int z = 0; z<4; z++) {
                                int ny = y+dy[z];
                                int nx = x+dx[z];
                                if(ny<0||nx<0||ny>=Y||nx>=X) {
                                    continue;
                                }
                                if(visited[ny][nx] || arr[ny][nx] == 0) {
                                    continue;
                                }
                                visited[ny][nx] = true;
                                q.add(new int[]{ny,nx});
                            }
                        }
                    }
                }
            }
            System.out.println(result);
        }

    }
}
