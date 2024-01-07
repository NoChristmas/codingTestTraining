package Solving;

import java.io.*;

public class Notion0010 {
    static char[][] friends;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        friends = new char[N][N];
        arr = new int[N][N];
        //세팅 하는 과정
        for(int i = 0; i<N; i++) {
            friends[i] = br.readLine().toCharArray();
            for(int j = 0; j<N; j++) {
                if(friends[i][j] == 'Y') {
                    arr[i][j] = 1;
                } else if(friends[i][j] == 'N') {
                    arr[i][j] = Integer.MAX_VALUE/2;
                }
            }
        }
        
        //초기화 하는 과정
        for(int i = 0; i<N; i++) {
            for(int j = 0; j<N; j++) {
                for(int k = 0; k<0; k++) {
                    arr[j][k] = Math.min(arr[j][k], arr[j][i] + arr[i][k]);
                }
            }
        }
        
        int max = 0;
        for(int i = 0; i<N; i++) {
            int cnt = 0;
            for(int j =0; j<N; j++) {
                if(0 < arr[i][j] && arr[i][j] <= 2) {
                    cnt++;
                }
            }
            max = Math.max(cnt, max);
        }

        System.out.println(max);
    }    
}
