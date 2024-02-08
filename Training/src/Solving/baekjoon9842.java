package Solving;

import java.util.*;
import java.io.*;

public class baekjoon9842 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean[] prime = new boolean[1_000_000+1];
        prime[0] = prime[1] = true;
        for(int i = 2; i<=Math.sqrt(1000000+1); i++) {
            if(!prime[i]) {
                for(int j = i*i; j<prime.length; j +=i) {
                    prime[j] = true;
                }
            }
        }
        int cnt = 0;
        for(int i = 2; i<= 10000; i++) {
            if(!prime[i]) {
                cnt++;
                if(cnt == num) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
