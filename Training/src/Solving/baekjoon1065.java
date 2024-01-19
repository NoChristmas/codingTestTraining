package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        
        if(A<100) {
            System.out.println(A);
            return;
        }
        int cnt = 99;
        for(int i = 100; i<=A; i++) {
            String[] temp = String.valueOf(i).split("");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            int z = Integer.parseInt(temp[2]);
            if((x-y) == (y-z)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
