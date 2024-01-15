package Solving;

import java.util.*;
import java.io.*;

public class baekjoon9881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int[] costs = new int[N/2];
        
    }
}
