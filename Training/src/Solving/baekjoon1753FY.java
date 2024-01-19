package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1753FY {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int line = Integer.parseInt(st.nextToken());
        int begin = Integer.parseInt(br.readLine());
        int[][] arr = new int[node+1][node+1];

        for(int i =1; i<=node; i++) {
            for(int j = 1; j<=node; j++) {
                if(i == j) {
                    arr[i][j] = 0;
                    continue;
                }
                arr[i][j] = 500000;
            }
        }

        for(int i =0; i<line; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            arr[A][B] =  cost;
        }

        
        
        for(int mid = 1; mid<=node; mid++) {
            for(int start = 1; start<=node; start++) {
                for(int end =1; end<=node; end++) {
                    if(start != end && start != mid && end != mid) {
                        arr[start][end] = Math.min(arr[start][end], arr[start][mid]+arr[mid][end]);
                    } 
                }
            }
        }

        for(int i = 1; i<=node; i++) {
            if(arr[begin][i] == 500000) {
                System.out.println("INF");
            } else {
                System.out.println(arr[begin][i]);
            }
        }
    }
}
