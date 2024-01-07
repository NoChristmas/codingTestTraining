package Solving;

import java.io.*;
public class number1058 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] cost = new int[N][N];

        for(int i = 1; i<=N; i++) {
            char[] str = br.readLine().toCharArray();
            for(int j = 1; j<=N; j++) {
                if(i == j) continue;
                cost[i][j] = str[j-1] == 'Y' ? 1 : Integer.MAX_VALUE;
            }
        }

        for(int stopover = 1; stopover <= N; stopover++) { //경유지
            for(int start = 1; start<=N; start++) { //출발지
                for(int end = 1; end <=N; end++) { //도착지
                    if(start == end) continue;
                    cost[start][end] = Math.min(cost[start][end], cost[start][stopover] + cost[stopover][end]);
                }
            }
        }
        int max = 0;
        
        for(int i = 1; i <=N; i++) {
            int cnt = 0;
            for(int j = 1; j<=N; j++) {
                if(cost[i][j] ==2 || cost[i][j] == 1) {
                    cnt++;
                }
            }
            max = Math.max(max,cnt);
        }
    }  
}
