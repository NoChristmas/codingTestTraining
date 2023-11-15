package Solving;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;




public class number1926 {
    public static class Pair {
        int x, y;
        
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        
        public int getX(){
            return x;
        }
        public int getY(){
            return y;
        }
        public void setX(int x){
            this.x = x;
        }
        public void setY(int y){
            this.y = y;
        }
        
    }

    static int n,m;
    static int[][] arr;
    static boolean[][] visit;
    static int[] dx;
    static int[] dy;
    static Queue<Pair> qu;


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());        

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n][m];
        visit = new boolean[n][m];
        qu = new LinkedList<>();
        
        dx = new int[]{1,0,-1,0};
        dy = new int[]{0,1,0,-1};

        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        //세팅 끝 시작
        int count = 0;
        int area = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                // 0이거나 방문한 적이 있으면 생략.
                if(arr[i][j]==0 || visit[i][j]){
                    continue;
                }
                count++; //1이고 방문을 하지 않았으므로 시작점
                qu.offer(new Pair(i,j)); //큐에 좌표를 입력
                visit[i][j] = true; //방문 처리
                area = 0; //0이면 그림이 끊어졌으므로 area = 0!

                while(!qu.isEmpty()){
                    Pair p = qu.poll();
                    area++; //넓이 +1
                    for(int k = 0; k<4; k++){}
                }
            }
        }
        
    }
}
