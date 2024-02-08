package Solving;

import java.util.*;
import java.io.*;

public class baekjoon7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Map<String,String> map = new HashMap<>();
        for(int i = 0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }
        List<String> list = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key).equals("enter")) {
                list.add(key);
            }
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        for(int i = 0; i<list.size(); i++) {
            sb.append(list.get(i)+"\n");
        }
        System.out.println(sb);
    }
}
