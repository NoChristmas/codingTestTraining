package Solving;

import java.util.*;
import java.io.*;

public class baekjoon14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i<M; i++) {
            map.put(br.readLine(),0);
        }
        
        int cnt = 0;
        for(int i = 0; i<N; i++) {
            if(map.get(br.readLine()) != null) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
