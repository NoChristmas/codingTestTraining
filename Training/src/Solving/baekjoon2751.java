package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<T; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        
        for(int i = 0; i<list.size(); i++) {
            sb.append(list.get(i));
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
}
