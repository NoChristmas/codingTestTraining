package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        int cnt = 0;
        for(int i = 0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for(int j = y; j<y+10; j++) {
                for(int k = x; k<x+10; k++) {
                    if(arr[j][k] == 0) {
                        arr[j][k] = 1;
                        cnt++;
                    } 
                }
            }
        }
        
        System.out.println(cnt);
    }
}
