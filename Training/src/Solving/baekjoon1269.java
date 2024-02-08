package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<M; i++) {
            map.put(Integer.parseInt(st.nextToken()),1);
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int cnt = 0;
        for(int i : map.keySet()) {
            if(map.get(i) == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
