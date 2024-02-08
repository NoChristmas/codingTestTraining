package Solving;

import java.util.*;
import java.io.*;

public class baekjoon10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Map<Integer,Integer> map = new HashMap<>();

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++) {
            map.put(Integer.parseInt(st.nextToken()),0);
        }
        
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i<N; i++) {
            if(map.get(Integer.parseInt(st.nextToken())) != null) {
                sb.append("1"+" ");
            } else {
                sb.append("0"+" ");
            }
        }
        System.out.println(sb);
    }
}
