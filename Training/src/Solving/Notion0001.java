package Solving;

import java.util.*;
import java.io.*;

public class Notion0001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        char[][] friends = new char[N][N];
        int[][] arr = new int[N][N];

        for(int i = 0; i<N; i++) {
            friends[i] = br.readLine().toCharArray();

            for(int j =0; j<N; j++) {
                if(friends[i][j] == 'Y') {
                    arr[i][j] = 1;
                } else if(friends[i][j] == 'N') {
                    arr[i][j] = Integer.MAX_VALUE/2;
                }
            }
        }

        for(int mid = 0; mid < N; mid ++) {
            for(int start = 0; start < N; start++) {
                for(int end = 0; end < N; end++) {
                     arr[start][end] = Math.min(arr[start][end], arr[start][mid]+ arr[mid][end]);
                }
            }
        }
        
        int max = 0;
        for(int start = 0; start < N; start++) {
            int cnt = 0;    
            for(int end = 0; end < N; end ++) {
                if(start == end) continue;
                if(0 < arr[start][end] && arr[start][end] <=2) {
                    cnt ++;
                }
            }
            max = Math.max(cnt, max);
        }
        System.out.println(max);
    }
}