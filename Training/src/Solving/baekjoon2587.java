package Solving;

import java.io.*;
import java.util.*;

public class baekjoon2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<5; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        list.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        int child = 0;


        for(int i = 0; i<5; i++) {
            child += (list.get(i));            
        }

        System.out.println(child/5);
        System.out.println(list.get(2));
    }
}
