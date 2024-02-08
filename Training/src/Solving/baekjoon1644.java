package Solving;

import java.util.*;
import java.io.*;

public class baekjoon1644 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] prime = new boolean[(int) Math.sqrt(4_000_000)+1];
        prime[0] = prime[1] = true;
        for(int i = 2; i<prime.length; i++) {
            if(prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i) {
                prime[j] = true;
            }
        }
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int cnt = 0;
        
        while(true) {
            
            for(int i = 2; i<=N; i++) {
                if(!prime[i]) {
                    sum += i;
                }
                if(sum == N) {
                    cnt++;
                }
                if(sum > N) {
                    break;
                }
            }
            break;
        }
        System.out.println(cnt);
    }
}
