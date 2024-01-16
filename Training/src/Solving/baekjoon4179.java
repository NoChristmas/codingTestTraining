package Solving;

import java.util.*;
import java.io.*;

public class baekjoon4179 {
    static char[][] maze;
    static Queue<int[]> jq = new LinkedList<>();
    static Queue<int[]> fq = new LinkedList<>();
    static int[][] arr;
    static int Y,X;
    static int[] dy = {0,0,1,-1};
    static int[] dx = {1,-1,0,0}; 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        X = Integer.parseInt(st.nextToken());
        Y = Integer.parseInt(st.nextToken());
        maze = new char[Y][X];
        arr = new int[Y][X];
        //BFS 세팅
        for(int i = 0; i<Y; i++) {
            maze[i] = br.readLine().toCharArray();
            for(int j = 0; j<X; j++) {
                if(maze[i][j] == 'J') {
                    arr[i][j] = 1;
                    jq.add(new int[]{i,j});
                } else if(maze[i][j] == 'F') {
                    arr[i][j] = -2;
                    fq.add(new int[]{i,j});
                } else if (maze[i][j] == '.') {
                    arr[i][j] = 0;
                } else { 
                    arr[i][j] = -1;
                }
            }
        }
        //동시에 돌리는게 관건
        int answer = 0;
        while(true) {
            answer++; //턴 카운트
            //불부터 돌려야됨 (불이 턴이 지나면서 벽을 세운다고 보면 됨)
            int fs = fq.size(); //사이즈로 핸들링 하는 이유는
            while(fs>0) {
                fs--; //한턴당 상하좌우 활성화된 좌표만큼만 q를 빼기 위함
                int[] t = fq.poll();
                int y = t[0];
                int x = t[1];
                for(int i = 0; i<4; i++) {
                    int ny = y+dy[i];
                    int nx = x+dx[i];
                    if(ny>=0 || nx>=0 || ny<Y || nx<X || arr[ny][nx] >= 0) {//길은 다 잡아먹음
                        fq.add(new int[]{ny,nx});
                        arr[ny][nx] = arr[y][x] -2;
                    }
                }
            }
            //Escape BFS
            int js = jq.size();
            while(js>0) {
                js--;
                int[] t = jq.poll();
                int y = t[0];
                int x = t[1];
                for(int i = 0; i<4; i++) {
                    int ny = y+dy[i];
                    int nx = x+dx[i];
                    if(ny < 0 || nx < 0 || ny >=Y || nx >=X) {//길밖으로 벗어나면 승리하며 시간출력
                        System.out.println(answer);
                        return;
                    }
                    if(arr[ny][nx] == 0) { //밖으로 못벗어났기때문에 길에다가 영역표시
                        jq.add(new int[]{ny,nx});
                        arr[ny][nx] = 1;
                    }
                }
            }
            if(jq.isEmpty()) { //근데 더이상 갈길이 없는 상태가 되면 사망
                System.out.println("IMPOSSIBLE");
                return;
            }
        }
    }
}