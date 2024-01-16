package Solving;

import java.util.*;
import java.io.*;

public class baekjoon19637 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] title = new String[N];
        int[] score = new int[N];
        
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            title[i] = st.nextToken();
            score[i] = Integer.parseInt(st.nextToken());
        }
        //이진탐색 부분
        for(int i = 0; i<M; i++) {
            int num = Integer.parseInt(br.readLine());
            int start = 0;
            int end = N-1;
            int mid = (start+end)/2;
            while(start<=end) {
                mid = (start+end)/2;
                if(score[mid] < num) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            sb.append(title[start]+"\n");
        }
        System.out.println(sb);
    }
}
