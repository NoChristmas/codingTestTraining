package Solving;

import java.util.*;
import java.io.*;

public class baekjoon2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));    
        }
        Collections.sort(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
