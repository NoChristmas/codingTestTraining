package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        List<String> list = new ArrayList<>();
        for(int i = 0; i<T; i++) {
            list.add(br.readLine());
        }
        
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });
        
        for(int i = 0; i<list.size(); i++) {
            String temp = list.get(i);
            if(i>0) {
                if(list.get(i-1).equals(list.get(i))) {
                    continue;
                }
            }
            System.out.println(list.get(i));
        }
    }
}
