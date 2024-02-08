package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        //듣도 못한 양반
        for(int i = 0; i<N; i++) {
            map.put(br.readLine(),1);
        }
        //보도 못한 양반
        for(int i = 0; i<M; i++) {
            String name = br.readLine();
            map.put(name,map.getOrDefault(name,0)+1);
        }
        int cnt = 0;
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key) >=2) {
                cnt++;
                list.add(key);
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        for(int i = 0; i<list.size(); i++) {
            sb.append(list.get(i)+"\n");
        }
        System.out.println(cnt);
        System.out.println(sb);
    }
}
