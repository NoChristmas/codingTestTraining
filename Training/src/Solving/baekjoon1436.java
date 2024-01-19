package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A =Integer.parseInt(br.readLine());
        
        final String SIX = "666";
        int cnt = 0;
        for(int i = 0; i<=10_000_000; i++) {
            if(String.valueOf(i).contains(SIX)) {
                cnt++;
            }
            if(cnt == A) {
                System.out.println(i);
                break;
            }
        }
    }
}
