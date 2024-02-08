package Solving;

import java.util.*;
import java.io.*;

public class baekjoon18870 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        int[] rank = new int[T];
        for(int i = 0; i<T; i++) {
            int num = Integer.parseInt(st.nextToken()); 
            arr[i] = num;
            rank[i] = num;
        }
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        for(int i : arr) {
            if(map.get(i) == null) {
                map.put(i,cnt);
                cnt++;
            }
        }
        for(int i : rank) {
            sb.append(map.get(i)+ " ");
        }
        System.out.println(sb);
    }
}
