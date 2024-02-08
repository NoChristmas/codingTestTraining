package Solving;

import java.util.*;
import java.io.*;

public class Test1000 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true) {
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            boolean[] prime = new boolean[2*N+1];
            prime[0] = true;
            prime[1] = true;

            for(int i = 2; i <=Math.sqrt(2*N+1); i++) {
                if(prime[i]) continue;
                for(int j = i*i; j<prime.length; j = j+i) {
                    prime[j] = true;
                }
            }

            int cnt = 0;
            for(int i = N+1; i<prime.length; i++) {
                if(!prime[i]) {
                    cnt++;
                }
            }
            System.out.println(cnt);        
        }
        
    }
}
