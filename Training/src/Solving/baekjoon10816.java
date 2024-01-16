package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++) {
            sb.append(map.getOrDefault(Integer.parseInt(st.nextToken()),0)+" ");
        }
        System.out.println(sb);
    }   
}
