package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        Map<String,Integer> map1 = new HashMap<>();
        Map<Integer,String> map2 = new HashMap<>();
        for(int i = 1; i<=N; i++) {
            String name = br.readLine();
            map1.put(name,i);
            map2.put(i,name);
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<M; i++) {
            String str = br.readLine();
            char ch = (char) (str.charAt(0) - '0');
            if(ch>0 && ch<=9) {
                sb.append(map2.get(Integer.parseInt(str))+"\n");
            } else {
                sb.append(map1.get(str)+"\n");
            }
        }

        System.out.println(sb);
    }
}
